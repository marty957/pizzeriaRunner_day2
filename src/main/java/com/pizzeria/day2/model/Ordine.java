package com.pizzeria.day2.model;

import com.pizzeria.day2.Enumaration.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Ordine {

    private int numeroOrdine;
    private Tavolo tavolo;
    private List<Article> articoliOrdinati;
    private int numeroCoperti;
    private StatoOrdine statoOrdine;
    private LocalDateTime oraOrdinazione;
    private int costoTotale;



}
