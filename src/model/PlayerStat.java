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
public class PlayerStat extends Player implements Serializable{
    private int totalGame;
    private int totalWin;
    private float rate;

    public PlayerStat() {
    }

    public PlayerStat(int totalGame, int totalWin, float rate, int id, String name, String email, String tel, String userName, String password, ArrayList<Player> listFriend, int status) {
        super(id, name, email, tel, userName, password, listFriend, status);
        this.totalGame = totalGame;
        this.totalWin = totalWin;
        this.rate = rate;
    }

   

    public int getTotalGame() {
        return totalGame;
    }

    public void setTotalGame(int totalGame) {
        this.totalGame = totalGame;
    }

    public int getTotalWin() {
        return totalWin;
    }

    public void setTotalWin(int totalWin) {
        this.totalWin = totalWin;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    
    
    
}
