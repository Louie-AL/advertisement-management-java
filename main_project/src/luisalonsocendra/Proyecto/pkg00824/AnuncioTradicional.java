/*RÚBRICA: Anuncio tradicional
 * o Atributos adicionales
 *                          Con descuento o sin descuento
 * o Métodos nuevos o mejorados
 *                          CalcularAnuncio: se aplica descuento al costo del anuncio antes de 
 *                          IVA cuando el nuevo atributo está en valor verdadero. El descuento a 
 *                          aplicar depende según cantidad de letras incluidas en el anuncio. El 
 *                          descuesto se basa en el siguiente cuadro:
 */
package luisalonsocendra.Proyecto.pkg00824;

public class AnuncioTradicional extends Anuncio { //Utilizamos herencia, con la superclase siendo Anuncio
    private boolean descuento; //Atributos de las clases hijas se declaran como private
    
    public AnuncioTradicional(){ //Constructor sin argumentos. Inicialización nula.
        super();
        this.descuento = false;
    }
    
    public AnuncioTradicional(String titulo,String descripcion,String seccion, String clienteID, boolean new_Descuento){//Constructor con argumentos
        super(titulo,descripcion,seccion,clienteID);
        this.descuento = new_Descuento;
    }
    //Get y Set únicamente para la clase hija
    public boolean getDescuento()throws IllegalStateException{ //Método obtener para el argumento descuento de la clase hija. Retorna el descuento, el cual es un valor boolean.
        return this.descuento;
    }
      
    public void setDescuento(boolean new_Descuento){   //Método establecer para el argumento descuento de la clase hija.  Void dado que no retorna valores, el cual es un valor descuento.
        this.descuento = new_Descuento;
    }
    
    public double calculoAnuncio(int numero_letras, String seccion,boolean descuento){//Pasamos dos arguemtnos, la cantidad de letras y el String del Combobox de Seccion. 
                                                                  // El String Seccion representara el costo por letra.
        //Inicializamos
        double costo;
        int costoLetra = 0;
        double descuento_porcentaje = 0.00;

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
        if(descuento == true){
            switch ((15 <= numero_letras && numero_letras < 20 ) ? 0 :
                    (20 <= numero_letras && numero_letras < 25) ? 1 :
                    (25 <= numero_letras && numero_letras < 30) ? 2 :
                    (30 <= numero_letras && numero_letras < 35) ? 3 :
                    (35 <= numero_letras && numero_letras < 40) ? 4 :
                    (40 <= numero_letras && numero_letras < 45) ? 5 :
                    (45 <= numero_letras && numero_letras < 50) ? 6 :
                    (50 <= numero_letras) ? 7 : 8) { //Usamos un switch, dependiendo del valor del número de letras del anuncio (contando ambos título y descripción)

                    case 0:
                        descuento_porcentaje = 0.03;
                        break;
                    case 1:
                        descuento_porcentaje = 0.06;
                        break;
                    case 2:
                        descuento_porcentaje = 0.09;
                        break;
                    case 3:
                        descuento_porcentaje = 0.12;
                        break;
                    case 4:
                        descuento_porcentaje = 0.15;
                        break;
                    case 5:
                        descuento_porcentaje = 0.18;
                        break;
                    case 6:
                        descuento_porcentaje = 0.21;
                        break;
                    case 7:
                        descuento_porcentaje = 0.24;
                        break;
                    case 8:
                        descuento_porcentaje = 0.00;
                        break;

            }
        }
        costo = costoLetra*numero_letras*(1-descuento_porcentaje); //Costo del Anuncio
        return costo; //Devuelve costo total del Anuncio
    }
    
    public double calculoAnuncioIVA(int numero_letras, String seccion, boolean descuento){
        double costoIVA;
        costoIVA = calculoAnuncio(numero_letras,seccion,descuento)*(1.13); //Aplica un 13% de IVA al costo sin IVA
        return costoIVA; //Devuelve el costo con IVA
    }
    

}
