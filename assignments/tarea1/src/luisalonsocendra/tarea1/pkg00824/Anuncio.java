
package luisalonsocendra.tarea1.pkg00824;

public class Persona {
    //Declaro como privadas los atributos de la clase Persona
    private String titulo; 
    private String descripcion;
    private String seccion;
        
    public Persona(){ //Constructor vacío
    }
    
    public Persona(String new_Titulo,String new_Descripcion,String new_Seccion){ //Constructor con argumentos
        this.titulo = new_Titulo; //this hace referencia al objeto actual. Por ende, pasamos al objeto activo los argumentos ingresados al llamar el constructor
        this.descripcion = new_Descripcion;
        this.seccion = new_Seccion;
    }
    
    public String getTitulo()throws IllegalStateException{ //Método obtener para el argumento título. Retorna el título, el cual es un valor string.
        return this.titulo;
    }
      
    public void setTitulo(String new_Titulo){   //Método establecer para el argumento título.  Void dado que no retorna valores, el cual es un valor string.
        this.titulo = new_Titulo;
    }
    
    public String getDescripcion()throws IllegalStateException{ //Método obtener para el argumento descripcion. Retorna el título, el cual es un valor string.
        return this.descripcion;
    }
      
    public void setDescripcion(String new_Descripcion){ //Método establecer para el argumento descripcion.  Void dado que no retorna valores, el cual es un valor string.
        this.descripcion = new_Descripcion;
    }
    
    public String getSeccion()throws IllegalStateException{ //Método obtener para el argumento seccion. Retorna el título, el cual es un valor string.
        return this.seccion;
    }
      
    public void setSeccion(String new_Seccion){ //Método establecer para el argumento seccion.  Void dado que no retorna valores, el cual es un valor string.
        this.seccion = new_Seccion;
    }

    //Metodo de calculo de calculo del costo
    
    public double calculoCosto(int numero_letras, String seccion){//Pasamos dos arguemtnos, la cantidad de letras y el String del Combobox de Seccion. 
                                                                  // El String Seccion representara el costo por letra.
        //Inicializamos
        int costo;
        int costoLetra = 0;

        switch (seccion) { //Usamos un switch, dependiendo del valor del String de Seccion, que vendrá del Combobox.
                           //El switch necesita de consistencia que provee el uso del Combobox
                case "Nacionales":
                    costoLetra = 80;
                    break;
                case "Internacionales":
                    costoLetra = 70;
                    break;
                case "Deportes":
                    costoLetra = 90;
                    break;
                case "Culturales":
                    costoLetra = 85;
                    break;
                case "Economicos":
                    costoLetra = 50;
                    break;
        }
        costo = costoLetra*numero_letras; //Costo del Persona
        return costo; //Devuelve costo total del Persona
    }
    
    public double calculoCostoIVA(int numero_letras, String seccion){
        double costoIVA;
        costoIVA = calculoCosto(numero_letras,seccion)*(1.13); //Aplica un 13% de IVA al costo sin IVA
        return costoIVA; //Devuelve el costo con IVA
    }
    
}
