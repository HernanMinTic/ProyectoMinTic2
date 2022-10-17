/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.project.Repositorio;

import com.mintic.project.Modelo.CountClient;
import com.mintic.project.Interface.ReservationInterface;
import com.mintic.project.Modelo.Client;
import com.mintic.project.Modelo.CountQuadbike;
import com.mintic.project.Modelo.Quadbike;
import com.mintic.project.Modelo.Reservation;
import java.util.ArrayList;
import java.util.Date;
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

    public  List<CountQuadbike> getTopQuadbikes(){
        List<CountQuadbike>res=new ArrayList<>();
        List<Object[]>report=extencionesCrud.countTotalReservationsByQuadbike();
        for(int i=0;i<report.size();i++){
            res.add(new CountQuadbike((Long)report.get(i)[1],(Quadbike) report.get(i)[0]));
        }
        return res;
    }

    public  List<CountClient> getTopClients(){
        List<CountClient>res=new ArrayList<>();
        List<Object[]>report=extencionesCrud.countTotalReservationsByClient();
        for(int i=0;i<report.size();i++){
            res.add(new CountClient((Long)report.get(i)[1],(Client) report.get(i)[0]));
        }
        return res;
    }
    
    public List<Reservation> getReservationPeriod(Date a, Date b){
        return extencionesCrud.findAllByStartDateAfterAndStartDateBefore(a,b);
    }

    public List<Reservation> getReservationsByStatus(String status){
        return extencionesCrud.findAllByStatus(status);
    }
}