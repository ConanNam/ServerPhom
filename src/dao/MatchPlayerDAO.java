/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.MatchPlayer;
import java.sql.*;
import java.util.ArrayList;
import model.Card;

/**
 *
 * @author MSI GF63
 */
public class MatchPlayerDAO extends DAO {

    public MatchPlayerDAO() {
        super();
    }

    public boolean eatCard(int idMatchPlayer, Card card) {
        String sql = "INSERT INTO tblHandCard(CardId, MatchPlayerId) VALUES (?,?)";
        boolean rs = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, card.getId());
            ps.setInt(2, idMatchPlayer);
            ps.executeUpdate();
            rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void updateEatenCard(Card card, int idMatchPlayer) {
        String sql = "UPDATE tblPublicCard SET Eaten = true WHERE Id = ? AND MatchPlayerId = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, card.getId());
            ps.setInt(2, idMatchPlayer);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean hitCard(int idMatchPlayer, Card card) {
        String sql = "INSERT INTO tblPublicCard(CardId, MatchPlayerId) VALUES (?,?)";
        boolean rs = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, card.getId());
            ps.setInt(2, idMatchPlayer);
            ps.executeUpdate();
            rs = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void updateHittenCard(Card card, int idMatchPlayer) {
        String sql = "UPDATE tblHandCard SET Hitten = true WHERE Id = ? AND MatchPlayerId = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, card.getId());
            ps.setInt(2, idMatchPlayer);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Card> getListHandCard(int idMatchPlayer) {
        String sql = "SELECT * FROM tblHandCard WHERE Id = ?";
        ArrayList<Card> listCards = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMatchPlayer);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Card c = new Card();
                c.setId(rs.getInt("Id"));
                c.setValue(rs.getInt("Value"));
                c.setSuit(rs.getString("Suit"));
                listCards.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCards;
    }

    public ArrayList<Card> getListPublicCard(int idMatchPlayer) {
        String sql = "SELECT * FROM tblPublicCard WHERE Id = ?";
        ArrayList<Card> listCards = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMatchPlayer);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Card c = new Card();
                c.setId(rs.getInt("Id"));
                c.setValue(rs.getInt("Value"));
                c.setSuit(rs.getString("Suit"));
                listCards.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCards;
    }

    public void drawCard(int idMatchPlayer, Card card) {
        String sql = "INSERT INTO tblHandCard(CardId, MatchPlayerId) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, card.getId());
            ps.setInt(2, idMatchPlayer);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
