/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Tournalment;
import java.sql.*;

/**
 *
 * @author MSI GF63
 */
public class TournalmentDAO extends DAO {

    public TournalmentDAO() {
    }

    public void creatTournalment(Tournalment tn) {
        String sql = "INSERT INTO tblTournalment(Note,Name) VALUES(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "new");
            ps.setString(2, tn.getName());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
