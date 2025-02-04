package com.pizzeria.day2.model;

import com.pizzeria.day2.Enumaration.StatoTv;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Tavolo {

    private int numeroTavolo;
    private int numeroMaxCoperti;
    private StatoTv stato;
}
