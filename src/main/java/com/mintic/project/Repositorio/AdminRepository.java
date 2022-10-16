/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.project.Repositorio;

import com.mintic.project.Interface.AdminInterface;
import com.mintic.project.Modelo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

 /**
 *
 * @author hernan
 */
 
@Repository
public class AdminRepository {
    @Autowired
    private AdminInterface extencionesCrud;
    
    public List<Admin> getAll(){
        return (List<Admin>) extencionesCrud.findAll();
    }
    
    public Optional<Admin> getAdmin(int id){
        return extencionesCrud.findById(id);
    }

    public Admin save(Admin admin){
        return extencionesCrud.save(admin);
    }
    
    public void delete(Admin admin){
        extencionesCrud.delete(admin);
    }
}
