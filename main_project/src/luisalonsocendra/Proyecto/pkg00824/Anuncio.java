
package luisalonsocendra.Proyecto.pkg00824;

import java.io.Serializable; //Usamos ObjectIOStream entonces lo definimos Serializable

public class Anuncio implements Serializable{
    //Declaro como protected los atributos de la clase Anuncio, que es la clase padre
    protected String titulo; 
    protected String descripcion;
    protected String seccion;
    protected String clienteID; //Notese que se agrega la variable de ID del cliente respecto a la tarea 2
        
    public Anuncio(){ //Constructor sin argumentos. Inicialización nula.
        this.titulo = null; //this hace referencia al objeto actual. Por ende, pasamos al objeto activo los argumentos ingresados al llamar el constructor
        this.descripcion = null;
        this.seccion = null;
        this.clienteID = null;
    }
    
    public Anuncio(String new_Titulo,String new_Descripcion,String new_Seccion, String new_clienteID){ //Constructor con argumentos
        this.titulo = new_Titulo; //this hace referencia al objeto actual. Por ende, pasamos al objeto activo los argumentos ingresados al llamar el constructor
        this.descripcion = new_Descripcion;
        this.seccion = new_Seccion;
        this.clienteID = new_clienteID;
    }
    
    public String getTitulo()throws IllegalStateException{ //Método obtener para el argumento título. Retorna el título, el cual es un valor string.
        return this.titulo;
    }
      
    public void setTitulo(String new_Titulo){   //Método establecer para el argumento título.  Void dado que no retorna valores, el cual es un valor string.
        this.titulo = new_Titulo;
    }
    
    public String getclienteID()throws IllegalStateException{ //Método obtener para el argumento clienteID. Retorna el clienteID, el cual es un valor string.
        return this.clienteID;
    }
      
    public void setclienteID(String new_clienteID){   //Método establecer para el argumento clienteID.  Void dado que no retorna valores, el cual es un valor string.
        this.clienteID = new_clienteID;
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

    @Override
    public String toString() {
        return "Anuncio{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", seccion=" + seccion + ", clienteID=" + clienteID + '}';
    }
    
    
}
