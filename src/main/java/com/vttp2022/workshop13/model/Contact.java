package com.vttp2022.workshop13.model;

import java.io.Serializable;
import java.util.Random;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String email;
    private int phoneNumber;
    private String id;

    public Contact() {
        this.id = this.generateId(8);
    }

    public Contact(String name, String email, int phoneNumber) {
        this.id = this.generateId(8);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String id, String name, String email, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /*for the generation of hex number
    //synchronized: allowing only a single thread to access the shared data or 
    resource at a particular point of time
    EG 3 classes call in at the same time, they will be queued up to access the 
    resources. This is to prevent every classes from getting the same thing
    imagine 3 ppl, each xfer diff number of $$ but without synchonizing, all
    xfer the same number
    */
    private synchronized String generateId(int numChars) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < numChars) {
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, numChars);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

