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
public class Tournalment implements Serializable{
    private int id;
    private String name;
    private ArrayList<Round> listRounds;
    private ArrayList<TournalmentPlayer> listPlayer;
    
    
    public Tournalment() {
    }

    public Tournalment(int id, String name, ArrayList<Round> listRounds, ArrayList<TournalmentPlayer> listPlayer) {
        this.id = id;
        this.name = name;
        this.listRounds = listRounds;
        this.listPlayer = listPlayer;
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

    public ArrayList<Round> getListRounds() {
        return listRounds;
    }

    public void setListRounds(ArrayList<Round> listRounds) {
        this.listRounds = listRounds;
    }

    public ArrayList<TournalmentPlayer> getListPlayer() {
        return listPlayer;
    }

    public void setListPlayer(ArrayList<TournalmentPlayer> listPlayer) {
        this.listPlayer = listPlayer;
    }

   
    
    
}
