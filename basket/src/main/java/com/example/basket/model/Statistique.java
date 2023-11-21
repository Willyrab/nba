/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.basket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "statistique")
public class Statistique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ppm;
    private int npm;
    private int pdmp;
    private int pmp;
    private int eff;
    private int fg;
    private int point;

    @ManyToOne
    @JoinColumn(name = "joueur")
    private Joueur joueur;

    // Getters et Setters , controller

    public Statistique(Long id, int ppm, int npm, int pdmp, int pmp, int eff, int fg, int point, Joueur joueur) {
        this.id = id;
        this.ppm = ppm;
        this.npm = npm;
        this.pdmp = pdmp;
        this.pmp = pmp;
        this.eff = eff;
        this.fg = fg;
        this.point = point;
        this.joueur = joueur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public int getPdmp() {
        return pdmp;
    }

    public void setPdmp(int pdmp) {
        this.pdmp = pdmp;
    }

    public int getPmp() {
        return pmp;
    }

    public void setPmp(int pmp) {
        this.pmp = pmp;
    }

    public int getEff() {
        return eff;
    }

    public void setEff(int eff) {
        this.eff = eff;
    }

    public int getFg() {
        return fg;
    }

    public void setFg(int fg) {
        this.fg = fg;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
    
    
}



