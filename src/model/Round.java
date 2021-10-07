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
public class Round implements Serializable{
    private int id;
    private int currentRound;
    private ArrayList<Match> listMatches;
            
    public Round() {
    }

    public Round(int id, int currentRound, ArrayList<Match> listMatches) {
        this.id = id;
        this.currentRound = currentRound;
        this.listMatches = listMatches;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

    public ArrayList<Match> getListMatches() {
        return listMatches;
    }

    public void setListMatches(ArrayList<Match> listMatches) {
        this.listMatches = listMatches;
    }

   
    
    
}
