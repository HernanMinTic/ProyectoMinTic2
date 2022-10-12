/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mintic.project.Interface;

import org.springframework.data.repository.CrudRepository;
import com.mintic.project.Modelo.Quadbike;

/**
 *
 * @author hernan
 */

public interface QuadbikeInterface extends CrudRepository<Quadbike, Integer> {
    
}
