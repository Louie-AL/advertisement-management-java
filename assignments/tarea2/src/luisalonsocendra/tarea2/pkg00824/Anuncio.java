
package luisalonsocendra.tarea2.pkg00824;

public class Anuncio {
    //Declaro como protected los atributos de la clase Anuncio, que es la clase padre
    protected String titulo; 
    protected String descripcion;
    protected String seccion;
        
    public Anuncio(){ //Constructor vacío
    }
    
    public Anuncio(String new_Titulo,String new_Descripcion,String new_Seccion){ //Constructor con argumentos
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
    
}
