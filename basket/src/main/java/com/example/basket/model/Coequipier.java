/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.basket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

/**
 *
 * @author Admin
 */

// Coequipier.java
@Entity
public class Coequipier {
    @Id
    private Long idJoueur;
    private String nomJoueur;
    private String prenom;
    private BigDecimal taille;
    private BigDecimal poids;
    private Long idEquipe;
    private String nomEquipe;

    
    // Getters et Setters

    public Long getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Long idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public BigDecimal getTaille() {
        return taille;
    }

    public void setTaille(BigDecimal taille) {
        this.taille = taille;
    }

    public BigDecimal getPoids() {
        return poids;
    }

    public void setPoids(BigDecimal poids) {
        this.poids = poids;
    }

    public Long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Coequipier(Long idJoueur, String nomJoueur, String prenom, BigDecimal taille,BigDecimal  poids, Long idEquipe, String nomEquipe) {
        this.idJoueur = idJoueur;
        this.nomJoueur = nomJoueur;
        this.prenom = prenom;
        this.taille = taille;
        this.poids = poids;
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
    }
    
    public Coequipier() {
        // Vous pouvez laisser le corps vide ou faire des initialisations si nécessaire
    }
}

