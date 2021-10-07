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
public class Match implements Serializable{
    private int id;
    private int currentTurn;
    private boolean isFinished;
    private ArrayList<MatchPlayer> listPlayers;
    private ArrayList<Card> listCardInDeck;
    private MatchPlayer winner;
    
    
    public Match() {
    }

    public Match(int id, int currentTurn, boolean isFinished, ArrayList<MatchPlayer> listPlayers, ArrayList<Card> listCardInDeck, MatchPlayer winner) {
        this.id = id;
        this.currentTurn = currentTurn;
        this.isFinished = isFinished;
        this.listPlayers = listPlayers;
        this.listCardInDeck = listCardInDeck;
        this.winner = winner;
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

    public ArrayList<MatchPlayer> getListPlayers() {
        return listPlayers;
    }

    public void setListPlayers(ArrayList<MatchPlayer> listPlayers) {
        this.listPlayers = listPlayers;
    }

    public ArrayList<Card> getListCardInDeck() {
        return listCardInDeck;
    }

    public void setListCardInDeck(ArrayList<Card> listCardInDeck) {
        this.listCardInDeck = listCardInDeck;
    }

    public MatchPlayer getWinner() {
        return winner;
    }

    public void setWinner(MatchPlayer winner) {
        this.winner = winner;
    }
    
    
}
