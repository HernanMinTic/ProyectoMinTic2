/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.project.Controlador;

import com.mintic.project.Modelo.Quadbike;
import com.mintic.project.Servicio.QuadbikeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author hernan
 */

@RestController
@RequestMapping("/api/Quadbike")

public class QuadbikeController {
      @Autowired
    private QuadbikeService quadbikeService;
    
    @GetMapping("/all")
    public List<Quadbike> getAll(){
        return quadbikeService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Quadbike> getQuadbike(@PathVariable("id") int id){
        return quadbikeService.getQuadbike(id);
    } 
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike save (@RequestBody Quadbike quadbike){
        return quadbikeService.save(quadbike);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int quadbikeId){
        return quadbikeService.deleteQuadbike(quadbikeId);
    }
}
