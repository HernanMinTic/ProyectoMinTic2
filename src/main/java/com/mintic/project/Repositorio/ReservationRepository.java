/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.project.Repositorio;

import com.mintic.project.Interface.ReservationInterface;
import com.mintic.project.Modelo.Reservation;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author hernan
 */

@Repository
public class ReservationRepository {
     @Autowired
    private ReservationInterface extencionesCrud;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) extencionesCrud.findAll();
    }
    
    public Optional<Reservation> getReservation(int id){
        return extencionesCrud.findById(id);
    }
    
    public Reservation save(Reservation reservation){
        return extencionesCrud.save(reservation);
    }
    
    public void delete(Reservation reservation){
        extencionesCrud.delete(reservation);
    }
}