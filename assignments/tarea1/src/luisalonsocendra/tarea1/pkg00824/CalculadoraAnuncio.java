
package luisalonsocendra.tarea1.pkg00824;

import java.text.ParseException;
import javax.swing.JOptionPane; //Paquete de JFrame
import java.text.SimpleDateFormat;   //Paquete para formateo de fechas
import java.util.Calendar;
import java.util.Date;  //Paquete para manipulacion de fechas
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraPersona extends javax.swing.JFrame {


    public CalculadoraPersona() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_JText = new javax.swing.JTextField();
        descripcion_JText = new javax.swing.JTextField();
        Titulo_Label = new javax.swing.JLabel();
        Desc_Label = new javax.swing.JLabel();
        TerminarBoton = new javax.swing.JButton();
        Seccion = new javax.swing.JComboBox<>();
        CalcularBoton = new javax.swing.JButton();
        DDx = new javax.swing.JComboBox<>();
        YYYYx = new javax.swing.JComboBox<>();
        MMx = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo_Label.setText("Titulo");

        Desc_Label.setText("Descripcion");

        TerminarBoton.setText("Terminar");
        TerminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarBotonActionPerformed(evt);
            }
        });

        Seccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionales", "Internacionales", "Deportes", "Culturales", "Economicos" }));
        Seccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccionActionPerformed(evt);
            }
        });

        CalcularBoton.setText("Calcular Costo");
        CalcularBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularBotonActionPerformed(evt);
            }
        });

        DDx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        YYYYx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029" }));

        MMx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel3.setText("Día");

        jLabel4.setText("Mes");

        jLabel5.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Titulo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Desc_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo_JText, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(descripcion_JText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Seccion, javax.swing.GroupLayout.Alignment.LEADING, 0, 175, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CalcularBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TerminarBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DDx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MMx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(YYYYx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo_Label)
                    .addComponent(DDx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YYYYx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MMx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Desc_Label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CalcularBoton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TerminarBoton))
                        .addComponent(descripcion_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TerminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarBotonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_TerminarBotonActionPerformed

    private void SeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionActionPerformed
        
    }//GEN-LAST:event_SeccionActionPerformed

    private void CalcularBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularBotonActionPerformed
        //Se crea el objeto y se llama al constructor sin argumentos
        Persona mi_Persona = new Persona();
        
        //Strings de los argumentos inicializados
        String titulo = "";
        String descripcion = "";
        String seccion = "";
        
        //Strings y Dates para la validación de la fecha ingresada
        String DD = DDx.getSelectedItem().toString();
        String MM = MMx.getSelectedItem().toString();
        String YYYY = YYYYx.getSelectedItem().toString(); 
        String fecha_Ingresada = YYYY+"-"+MM+"-"+DD; //String de la fecha ingresada por el usuario
        Date hoy = null;
        Date ingresada = null;
        //Creacion de un elemento String con la fecha de hoy
        Date Fecha_Hoy = Calendar.getInstance().getTime();
        SimpleDateFormat formatoHoy = new SimpleDateFormat("yyyy-MM-dd");
        String FechaHoy = formatoHoy.format(Fecha_Hoy);
        //El try catch de abajo lee los strings y los asigna a los elementos Date inicializados arriba
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            hoy = formato.parse(FechaHoy);
            ingresada = formato.parse(fecha_Ingresada);
        } catch (ParseException ex) {
            Logger.getLogger(CalculadoraPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        try{ //Asignamos a los argumentos los valores de los JTextFields
            titulo = titulo_JText.getText();
            descripcion = descripcion_JText.getText();
            seccion = Seccion.getSelectedItem().toString();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: Ingrese un valor válido.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: No es posible dividir entre cero. Ingrese un valor válido.");
        
        //Título y descripción no vacíos    
        } if (titulo.isEmpty() || descripcion.isEmpty()){ 
            JOptionPane.showMessageDialog(null," Porfavor, ingrese un título y/o una descripción no vacíos.","Atención",2);
        
        //Titulo de máximo de 15 caracteres
        }else if(titulo.length()>15){ 
            JOptionPane.showMessageDialog(null," Porfavor, ingrese un título de no más de 15 caracteres.","Atención",2);
        //Validación de las fechas. Si la fecha ingresada es una fecha más temprana que la fecha de hoy, el compare tira un TRUE y se entra al IF
        }else if (ingresada.compareTo(hoy) < 0) {
            JOptionPane.showMessageDialog(null," La fecha ingresada está antes de la fecha de hoy.","Atención",2);
        }else{
        
        //Usa el método de establecer de la clase Persona para establecer los argumentos del| objeto mi_Persona
        mi_Persona.setTitulo(titulo);  
        mi_Persona.setDescripcion(descripcion);
        mi_Persona.setSeccion(seccion);
        
        //Toma los lengths de título y descripción para contabilizar el número de caracteres del Persona
        int num_Titulo = titulo.length();
        int num_Descripcion = descripcion.length();
        int numero_Letras = num_Titulo + num_Descripcion;
        
        double costoSinIVA;
        double costoIVA;
        double IVA;
        
        //Utiliza los métodos de calculo definidos para la clase Persona para obtener el costo con/sin IVA del Persona
        costoSinIVA = mi_Persona.calculoCosto(numero_Letras, seccion);
        costoIVA = mi_Persona.calculoCostoIVA(numero_Letras, seccion);
        costoIVA = Math.floor(costoIVA * 100) / 100;//Se redondea a dos decimales usando la funcion floor()
                                              //Si costoIVA = 12345.6732 entonces costoIVA*100 = 1234567.32
                                              //floor(costoIVA*100) = 1234567 entonces floor(costoIVA*100)/100 = 12345.67
        IVA = costoIVA - costoSinIVA;
        
        JOptionPane.showMessageDialog(null, "Costo sin IVA: " + Double.toString(costoSinIVA)+"\n"+"IVA: " + Double.toString(IVA) + "\n" + "Costo con IVA: " + Double.toString(costoIVA));
        }
    }//GEN-LAST:event_CalcularBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraPersona().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularBoton;
    private javax.swing.JComboBox<String> DDx;
    private javax.swing.JLabel Desc_Label;
    private javax.swing.JComboBox<String> MMx;
    private javax.swing.JComboBox<String> Seccion;
    private javax.swing.JButton TerminarBoton;
    private javax.swing.JLabel Titulo_Label;
    private javax.swing.JComboBox<String> YYYYx;
    private javax.swing.JTextField descripcion_JText;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField titulo_JText;
    // End of variables declaration//GEN-END:variables
}