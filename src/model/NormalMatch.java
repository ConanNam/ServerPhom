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
public class NormalMatch implements Serializable{
    
    private int id;
    private int currentTurn;
    private boolean isFinished;
    private String note;
    private int currentNumPlayer;
    private ArrayList<NormalMatchPlayer> listPlayer;
    private Player owner;
    
    public NormalMatch() {
        super();
    }

    public NormalMatch(int id, int currentTurn, boolean isFinished, String note, int currentNumPlayer, ArrayList<NormalMatchPlayer> listPlayer, Player owner) {
        this.id = id;
        this.currentTurn = currentTurn;
        this.isFinished = isFinished;
        this.note = note;
        this.currentNumPlayer = currentNumPlayer;
        this.listPlayer = listPlayer;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public boolean isIsFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getCurrentNumPlayer() {
        return currentNumPlayer;
    }

    public void setCurrentNumPlayer(int currentNumPlayer) {
        this.currentNumPlayer = currentNumPlayer;
    }

    public ArrayList<NormalMatchPlayer> getListPlayer() {
        return listPlayer;
    }

    public void setListPlayer(ArrayList<NormalMatchPlayer> listPlayer) {
        this.listPlayer = listPlayer;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

   
    
   
    
    
    
}
