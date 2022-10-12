/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.project.Repositorio;

import com.mintic.project.Interface.QuadbikeInterface;
import com.mintic.project.Modelo.Quadbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hernan
 */

@Repository
public class QuadbikeRepository {
     @Autowired
    private QuadbikeInterface extencionesCrud;
    
    public List<Quadbike> getAll(){
        return (List<Quadbike>) extencionesCrud.findAll();
    }
    
    public Optional<Quadbike> getQuadbike(int id){
        return extencionesCrud.findById(id);
    }
    
    public Quadbike save(Quadbike quadbike){
        return extencionesCrud.save(quadbike);
    }
}