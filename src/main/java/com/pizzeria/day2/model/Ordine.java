package com.pizzeria.day2.model;

import com.pizzeria.day2.Enumaration.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;


import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@PropertySource("application.properties")
public class Ordine {

    private int numeroOrdine;
    private Tavolo tavolo;
    private List<Article> articoliOrdinati;
    private int numeroCoperti;
    private StatoOrdine statoOrdine;
    private LocalDateTime oraOrdinazione;
    private int costoTotale;


    @Value("${costo.coperto}") private int costoCoperto;



    public double costo(){
       double costoArticoli= this.articoliOrdinati.stream().mapToDouble(Article::getPrice).sum();

       return costoArticoli + (costoCoperto*this.numeroCoperti);
    }

  public void printOrder(){
      int numeroTavolo = this.tavolo.getNumeroTavolo();

      System.out.println("------ORDINE-------");
      System.out.println("Data: " + this.oraOrdinazione);
      System.out.println("NOrdine: " +this.numeroOrdine);
      System.out.println("Tavolo: "+ numeroTavolo);
      System.out.println("Coperti: " + this.numeroCoperti);
      System.out.println("Stato" + this.statoOrdine);

      this.articoliOrdinati.forEach(ele->{
          if(ele instanceof Pizza){
              System.out.println(((Pizza) ele).getName()+ " - ");
              System.out.println(ele.getPrice());
          }
          if(ele instanceof Drink){
              System.out.println(((Drink) ele).getName()+ " - ");
              System.out.println(ele.getPrice());
          }
          if(ele instanceof Topping){
              System.out.println(((Topping) ele).getName()+ " - ");
              System.out.println(ele.getPrice());
          }
      });

      System.out.println("Totale da Pagare: " +costo());

  }
}
