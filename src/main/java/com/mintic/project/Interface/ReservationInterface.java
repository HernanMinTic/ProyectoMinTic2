/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mintic.project.Interface;

import com.mintic.project.Modelo.Reservation;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author hernan
 */

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
    @Query("SELECT c.quadbike, COUNT(c.quadbike) from Reservation AS c group by c.quadbike order by COUNT(c.quadbike) DESC")
    public List<Object[]> countTotalReservationsByQuadbike();

    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationsByClient();
    
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne,Date dateTwo );
    public List<Reservation> findAllByStatus(String status);
}
