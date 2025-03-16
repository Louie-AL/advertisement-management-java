
package luisalonsocendra.tarea1.pkg00824;

import javax.swing.SwingUtilities;

public class LuisAlonsoCendraTarea100824 {

    public static void main(String[] args) {   
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    //Creacion de un objeto de clase JFrame CalculadoraPersona()
                    CalculadoraPersona frame = new CalculadoraPersona();
                    frame.setSize(950, 650); //Tamaño
                    frame.setDefaultCloseOperation(CalculadoraPersona.EXIT_ON_CLOSE); //Salir al cerrar
                    frame.setVisible(true);
            }
        });
    }   
}