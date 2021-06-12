package com.wings.designs.ProyectoFraude.ticket;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {


    @Query("FROM Ticket  WHERE status=?1")
    List<Ticket> findTicketByStatus(String status);
    

}
