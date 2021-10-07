/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author MSI GF63
 */
public class HandCard implements Serializable{
    private int id;
    private Card card;
    private boolean hitten;
    
    public HandCard() {
    }

    public HandCard(int id, Card card, boolean hitten) {
        this.id = id;
        this.card = card;
        this.hitten = hitten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public boolean isHitten() {
        return hitten;
    }

    public void setHitten(boolean hitten) {
        this.hitten = hitten;
    }

   
    
    
}
