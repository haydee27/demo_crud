
package EjerciciosSemana1;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class conversion {
   public static void main(String[] args){
        NumberFormat formato = new DecimalFormat("#0.00");
       //declaracion de variables 
       
       double E, TE;
       double R, TR;
       double A, TA;
       double C, TC;
       double VALOR;
       
      E= 0.70;
      R= 0.61;
      A= 0.95;
      C= 0.97;
      VALOR= 100.00;
      
      TE= VALOR / E ;
      TR= VALOR / R ;
      TA= VALOR / A ;
      TC= VALOR / C ;
      
       System.out.println("La conversion de monedas estadounidence a Euros es: " +  formato.format(TE));
       System.out.println("La conversion de monedas estadounidence a libras esterlina es: "+ formato.format(TR));
       System.out.println("La conversion de monedas estadounidence a autralianos es: " + formato.format(TA));
       System.out.println("La conversion de moneras estadounidence a dolar canadience  es: " + formato.format(TC));
      
       
   } 
}
