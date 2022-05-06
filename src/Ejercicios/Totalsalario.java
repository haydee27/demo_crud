
package Ejercicios;


public class Totalsalario {
    double salarioD;
    double salarioCD;
    double salario;

    public double getSalarioD() {
        return salarioD;
    }

    public void setSalarioD(double salarioD) {
        this.salarioD = salarioD;
    }

    public double getSalarioCD() {
        return salarioCD;
    }

    public void setSalarioCD(double salarioCD) {
        this.salarioCD = salarioCD;
    }
    
    public Totalsalario(){
        
    }
    
    public Totalsalario(double salario){
        this.salario = salario;
       
    }
    
    public double SalarioComDescuento(double SalarioD, double salario, double salarioCD){
        salarioCD = salario * 0.10;
        salarioD =  salario - salarioCD;
        return salarioD;
    }
    
    
}

