/*RÚBRICA: Anuncio con imagen
 * o Atributos adicionales
 *                          Milímetros cuadrados de la imagen a utilizar
 * o Métodos nuevos o mejorados
 *                          CalcularAnuncio: se aplica un costo extra de ¢25 por cada milímetro 
 *                          cuadrado 
*/
package luisalonsocendra.tarea2.pkg00824;

public class AnuncioImagen extends Anuncio{ //Utilizamos herencia, con la superclase siendo Anuncio
    private double milimetros; //Atributos de las clases hijas se declaran como private
       
    public AnuncioImagen(){ //Constructor sin argumentos
        super();
        this.milimetros = 0.0;
    }
    
    public AnuncioImagen(double new_Milimetros, String titulo,String descripcion,String seccion){//Constructor con argumentos
        super(titulo,descripcion,seccion);
        this.milimetros = new_Milimetros;
    }
    //Get y Set únicamente para la clase hija
    public double getMilimetros()throws IllegalStateException{ //Método obtener para el argumento milimetros de la clase hija. Retorna el milimetros, el cual es un valor double.
        return this.milimetros;
    }
      
    public void setMilimetros(double new_Milimetros){   //Método establecer para el argumento milimetros de la clase hija.  Void dado que no retorna valores, el cual es un valor milimetros.
        this.milimetros = new_Milimetros;
    }
    public double calculoAnuncio(int numero_letras, String seccion,double milimetros){//Pasamos tres arguemtnos, la cantidad de letras, el String del Combobox de Seccion y la cantidad de milimetros cuadrados 
                                                              // El String Seccion representara el costo por letra.
    //Inicializamos
    double costo;
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
    costo = costoLetra*numero_letras + milimetros * 25; //Costo del Anuncio más 25 olones por cada milímetro cuadrado
    return costo; //Devuelve costo total del Anuncio
    }
    
    public double calculoAnuncioIVA(int numero_letras, String seccion,double milimetros){
        double costoIVA;
        costoIVA = calculoAnuncio(numero_letras,seccion,milimetros)*(1.13); //Aplica un 13% de IVA al costo sin IVA
        return costoIVA; //Devuelve el costo con IVA
    }
}