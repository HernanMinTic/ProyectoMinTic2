/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mintic.project.Interface;

import com.mintic.project.Modelo.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author hernan
 */

public interface CategoryInterface extends CrudRepository<Category,Integer>{
    
}
