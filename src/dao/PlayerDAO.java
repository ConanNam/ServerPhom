/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Player;
import java.sql.*;
import java.util.ArrayList;
import model.NormalMatch;

/**
 *
 * @author MSI GF63
 */
public class PlayerDAO extends DAO {

    public PlayerDAO() {
        super();
    }

    public boolean checkLogin(Player player) {
        boolean result = false;
        String sql = "SELECT *  FROM tblplayer WHERE username = ? AND password = ?";
        String sql2 = "UPDATE tblplayer SET status = ? WHERE id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, player.getUserName());
            ps.setString(2, player.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                player.setName(rs.getString("name"));
                player.setId(rs.getInt("id"));
                player.setEmail(rs.getString("email"));
                player.setTel(rs.getString("tel"));
                player.setStatus(rs.getInt("status"));
                result = true;
            }
            
            if(result == true){
                ps = con.prepareStatement(sql2);
                ps.setInt(1, 1);
                ps.setInt(2, player.getId());
                ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public boolean updatePlayer(Player player){
        boolean rs = false;
        String sql = "UPDATE tblplayer SET name = ?, email = ?, tel = ?, status = ? WHERE id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, player.getName());
            ps.setString(2, player.getEmail());
            ps.setString(3, player.getTel());
            ps.setInt(4, player.getStatus());
            ps.setInt(5, player.getId());
            rs = true;
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            rs = false;
        }
        return rs;
    }
    
    public boolean signUp(Player player){
        boolean rs = false;
        String sql = "INSERT INTO tblplayer(name,email,tel,username,password) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, player.getName());
            ps.setString(2, player.getEmail());
            ps.setString(3, player.getTel());
            ps.setString(4, player.getUserName());
            ps.setString(5, player.getPassword());
            rs = true;
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            rs = false;
        }
        
        return rs;
    }
    

    public boolean addFriend(Player player, Player friend) {
        boolean result = false;
        String sql = "INSERT INTO tblfriend(PlayerId, PlayerId2) VALUES(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, player.getId());
            ps.setInt(2, friend.getId());
            result = true;
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    public ArrayList<Player> getListFriends(Player pl) {
        ArrayList<Player> listFriends = new ArrayList<>();
        String sql = "SELECT * FROM tblplayer WHERE id IN (SELECT playerid2 FROM tblfriend WHERE playerid = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pl.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Player pll = new Player();
                    pll.setId(rs.getInt("id"));
                    pll.setName(rs.getString("name"));
                    pll.setEmail(rs.getString("email"));
                    pll.setStatus(rs.getInt("status"));
                    listFriends.add(pll);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listFriends;
    }

    public ArrayList<Player> searchPlayer(String name) {
        ArrayList<Player> result = new ArrayList<>();
        String sql = "SELECT * FROM tblplayer WHERE name LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Player pl = new Player();
                pl.setId(rs.getInt("id"));
                pl.setName(rs.getString("name"));
                pl.setEmail(rs.getString("email"));
                pl.setTel(rs.getString("tel"));
                result.add(pl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean creatNormalMatch(Player player, NormalMatch nm) {
        boolean rs = false;
        String sqlAddMatch = "INSERT INTO tblnormalmatch(isfinished) VALUES(?)";
        String sqlAddNormalMatchPlayer = "INSERT INTO tblnormalmatchplayer(position,playerid,isowner,normalmatchid) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sqlAddMatch, Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1, nm.isIsFinished());
            ps.executeUpdate();
            ResultSet genKey = ps.getGeneratedKeys();
            if(genKey.next()){
                nm.setId(genKey.getInt(1));
                ps = con.prepareStatement(sqlAddNormalMatchPlayer);
                ps.setInt(1, 1);
                ps.setInt(2, player.getId());
                ps.setBoolean(3, true);
                ps.setInt(4, nm.getId());
                
                ps.executeUpdate();
                rs = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

}
