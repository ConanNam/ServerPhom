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
public class NormalMatchPlayer implements Serializable{
    private String note;
    private boolean isOwner;
    private int id;
    private int position;
    private ArrayList<PublicCard> listPublicCard;
    private ArrayList<HandCard> listHandCard;
    private boolean isWinner;
    private int gotPoints;
    private Player player;
    
    public NormalMatchPlayer() {
    }

    public NormalMatchPlayer(String note, boolean isOwner, int id, int position, ArrayList<PublicCard> listPublicCard, ArrayList<HandCard> listHandCard, boolean isWinner, int gotPoints, Player player) {
        this.note = note;
        this.isOwner = isOwner;
        this.id = id;
        this.position = position;
        this.listPublicCard = listPublicCard;
        this.listHandCard = listHandCard;
        this.isWinner = isWinner;
        this.gotPoints = gotPoints;
        this.player = player;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isIsOwner() {
        return isOwner;
    }

    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

   

   
    
    
}
