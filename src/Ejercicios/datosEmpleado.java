
package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class datosEmpleado {
    public static void main (String [] args){
        String datos;
         Empleado emp = new Empleado();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             System.out.println(" Numero de nit: " );
             String Nnit = leer.readLine();
             System.out.println(" Nombre: ");
             String nombres = leer.readLine();
             System.out.println("Apellidos: ");
             String apellidos = leer.readLine();
             System.out.println("Direccion: ");
             String direccion = leer.readLine();
             System.out.println("Salario devengado: ");
             double Salario = Double.parseDouble(leer.readLine());
             
             //Asignar valores del metodo set
             
             emp.setNnit(Nnit);
             emp.setNombres(nombres);
             emp.setApellidos(apellidos);
             emp.setSD(Salario);
             emp.setDireccion(direccion);
             
             //Retornar valroes metodo get
             
             System.out.println(" Numero de nit: "  + emp.getNnit());
             System.out.println("Nombres: " + emp.getNombres());
             System.out.println("Apellidos: " + emp.getApellidos());
             System.out.println("Direccion: " + emp.getDireccion());
             
          
         }catch(Exception e){
             System.out.println("e.getMessage");
                  
         }
         
         datos = emp.InfoEmpleado(emp);
         System.out.println(" " + datos);
         System.out.println("El salario devengado: " + emp.SalarioComDescuento(0, 0, 0));
        
    }
    
 

}
