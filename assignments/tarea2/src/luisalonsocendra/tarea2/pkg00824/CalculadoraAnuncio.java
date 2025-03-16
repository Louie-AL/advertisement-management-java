
package luisalonsocendra.tarea2.pkg00824;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import javax.swing.JOptionPane; //Paquete de JFrame
import java.text.SimpleDateFormat;   //Paquete para formateo de fechas
import java.util.Calendar;
import java.util.Date;  //Paquete para manipulacion de fechas
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraAnuncio extends javax.swing.JFrame {


    public CalculadoraAnuncio() {
        initComponents();
        MilimetrosTextField.setEnabled(false);
        DescuentoFrecuenteTextField.setEnabled(false);
        MilimetrosLabel.setEnabled(false);
        DescuentoFrecuenteLabel.setEnabled(false);
        CheckBox.setEnabled(false);
        CalcularBoton.setEnabled(false);
        Tipo.setEnabled(false);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox<>();
        MilimetrosLabel = new javax.swing.JLabel();
        MilimetrosTextField = new javax.swing.JTextField();
        DescuentoFrecuenteLabel = new javax.swing.JLabel();
        DescuentoFrecuenteTextField = new javax.swing.JTextField();
        CheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo_Label.setText("Titulo");

        Desc_Label.setText("Descripcion");

        TerminarBoton.setText("Terminar");
        TerminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarBotonActionPerformed(evt);
            }
        });

        Seccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nacionales", "Internacionales", "Deportes", "Culturales", "Economicos" }));
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

        jLabel1.setText("Seleccione la sección del anuncio:");

        jLabel2.setText("Seleccione el tipo de anuncio");

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tradicional", "Con Imagen", "Cliente Frecuente" }));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        MilimetrosLabel.setText("Inserte los milímetros cuadrados de la imagen");

        MilimetrosTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MilimetrosTextFieldKeyPressed(evt);
            }
        });

        DescuentoFrecuenteLabel.setText("Inserte el descuento porcentual del cliente frecuente");

        DescuentoFrecuenteTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DescuentoFrecuenteTextFieldKeyPressed(evt);
            }
        });

        CheckBox.setText("Aplicar descuento");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("%");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescuentoFrecuenteLabel)
                    .addComponent(MilimetrosLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DescuentoFrecuenteTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MilimetrosTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Seccion, javax.swing.GroupLayout.Alignment.LEADING, 0, 175, Short.MAX_VALUE)
                            .addComponent(CalcularBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TerminarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(YYYYx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(CheckBox))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Desc_Label)
                            .addComponent(descripcion_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(CheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MilimetrosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MilimetrosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DescuentoFrecuenteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescuentoFrecuenteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(CalcularBoton)
                        .addGap(18, 18, 18)
                        .addComponent(TerminarBoton)))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TerminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarBotonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_TerminarBotonActionPerformed

    private void SeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionActionPerformed
        
        int seleccion = Seccion.getSelectedIndex();
        if(seleccion == 0){ //Deshabilitar los campos relacionados a todos los tipos de anuncios
            
            CalcularBoton.setEnabled(false);
            Tipo.setSelectedIndex(0);
            Tipo.setEnabled(false);
            
        }else if(seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4 || seleccion == 5){
            Tipo.setEnabled(true);
        }
    }//GEN-LAST:event_SeccionActionPerformed

    private void CalcularBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularBotonActionPerformed
        //Se crea el objeto y se llama al constructor sin argumentos
        AnuncioTradicional mi_Anuncio_Tradicional = new AnuncioTradicional();
        AnuncioImagen mi_Anuncio_Imagen = new AnuncioImagen();
        AnuncioFrecuente mi_Anuncio_Frecuente = new AnuncioFrecuente();
        
        //Strings de los argumentos inicializados
        String titulo = "";
        String descripcion = "";
        String seccion = "";
        boolean descuento = false;
        double milimetros = 0.0;
        double descuentoFrecuente = 0.0;
        int selection = Tipo.getSelectedIndex();
        int seleccion_seccion = Tipo.getSelectedIndex();
        
        
        if(selection == 0 || seleccion_seccion == 0){ //Debe seleccionar un tipo de anuncio
            JOptionPane.showMessageDialog(null,"Por favor, seleccione la sección y el tipo de anuncio antes de avanzar.","Atención",2);
        }else{
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
                Logger.getLogger(CalculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
            }

            try{ //Asignamos a los argumentos los valores de los JTextFields
                titulo = titulo_JText.getText();
                descripcion = descripcion_JText.getText();
                seccion = Seccion.getSelectedItem().toString();
                if(selection == 2){
                    milimetros = Double.parseDouble(MilimetrosTextField.getText());
                }

                if (CheckBox.isSelected()) {
                    descuento = true;
                } else {
                    descuento = false;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: Ingrese un valor válido.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: No es posible dividir entre cero. Ingrese un valor válido.");
 
            }
            
            try{
                if(selection == 3){
                        descuentoFrecuente = Double.parseDouble(DescuentoFrecuenteTextField.getText());
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: Ingrese un valor válido.");
                DescuentoFrecuenteTextField.setText(null);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: No es posible dividir entre cero. Ingrese un valor válido.");
            }
            //Título y descripción no vacíos  
            if (titulo.isEmpty() || descripcion.isEmpty()){
                JOptionPane.showMessageDialog(null," Porfavor, ingrese un título y/o una descripción no vacíos.","Atención",2);
            
            //Titulo de máximo de 15 caracteres
            }else if(titulo.length()>15){ 
                JOptionPane.showMessageDialog(null," Porfavor, ingrese un título de no más de 15 caracteres.","Atención",2);

            //Validación de las fechas. Si la fecha ingresada es una fecha más temprana que la fecha de hoy, el compare tira un TRUE y se entra al IF
            }else if(selection == 3 && DescuentoFrecuenteTextField.getText().isEmpty()){
                JOptionPane.showMessageDialog(null," Porfavor, ingrese un descuento no vacío.","Atención",2);
            }else if (ingresada.compareTo(hoy) < 0) {
                JOptionPane.showMessageDialog(null," La fecha ingresada está antes de la fecha de hoy.","Atención",2);
    
            //Validación de los campos relacionados a la opción milímetros
            }else if (selection == 2 && (milimetros == 0.0 || milimetros < 0.0)) {
                JOptionPane.showMessageDialog(null,"Al escoger la opción Con Imagen, debe insertar la cantidad de milímetros cuadrados de la imagen.\nÉsta debe ser un número positivo.","Atención",2);

            //Validación de los campos relacionados a la opción Cliente Frecuente
            }else if (selection == 3 && (descuentoFrecuente < 0.0 || descuentoFrecuente > 100.0)) {
                JOptionPane.showMessageDialog(null,"Al escoger la opción de Cliente Frecuente, debe insertar el descuento que desea aplicar.\nÉste debe ser un número positivo en el rango [0, 100].\nAsí, al ingresar 5 el descuento será de 5%, y al ingresar 50, será de 50%.\nNote que un descuento de 100% implica que el anuncio tendrá costo 0.","Atención",2);
            
            //Si nunguna validación falla entre a los cálculos
            }else{

                //Toma los lengths de título y descripción para contabilizar el número de caracteres del Anuncio

                int num_Titulo = titulo.length();
                int num_Descripcion = descripcion.length();
                int numero_Letras = num_Titulo + num_Descripcion;

                //Inicializa las variables de costos
                
                double costoSinIVA = 0;
                double costoIVA = 0;
                double IVA = 0;
                
                //Usa el método de establecer de las clases hijas de Anuncio para establecer los argumentos de los objetos de las tres distintas clases
                if(selection == 1){ //Debe seleccionar un tipo de anuncio
                
                    //Para anuncio tradicional, creamos un objeto para los cálculos
                    mi_Anuncio_Tradicional.setDescuento(descuento);
                    mi_Anuncio_Tradicional.setTitulo(titulo);  
                    mi_Anuncio_Tradicional.setDescripcion(descripcion);
                    mi_Anuncio_Tradicional.setSeccion(seccion);
                
                    //Utiliza los métodos de calculo definidos para la subclase AnuncioTradicional para obtener el costo con/sin IVA del Anuncio, incluimos el booleano descuento
                    costoSinIVA = mi_Anuncio_Tradicional.calculoAnuncio(numero_Letras, seccion,descuento);
                    costoIVA = mi_Anuncio_Tradicional.calculoAnuncioIVA(numero_Letras, seccion,descuento);
                    IVA = costoIVA - costoSinIVA;
                    
                }else if(selection == 2){ //Debe seleccionar un tipo de anuncio
                    
                    //Para anuncio con imagen, creamos un objeto para los cálculos
                    mi_Anuncio_Imagen.setMilimetros(milimetros);
                    mi_Anuncio_Imagen.setTitulo(titulo);  
                    mi_Anuncio_Imagen.setDescripcion(descripcion);
                    mi_Anuncio_Imagen.setSeccion(seccion);

                    //Utiliza los métodos de calculo definidos para la subclase AnuncioImagen para obtener el costo con/sin IVA del Anuncio, incluimos el double milimetros
                    costoSinIVA = mi_Anuncio_Imagen.calculoAnuncio(numero_Letras, seccion,milimetros);
                    costoIVA = mi_Anuncio_Imagen.calculoAnuncioIVA(numero_Letras, seccion,milimetros);
                    IVA = costoIVA - costoSinIVA;
                    
                }else if(selection == 3){ //Debe seleccionar un tipo de anuncio
                    
                    //Para anuncio Cliente Frecuente, creamos un objeto para los cálculos
                    mi_Anuncio_Frecuente.setDescuentoFrecuente(descuentoFrecuente);
                    mi_Anuncio_Frecuente.setTitulo(titulo);  
                    mi_Anuncio_Frecuente.setDescripcion(descripcion);
                    mi_Anuncio_Frecuente.setSeccion(seccion);

                    //Utiliza los métodos de calculo definidos para la subclase AnuncioFrecuente para obtener el costo con/sin IVA del Anuncio, incluimos el double descuentoFrecuente
                    costoSinIVA = mi_Anuncio_Frecuente.calculoAnuncio(numero_Letras, seccion, descuentoFrecuente);
                    costoIVA = mi_Anuncio_Frecuente.calculoAnuncioIVA(numero_Letras, seccion, descuentoFrecuente);
                    IVA = costoIVA - costoSinIVA;
                }
                
                JOptionPane.showMessageDialog(null, "Costo sin IVA: " + Double.toString(costoSinIVA)+"\n"+"IVA: " + Double.toString(round(IVA,2)) + "\n" + "Costo con IVA: " + Double.toString(round(costoIVA,2)));
                }
        }
    }//GEN-LAST:event_CalcularBotonActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        
        int selection = Tipo.getSelectedIndex();
        if(selection == 0){ //Deshabilitar los campos relacionados a todos los tipos de anuncios
            
            MilimetrosTextField.setEnabled(false);
            MilimetrosLabel.setEnabled(false);
            DescuentoFrecuenteTextField.setEnabled(false);
            DescuentoFrecuenteLabel.setEnabled(false);
            CheckBox.setEnabled(false);
            CheckBox.setSelected(false);
            MilimetrosTextField.setText(null);
            DescuentoFrecuenteTextField.setText(null);
            
            
        }else if (selection == 1){
            
            CheckBox.setEnabled(true);  //Si se selecciona Tradicional, habilitar los campos relacionados y deshabilitar los no relacionados
            DescuentoFrecuenteTextField.setEnabled(false);
            DescuentoFrecuenteLabel.setEnabled(false);
            MilimetrosTextField.setEnabled(false);
            MilimetrosLabel.setEnabled(false);
            CalcularBoton.setEnabled(true);
            MilimetrosTextField.setText(null);
            DescuentoFrecuenteTextField.setText(null);

            
        }else if (selection == 2){
            
            MilimetrosTextField.setEnabled(true); //Si se selecciona Con Imagen, habilitar los campos relacionados y deshabilitar los no relacionados
            MilimetrosLabel.setEnabled(true);
            DescuentoFrecuenteTextField.setEnabled(false);
            DescuentoFrecuenteLabel.setEnabled(false);
            CheckBox.setEnabled(false);
            CalcularBoton.setEnabled(true);
            CheckBox.setSelected(false);
            DescuentoFrecuenteTextField.setText(null);
            
        }else if (selection == 3){
            
            DescuentoFrecuenteTextField.setEnabled(true); //Si se selecciona Cliente Frecuente, habilitar los campos relacionados y deshabilitar los no relacionados
            DescuentoFrecuenteLabel.setEnabled(true);
            MilimetrosTextField.setEnabled(false);
            MilimetrosLabel.setEnabled(false);
            CheckBox.setEnabled(false);
            CalcularBoton.setEnabled(true);
            CheckBox.setSelected(false);
            MilimetrosTextField.setText(null);
            
        }
    }//GEN-LAST:event_TipoActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void MilimetrosTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MilimetrosTextFieldKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            MilimetrosTextField.setEditable(false); //No es posible entrar un caracter que no sea numero
            JOptionPane.showMessageDialog(null,"Al escoger la opción Con Imagen, debe insertar la cantidad de milímetros cuadrados de la imagen.\nÉsta debe ser un número positivo.","Atención",2);

        }else{
            MilimetrosTextField.setEditable(true);
        }
    }//GEN-LAST:event_MilimetrosTextFieldKeyPressed

    private void DescuentoFrecuenteTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescuentoFrecuenteTextFieldKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            DescuentoFrecuenteTextField.setEditable(false); //No es posible entrar un caracter que no sea numero
            JOptionPane.showMessageDialog(null,"Al escoger la opción de Cliente Frecuente, debe insertar el descuento que desea aplicar.\nÉste debe ser un número positivo en el rango [0, 100].\nAsí, al ingresar 5 el descuento será de 5%, y al ingresar 50, será de 50%.\nNote que un descuento de 100% implica que el anuncio tendrá costo 0.","Atención",2);

        }else{
            DescuentoFrecuenteTextField.setEditable(true);
        }
    }//GEN-LAST:event_DescuentoFrecuenteTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(CalculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraAnuncio().setVisible(true);
            }
        });
    }
    
    public static double round(double value, int places) {  //Función para redondear los valores de costos, para una visualización más clara
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularBoton;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JComboBox<String> DDx;
    private javax.swing.JLabel Desc_Label;
    private javax.swing.JLabel DescuentoFrecuenteLabel;
    private javax.swing.JTextField DescuentoFrecuenteTextField;
    private javax.swing.JComboBox<String> MMx;
    private javax.swing.JLabel MilimetrosLabel;
    private javax.swing.JTextField MilimetrosTextField;
    private javax.swing.JComboBox<String> Seccion;
    private javax.swing.JButton TerminarBoton;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JLabel Titulo_Label;
    private javax.swing.JComboBox<String> YYYYx;
    private javax.swing.JTextField descripcion_JText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField titulo_JText;
    // End of variables declaration//GEN-END:variables
}