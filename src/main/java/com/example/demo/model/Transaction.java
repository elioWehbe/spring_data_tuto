/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Acer
 */
@Entity
@Table(schema = "paymybuddy")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_transaction;
 
    private String libele;
    @NotNull
    private int montant;
    
    @NotNull
    @ManyToOne(optional = false)
    private Client from;
    
    @NotNull
    @ManyToOne(optional = false)
    private Compte to;

    public Transaction (int montant, Client from, Compte to) {
        this.montant = montant;
        this.from=from;
        this.to = to;
    }

    public Transaction() {

    }


    public Long getId_transaction() {
        return id_transaction;
    }

    public String getLibele() {
        return libele;
    }

    public int getMontant() {
        return montant;
    }

    public Client getFrom() {
        return from;
    }

    public Compte getTo() {
        return to;
    }
}
