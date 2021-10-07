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
public class MatchPlayer implements Serializable{
    private int id;
    private int position;
    private TournalmentPlayer tournalmentPlayer;
    private ArrayList<PublicCard> listPublicCard;
    private ArrayList<HandCard> listHandCard;
    private boolean isWinner;
    private int gotPoints;

    public MatchPlayer() {
    }

    public MatchPlayer(int id, int position, TournalmentPlayer tournalmentPlayer, ArrayList<PublicCard> listPublicCard, ArrayList<HandCard> listHandCard, boolean isWinner, int gotPoints) {
        this.id = id;
        this.position = position;
        this.tournalmentPlayer = tournalmentPlayer;
        this.listPublicCard = listPublicCard;
        this.listHandCard = listHandCard;
        this.isWinner = isWinner;
        this.gotPoints = gotPoints;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public TournalmentPlayer getTournalmentPlayer() {
        return tournalmentPlayer;
    }

    public void setTournalmentPlayer(TournalmentPlayer tournalmentPlayer) {
        this.tournalmentPlayer = tournalmentPlayer;
    }

    public ArrayList<PublicCard> getListPublicCard() {
        return listPublicCard;
    }

    public void setListPublicCard(ArrayList<PublicCard> listPublicCard) {
        this.listPublicCard = listPublicCard;
    }

    public ArrayList<HandCard> getListHandCard() {
        return listHandCard;
    }

    public void setListHandCard(ArrayList<HandCard> listHandCard) {
        this.listHandCard = listHandCard;
    }

    public boolean isIsWinner() {
        return isWinner;
    }

    public void setIsWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public int getGotPoints() {
        return gotPoints;
    }

    public void setGotPoints(int gotPoints) {
        this.gotPoints = gotPoints;
    }

   
    
    
}
