/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Acer
 */
@Entity
@Table(schema = "paymybuddy")
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_compte;
    @Column(unique = true)
    private String libele;
    private int solde;

    @OneToMany(mappedBy = "to")
    private List<Transaction> transactions;

    @OneToOne
    private Client proprietaire;
    
    //Les getters setters
    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    public Long getId_compte() {
        return id_compte;
    }
    

}
