/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Match;
import java.sql.*;
import java.util.ArrayList;
import model.Card;

/**
 *
 * @author MSI GF63
 */
public class MatchDAO extends DAO {

    public MatchDAO() {
        super();
    }

    public boolean addPlayer(int idTournalmentPlayer, int idMatch) {
        String sqlCount = "SELECT COUNT(*) AS total FROM tblMatchPlayer WHERE MatchId = idMatch";
        String sql = "INSERT INTO tblMatchPlayer(Position, Tournalment_PlayerId, MatchId) VALUES(?,?,?)";
        boolean rs = false;
        int currentNumPlayer = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sqlCount);
            ResultSet result = ps.executeQuery();
            currentNumPlayer = result.getInt("total");

            if (currentNumPlayer > 0) {
                ps = con.prepareStatement(sql);
                if (currentNumPlayer != 3) {
                    ps.setInt(1, 4 - currentNumPlayer);
                    ps.setInt(2, idTournalmentPlayer);
                    ps.setInt(3, idMatch);
                    ps.executeUpdate();
                } else {
                    ps.setInt(1, 4);
                    ps.setInt(2, idTournalmentPlayer);
                    ps.setInt(3, idMatch);
                    ps.executeUpdate();
                }
                rs = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean updateMatch(Match m) {
        String sql = "UPDATE tblMatch SET CurrentTurn = ?, IsFinished = ? WHERE id = ?";
        boolean rs = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, m.getCurrentTurn());
            ps.setBoolean(2, m.isIsFinished());
            ps.setInt(3, m.getId());
            ps.executeUpdate();
            rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public Match getCurrentMatch(int idTournalmentPlayer) {
        String sqlIdMatch = "SELECT MatchId FROM tblMatchPlayer WHERE Tournalment_PlayerId = ?";
        String sql = "SELECT * FROM tblMatch WHERE Id = idMatch";
        int idMatch = -1;
        Match rs = new Match();
        try {
            PreparedStatement ps = con.prepareStatement(sqlIdMatch);
            ps.setInt(1, idTournalmentPlayer);
            ResultSet resul = ps.executeQuery();
            if (resul.next()) {
                idMatch = resul.getInt("MatchId");
            }
            if (idMatch > -1) {
                ps = con.prepareStatement(sql);
                resul = ps.executeQuery();
                if (resul.next()) {
                    rs.setId(idMatch);
                    rs.setIsFinished(resul.getBoolean("IsFinished"));
                    rs.setCurrentTurn(resul.getInt("CurrentTurn"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;

    }

    public ArrayList<Card> getListDivCard(int idMatch) {
        String sql = "SELECT * FROM tblCard WHERE MatchId = ?";
        ArrayList<Card> listDivCard = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMatch);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Card c = new Card();
                c.setId(rs.getInt("Id"));
                c.setValue(rs.getInt("Value"));
                c.setSuit(rs.getString("Suit"));
                listDivCard.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDivCard;
    }

}
