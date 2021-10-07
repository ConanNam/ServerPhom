/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import model.Round;
/**
 *
 * @author MSI GF63
 */
public class RoundDAO extends DAO{

    public RoundDAO() {
    }
    
     public void creatRound(int idTournalment, int currentRound) {
        String sql = "INSERT INTO tblRound(TournalmentId, CurrentRound) VALUES(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTournalment);
            ps.setInt(2, currentRound);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
