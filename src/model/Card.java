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
public class Card implements Serializable{
    int id;
    private int value;
    private String suit;

    public Card() {
    }

    public Card(int id, int value, String suit) {
        this.id = id;
        this.value = value;
        this.suit = suit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    
    
    
}
