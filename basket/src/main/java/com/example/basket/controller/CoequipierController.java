/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.basket.controller;

import com.example.basket.model.Coequipier;
import com.example.basket.service.CoequipierService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */

@RestController
@RequestMapping("/coequipiers")
public class CoequipierController {

    @Autowired
    private CoequipierService coequipierService;
    
    //prendre joueurs dans 1 equipe
    @GetMapping("/{idEquipe}")
    public ResponseEntity<List<Coequipier>> getJoueursParEquipe(@PathVariable Long idEquipe) {
        try{
             List<Coequipier> coequipiers = coequipierService.getJoueursParEquipe(idEquipe);
             return new ResponseEntity<>(coequipiers, HttpStatus.OK);
        }catch (Exception e){
               return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        } 
       
    }
}
