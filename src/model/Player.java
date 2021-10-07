/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author MSI GF63
 */
public class Player implements Serializable{
    private int id;
    private String name;
    private String email;
    private String tel;
    private String userName;
    private String password;
    private ArrayList<Player> listFriend;
    private int status;
    
    public Player() {
        
    }

    public Player(int id, String name, String email, String tel, String userName, String password, ArrayList<Player> listFriend, int status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.userName = userName;
        this.password = password;
        this.listFriend = listFriend;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Player> getListFriend() {
        return listFriend;
    }

    public void setListFriend(ArrayList<Player> listFriend) {
        this.listFriend = listFriend;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
}
