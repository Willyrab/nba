/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.basket.repository;

import com.example.basket.model.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Admin
 */
public interface StatistiqueRepository extends JpaRepository<Statistique, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
