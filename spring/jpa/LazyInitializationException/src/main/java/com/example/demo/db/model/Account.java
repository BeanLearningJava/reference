package com.example.demo.db.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {
    @Id
    private String id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "account")
    public List<Transaction> transactionList;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
