/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.project.Repositorio;

import com.mintic.project.Interface.MessageInterface;
import com.mintic.project.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hernan
 */

@Repository
public class MessageRepository {
     @Autowired
    private MessageInterface extencionesCrud;
    
    public List<Message> getAll(){
        return (List<Message>) extencionesCrud.findAll();
    }
    
    public Optional<Message> getMessage(int id){
        return extencionesCrud.findById(id);
    }
    
    public Message save(Message message){
        return extencionesCrud.save(message);
    }
    
    public void delete(Message message){
        extencionesCrud.delete(message);
    }
}