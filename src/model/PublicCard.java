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
public class PublicCard implements Serializable{
    private int id;
    private Card card;
    private boolean eaten;
    
    public PublicCard() {
    }

    public PublicCard(int id, Card card, boolean eaten) {
        this.id = id;
        this.card = card;
        this.eaten = eaten;
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

    public boolean isEaten() {
        return eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }

   
    
    
}
