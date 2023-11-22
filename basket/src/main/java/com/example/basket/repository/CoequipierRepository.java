/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.basket.repository;

import com.example.basket.model.Coequipier;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Admin
 */
// CoequipierRepository.java
public interface CoequipierRepository extends JpaRepository<Coequipier, Long> {
    List<Coequipier> findByIdEquipe(Long idEquipe);
}
