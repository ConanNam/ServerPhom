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
public class ObjectWrapper implements Serializable{
    private static final long serialVersionUID = 20210811011L;
    public static final int LOGIN_USER = 1;
    public static final int REPLY_LOGIN_USER = 2;
    public static final int EDIT_CUSTOMER = 3;
    public static final int REPLY_EDIT_CUSTOMER = 4;
    public static final int SEARCH_CUSTOMER_BY_NAME = 5;
    public static final int REPLY_SEARCH_CUSTOMER = 6;
    public static final int SERVER_INFORM_CLIENT_NUMBER = 7;
    public static final int SIGNUP_USER = 8;
    public static final int REPLY_SIGNUP_USER = 9;
    public static final int CLOSE_WINDOW = 10;
    public static final int REPLY_CLOSE_WINDOW = 11;
    
    
    private int performative;
    private Object data;
    
    
    public ObjectWrapper() {
        super();
    }
    public ObjectWrapper(int performative, Object data) {
        super();
        this.performative = performative;
        this.data = data;
    }
    public int getPerformative() {
        return performative;
    }
    public void setPerformative(int performative) {
        this.performative = performative;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }   
}
