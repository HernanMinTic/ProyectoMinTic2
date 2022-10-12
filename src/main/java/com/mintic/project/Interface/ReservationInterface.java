/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mintic.project.Interface;

import com.mintic.project.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author hernan
 */

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
    
}
