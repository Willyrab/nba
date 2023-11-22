/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.basket.controller;

/**
 *
 * @author Admin
 */
import com.example.basket.model.Statistique;
import com.example.basket.service.StatistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistiques")
public class StatistiqueController {

   
    @Autowired
    private StatistiqueService statistiqueService;

    @PostMapping
    public ResponseEntity<Statistique> ajouterStatistique(@RequestBody Statistique statistique) {
        try {
            Statistique nouvelleStatistique = statistiqueService.ajouterStatistique(statistique);
            return new ResponseEntity<>(nouvelleStatistique, HttpStatus.CREATED);
        } catch (Exception e) {
            // Vous pouvez personnaliser cette partie pour gérer différentes exceptions
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // Ajoutez d'autres méthodes du contrôleur selon vos besoins

}

