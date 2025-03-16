/*RÚBRICA: Anuncio cliente frecuente
 * o Atributos adicionales
 *                          Valor de descuento 
 * o Métodos nuevos o mejorados
 *                          CalcularAnuncio: aplica un descuento fijo determinado por el usuario 
 *                          al costo del anuncio antes de aplicar el IVA%
 */
package luisalonsocendra.tarea2.pkg00824;

public class AnuncioFrecuente extends Anuncio{ //Utilizamos herencia, con la superclase siendo Anuncio
    private double descuentoFrecuente; //Atributos de las clases hijas se declaran como private
    
           
    public AnuncioFrecuente(){ //Constructor sin argumentos
        super();
        this.descuentoFrecuente = 0.0;
    }
    
    public AnuncioFrecuente(double new_DescuentoFrecuente, String titulo,String descripcion,String seccion){//Constructor con argumentos
        super(titulo,descripcion,seccion);
        this.descuentoFrecuente = new_DescuentoFrecuente;
    }
    //Get y Set únicamente para la clase hija
    public double getDescuentoFrecuente()throws IllegalStateException{ //Método obtener para el argumento descuento de la clase hija. Retorna el DescuentoFrecuente, el cual es un valor double.
        return this.descuentoFrecuente;
    }
      
    public void setDescuentoFrecuente(double new_DescuentoFrecuente){   //Método establecer para el argumento DescuentoFrecuente de la clase hija.  Void dado que no retorna valores, el cual es un valor DescuentoFrecuente.
        this.descuentoFrecuente = new_DescuentoFrecuente;
    }
    
    public double calculoAnuncio(int numero_letras, String seccion, double descuentoFrecuente){//Pasamos tres arguemtnos, la cantidad de letras, el String del Combobox de Seccion y el descuentoFrecuente ingresado por el usuario 
                                                              // El String Seccion representara el costo por letra.
    //Inicializamos
    double costo;
    int costoLetra = 0;
    descuentoFrecuente = descuentoFrecuente*0.01;
    
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
    costo = costoLetra*numero_letras*(1-descuentoFrecuente); //RÚBRICA: Costo del Anuncio con el descuento aplicado antes del IVA
    return costo; //Devuelve costo total del Anuncio
    }
    
    public double calculoAnuncioIVA(int numero_letras, String seccion,double descuentoFrecuente){
        double costoIVA;
        costoIVA = calculoAnuncio(numero_letras,seccion,descuentoFrecuente)*(1.13); //Aplica un 13% de IVA al costo sin IVA
        return costoIVA; //Devuelve el costo con IVA
    }
    
}
