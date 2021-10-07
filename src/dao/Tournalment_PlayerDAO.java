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
public class Tournalment_PlayerDAO extends DAO{

    public Tournalment_PlayerDAO() {
    }
    
    public void addTournalmentPlayer(int idPlayer, int idTournalment){
        String sql = "INSERT INTO tblTournalment_Player(PlayerId, TournalmentId) VALUES(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPlayer);
            ps.setInt(2, idTournalment);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
