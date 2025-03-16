
package luisalonsocendra.Proyecto.pkg00824;

import java.io.Serializable;//Usamos ObjectIOStream por ende debemos definirlo como Serializable

public class Cliente implements Serializable{
    
    //Variables del cliente
    private String iD;
    private String nombre;
    private String apellido_1;
    private String apellido_2;
    private double edad;
    
    //Constructor sin argumentos. Inicialización nula.
    public Cliente() {
        this.iD = null;
        this.nombre = null;
        this.apellido_1 = null;
        this.apellido_2 = null;
        this.edad = 0.0;
    }
    
    //Constructor con argumentos
    public Cliente(String iD, String nombre, String apellido_1, String apellido_2, double edad) {
        this.iD = iD;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.edad = edad;
    }
    //Getters and Setters
    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public String getApellido_2() {
        return apellido_2;
    }

    public void setApellido_2(String apellido_2) {
        this.apellido_2 = apellido_2;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente" + "iD=" + this.iD + ", nombre=" + this.nombre + ", apellido_1=" + this.apellido_1 + ", apellido_2=" + this.apellido_2 + ", edad=" + this.edad;
    }
    
}
