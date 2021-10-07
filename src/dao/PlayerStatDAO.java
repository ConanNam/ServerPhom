/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;

/**
 *
 * @author MSI GF63
 */
public class PlayerStatDAO extends DAO {

    public PlayerStatDAO() {
    }

    public int getTotalGame(int idPlayer) {
        String sqlTournalment = "SELECT COUNT(*) AS total FROM tblPlayer, tblMatchPlayer, tblTournalment_Player"
                + "WHERE tblPlayer.Id = tblTournalment.PlayerId AND tblTournalment.id = tblMatchPlayer.Tournalment_PlayerId "
                + "AND tblPlayer.Id = ?";
        String sqlNormal = "SELECT COUNT(*) AS total2 FROM tblPlayer, tblNormalMatchPlayer"
                + "WHERE tblPlayer.Id = tblNormalMatchPlayer.PlayerId "
                + "AND tblPlayer.Id = ?";

        int totalTour = 0;
        int totalNormal = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sqlTournalment);
            ps.setInt(1, idPlayer);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                totalTour = rs.getInt("total");
            }
            ps = con.prepareStatement(sqlNormal);
            ps.setInt(1, idPlayer);
            rs = ps.executeQuery();
            if (rs.next()) {
                totalNormal = rs.getInt("total2");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalNormal + totalTour;
    }
    
    public int getTotalWinGame(int idPlayer) {
        String sqlTournalment = "SELECT COUNT(*) AS total FROM tblPlayer, tblMatchPlayer, tblTournalment_Player"
                + "WHERE tblPlayer.Id = tblTournalment.PlayerId AND tblTournalment.id = tblMatchPlayer.Tournalment_PlayerId "
                + "AND tblMatchPlayer.isWinner = true AND tblPlayer.Id = ?";
        String sqlNormal = "SELECT COUNT(*) AS total2 FROM tblPlayer, tblNormalMatchPlayer"
                + "WHERE tblPlayer.Id = tblNormalMatchPlayer.PlayerId "
                + "AND tblNormalMatchPlayer.isWinner = true AND tblPlayer.Id = ?";

        int totalTour = 0;
        int totalNormal = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sqlTournalment);
            ps.setInt(1, idPlayer);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                totalTour = rs.getInt("total");
            }
            ps = con.prepareStatement(sqlNormal);
            ps.setInt(1, idPlayer);
            rs = ps.executeQuery();
            if (rs.next()) {
                totalNormal = rs.getInt("total2");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalNormal + totalTour;
    }
    
}
