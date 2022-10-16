/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.project.Modelo;

/**
 *
 * @author hernan
 */

public class CountQuadbike {
    private Long total;
    private Quadbike quadbike;

    public CountQuadbike(Long total, Quadbike quadbike) {
        this.total = total;
        this.quadbike = quadbike;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Quadbike getQuadbike() {
        return quadbike;
    }

    public void setQuadbike(Quadbike quadbike) {
        this.quadbike = quadbike;
    }   
}
