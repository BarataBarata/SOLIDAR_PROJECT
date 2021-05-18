package com.example.tabs;

public class Alerta_Dilatacao {

       private String dilatacao;

       public String alerta_Dilatacao(int dilatacao){
              if(dilatacao<=10 && dilatacao>=9){
                  return "verde";
              }
           if(dilatacao>10){
               return "vermelho";
           }
           return "vazio";
       }
}
