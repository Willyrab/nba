/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.basket.service;

import com.example.basket.model.Coequipier;
import com.example.basket.repository.CoequipierRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */

@Service
public class CoequipierService {

    @Autowired
    private CoequipierRepository coequipierRepository;

    public List<Coequipier> getJoueursParEquipe(Long idEquipe) {
        return coequipierRepository.findByIdEquipe(idEquipe);
    }
}
