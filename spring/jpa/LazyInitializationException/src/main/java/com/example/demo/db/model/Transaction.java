package com.example.demo.db.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name="account_id", nullable=false)
    private Account account;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
