
package Ejercicios;

public class Empleado extends Totalsalario{
    String Nnit;
    String Apellidos, nombres, direccion;
    double SD, SCD, Salario;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario= Salario;
    }
    String bandera;

    public String getNnit() {
        return Nnit;
    }

    public void setNnit(String Nnit) {
        this.Nnit = Nnit;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSD() {
        return SD;
    }

    public void setSD(double SD) {
        this.SD = SD;
    }

    public double getSCD() {
        return SCD;
    }

    public void setSCD(double SCD) {
        this.SCD = SCD;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }
    
    public String InfoEmpleado( Empleado emp){
        String name = "***********************\n";
        name+= emp.getNombres() + " " + emp.getApellidos() + "\n";
        name += "*********************\n";
        return "";
    }
    

}
