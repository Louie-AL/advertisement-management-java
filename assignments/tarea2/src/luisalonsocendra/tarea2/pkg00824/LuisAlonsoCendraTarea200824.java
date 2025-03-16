
package luisalonsocendra.tarea2.pkg00824;

import javax.swing.SwingUtilities;

public class LuisAlonsoCendraTarea200824 {

    public static void main(String[] args) {   
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    //Creacion de un objeto de clase JFrame CalculadoraAnuncio()
                    CalculadoraAnuncio frame = new CalculadoraAnuncio();
                    frame.setSize(950, 650); //Tamaño
                    frame.setDefaultCloseOperation(CalculadoraAnuncio.EXIT_ON_CLOSE); //Salir al cerrar
                    frame.setVisible(true);
            }
        });
    }   
}