/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.basket.service;

import com.example.basket.model.Statistique;
import com.example.basket.repository.StatistiqueRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class StatistiqueService {

    @Autowired
    private StatistiqueRepository statistiqueRepository;

    public Statistique ajouterStatistique(Statistique statistique) {
        return statistiqueRepository.save(statistique);
    }
}


