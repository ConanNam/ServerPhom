/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Card;
import model.NormalMatch;

/**
 *
 * @author MSI GF63
 */
public class NormalMatchDAO extends DAO{

    public NormalMatchDAO() {
    }
    
     public boolean addPlayer(int idPlayer, int idNormalMatch) {
        String sqlCount = "SELECT COUNT(*) AS total FROM tblNormalMatchPlayer WHERE MatchId = idNormalMatch";
        String sql = "INSERT INTO tblMatchPlayer(Position, PlayerId, NormalMatchId) VALUES(?,?,?)";
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
                    ps.setInt(2, idPlayer);
                    ps.setInt(3, idNormalMatch);
                    ps.executeUpdate();
                } else {
                    ps.setInt(1, 4);
                    ps.setInt(2, idPlayer);
                    ps.setInt(3, idNormalMatch);
                    ps.executeUpdate();
                }
                rs = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean updateNormalMatch(NormalMatch m) {
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

    public NormalMatch getCurrentMatch(int idPlayer) {
        String sqlIdMatch = "SELECT NormalMatchId FROM tblNormalMatchPlayer WHERE PlayerId = ?";
        String sql = "SELECT * FROM tblNormalMatch WHERE Id = idMatch";
        int idMatch = -1;
        NormalMatch rs = new NormalMatch();
        try {
            PreparedStatement ps = con.prepareStatement(sqlIdMatch);
            ps.setInt(1, idPlayer);
            ResultSet resul = ps.executeQuery();
            if (resul.next()) {
                idMatch = resul.getInt("NormalMatchId");
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

    public ArrayList<Card> getListDivCard(int idNormalMatch) {
        String sql = "SELECT * FROM tblCard WHERE NormalMatchId = ?";
        ArrayList<Card> listDivCard = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idNormalMatch);
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
