package Condicionais;

public class Condiciona {
    public static void main(String[] args) {
        System.out.println("teste");
        int anoDeLancamento = 2022;
         boolean incluidoNoPlano  = true;
         double notaFilme = 8.1;
         String tipoPlano ="normal";

         if ( anoDeLancamento >= 2022){
             System.out.println(" lançamento que os clientes estão curtindo!");
         } else {
             System.out.println(" Filme Retro que vale a pena assistir");
         }

         if (incluidoNoPlano == true || tipoPlano.equals("plus") ) {
             System.out.println("Filme Liberado");
         } else {
             System.out.println(" Você precisa assinar o Plano Plus");
         }

         }



    }

