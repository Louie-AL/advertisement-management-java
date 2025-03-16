package luisalonsocendra.Proyecto.pkg00824;

import java.awt.Component;
import java.awt.Container;
import java.io.*;
import java.io.ObjectOutputStream; //Usamos ObjectIOStreams para el manejo de archivos
import java.math.BigDecimal; //Utilizado en funcion de redondeo
import java.math.RoundingMode; //Utilizado en funcion de redondeo
import java.text.ParseException;//Manejo de excepciones al leer Forms
import javax.swing.JOptionPane; //Paquete de JFrame
import java.text.SimpleDateFormat;   //Paquete para formateo de fechas
import java.util.ArrayList; //Utilizamos collections para manejo de listas
import java.util.Calendar; //Utilizado en validacion de la fecha de la cotizacion del anuncio
import java.util.Date;  //Paquete para manipulacion de fechas
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class CalculadoraAnuncio extends javax.swing.JFrame {

    //Arraylist que guardara los clientes
    ArrayList<Cliente> lista_clientes = new ArrayList<Cliente>();

    //Arraylist que guardara los anuncios
    ArrayList<Anuncio> lista_anuncios = new ArrayList<Anuncio>();

    //IO basado en objetos. Dos, uno input y otro output, para cada archivo clientes.dat y anuncios.dat
    ObjectInputStream ios_clientes = null;
    ObjectOutputStream oos_clientes = null;
    ObjectOutputStream oos_anuncio = null;
    ObjectInputStream ios_anuncio = null;

    //Inicializar componentes
    public CalculadoraAnuncio() {
        initComponents();

        //Restringimos acceso a ciertos componentes 
        MilimetrosTextField.setEnabled(false);
        DescuentoFrecuenteTextField.setEnabled(false);
        MilimetrosLabel.setEnabled(false);
        DescuentoFrecuenteLabel.setEnabled(false);
        CheckBox.setEnabled(false);
        CalcularBoton.setEnabled(false);
        Tipo.setEnabled(false);

        //Si el archivo no existe, ignorar. 
        //Si el archivo existe, cargue los datos de los archivos a las listas, apenas inicia el programa.
        File tmpDir_c = new File("clientes.dat");
        boolean archivo_clientes_existe = tmpDir_c.exists();
        File tmpDir_a = new File("anuncios.dat");
        boolean archivo_anuncios_existe = tmpDir_a.exists();
        if (archivo_clientes_existe && archivo_anuncios_existe) {
            leerArchivoClientes();
            leerArchivoAnuncios();
            ActualizarArchivoClientes(lista_clientes, "clientes.dat");
            ActualizarArchivoAnuncios(lista_anuncios, "anuncios.dat");

            //Si solo existe clientes pero no anuncios, lea clientes y cree anuncios
        } else if (archivo_clientes_existe && !archivo_anuncios_existe) {
            leerArchivoClientes();
            ActualizarArchivoClientes(lista_clientes, "clientes.dat");

            File crear_anuncios = new File("anuncios.dat");
            try {
                crear_anuncios.createNewFile();
                FileOutputStream aFile = new FileOutputStream(crear_anuncios, false);
            } catch (IOException ex) {
                Logger.getLogger(CalculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Si solo existe anuncios pero no clientes, lea anuncios y cree clientes
        } else if (!archivo_clientes_existe && archivo_anuncios_existe) { //Caso no probable dado que todo anuncio debe estar ligado a un cliente ya existente. Pero se incluye por completitud.
            leerArchivoAnuncios();
            ActualizarArchivoAnuncios(lista_anuncios, "anuncios.dat");

            File crear_clientes = new File("clientes.dat");
            try {
                crear_clientes.createNewFile();
                FileOutputStream cFile = new FileOutputStream(crear_clientes, false);
            } catch (IOException ex) {
                Logger.getLogger(CalculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {//Si no existen, crearlos
            File crear_clientes = new File("clientes.dat");
            File crear_anuncios = new File("anuncios.dat");
            try {
                crear_clientes.createNewFile();
                FileOutputStream cFile = new FileOutputStream(crear_clientes, false);
                crear_anuncios.createNewFile();
                FileOutputStream aFile = new FileOutputStream(crear_anuncios, false);

            } catch (IOException ex) {
                Logger.getLogger(CalculadoraAnuncio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clientes = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        Dialog_ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Dialog_Nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Dialog_Apellido_1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Dialog_Apellido_2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Dialog_Edad = new javax.swing.JTextField();
        Enviar_Boton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Dialog_ComboBox = new javax.swing.JComboBox<>();
        Regresar_Boton = new javax.swing.JButton();
        Display = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Cerrar_tabla = new javax.swing.JButton();
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
        jLabel14 = new javax.swing.JLabel();
        cliente_JText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        Agregar_Menu = new javax.swing.JMenuItem();
        Actualizar_Menu = new javax.swing.JMenuItem();
        Eliminar_Menu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Registro_ID = new javax.swing.JMenuItem();
        Registro_TipoServ = new javax.swing.JMenuItem();
        Registro_Hist = new javax.swing.JMenuItem();

        jLabel7.setText("Identificación");

        Dialog_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dialog_IDActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        jLabel9.setText("Apellido 1");

        jLabel10.setText("Apellido 2");

        jLabel11.setText("Edad");

        Enviar_Boton.setText("Enviar");
        Enviar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviar_BotonActionPerformed(evt);
            }
        });

        jLabel12.setText("Registro de Clientes");

        jLabel13.setText("Acción");

        Dialog_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Agregar", "Actualizar", "Eliminar" }));
        Dialog_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dialog_ComboBoxActionPerformed(evt);
            }
        });

        Regresar_Boton.setText("Regresar");
        Regresar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar_BotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes.getContentPane());
        Clientes.getContentPane().setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel12)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Dialog_Nombre)
                    .addComponent(Dialog_Apellido_1)
                    .addComponent(Dialog_Apellido_2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Dialog_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Dialog_Edad)
                            .addComponent(Dialog_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClientesLayout.createSequentialGroup()
                        .addComponent(Enviar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regresar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Dialog_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dialog_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Dialog_Apellido_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dialog_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Dialog_Apellido_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Dialog_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar_Boton)
                    .addComponent(Enviar_Boton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido 1", "Apellido 2", "Tipo de Servicio", "Titulo de Anuncio", "Costo"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        Cerrar_tabla.setText("Cerrar");
        Cerrar_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_tablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DisplayLayout = new javax.swing.GroupLayout(Display.getContentPane());
        Display.getContentPane().setLayout(DisplayLayout);
        DisplayLayout.setHorizontalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cerrar_tabla)))
                .addContainerGap())
        );
        DisplayLayout.setVerticalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cerrar_tabla)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo_JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo_JTextActionPerformed(evt);
            }
        });

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

        jLabel14.setText("ID del Cliente");

        jLabel15.setText("Cotización de Anuncio");

        jMenu4.setText("Clientes");

        Agregar_Menu.setText("Agregar");
        Agregar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_MenuActionPerformed(evt);
            }
        });
        jMenu4.add(Agregar_Menu);

        Actualizar_Menu.setText("Actualizar");
        Actualizar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_MenuActionPerformed(evt);
            }
        });
        jMenu4.add(Actualizar_Menu);

        Eliminar_Menu.setText("Eliminar");
        Eliminar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_MenuActionPerformed(evt);
            }
        });
        jMenu4.add(Eliminar_Menu);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Reportes");

        Registro_ID.setText("Filtro por id cliente");
        Registro_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro_IDActionPerformed(evt);
            }
        });
        jMenu3.add(Registro_ID);

        Registro_TipoServ.setText("Filtro por tipo de servicio");
        Registro_TipoServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro_TipoServActionPerformed(evt);
            }
        });
        jMenu3.add(Registro_TipoServ);

        Registro_Hist.setText("Filtro de información histórica");
        Registro_Hist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro_HistActionPerformed(evt);
            }
        });
        jMenu3.add(Registro_Hist);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Titulo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Desc_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descripcion_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titulo_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cliente_JText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(255, 255, 255)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo_Label)
                    .addComponent(DDx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YYYYx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MMx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cliente_JText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TerminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarBotonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_TerminarBotonActionPerformed

    private void SeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionActionPerformed

        int seleccion = Seccion.getSelectedIndex();
        if (seleccion == 0) { //Deshabilitar los campos relacionados a todos los tipos de anuncios hasta que una seleccion aparte de la default ocurra

            CalcularBoton.setEnabled(false);
            Tipo.setSelectedIndex(0);
            Tipo.setEnabled(false);

        } else if (seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4 || seleccion == 5) {
            Tipo.setEnabled(true);
        }
    }//GEN-LAST:event_SeccionActionPerformed

    private void CalcularBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularBotonActionPerformed
        //Se crea el objeto y se llama al constructor sin argumentos
        AnuncioTradicional mi_Anuncio_Tradicional = new AnuncioTradicional();
        AnuncioImagen mi_Anuncio_Imagen = new AnuncioImagen();
        AnuncioFrecuente mi_Anuncio_Frecuente = new AnuncioFrecuente();

        //Variables inicializadas
        String titulo = "";
        String descripcion = "";
        String seccion = "";
        String iden_cliente = "";
        boolean descuento = false;
        double milimetros = 0.0;
        double descuentoFrecuente = 0.0;
        int selection = Tipo.getSelectedIndex();
        int seleccion_seccion = Tipo.getSelectedIndex();

        if (selection == 0 || seleccion_seccion == 0) { //Debe seleccionar un tipo de anuncio
            JOptionPane.showMessageDialog(null, "Por favor, seleccione la sección y el tipo de anuncio antes de avanzar.", "Atención", 2);
        } else {
            //Strings y Dates para la validación de la fecha ingresada
            String DD = DDx.getSelectedItem().toString();
            String MM = MMx.getSelectedItem().toString();
            String YYYY = YYYYx.getSelectedItem().toString();
            String fecha_Ingresada = YYYY + "-" + MM + "-" + DD; //String de la fecha ingresada por el usuario
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

            try { //Asignamos a los argumentos los valores de los JTextFields
                titulo = titulo_JText.getText();
                descripcion = descripcion_JText.getText();
                iden_cliente = cliente_JText.getText();
                seccion = Seccion.getSelectedItem().toString();
                //Leer campos para milimetros que es seleccion 2
                if (selection == 2) {
                    milimetros = Double.parseDouble(MilimetrosTextField.getText());
                }
                //Checkbox para descuento que es para Tradicional, seleccion 1
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

            try {
                //Leer descecuento para cliente frecuente, que es seleccion 3
                if (selection == 3) {
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
            if (titulo.isEmpty() || descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, " Porfavor, ingrese un título y/o una descripción no vacíos.", "Atención", 2);

                //Validación de la ID del Cliente
            } else if (iden_cliente.isEmpty()) {
                JOptionPane.showMessageDialog(null, " Porfavor, ingrese la identificación del Cliente.", "Atención", 2);
                //Titulo de máximo de 15 caracteres
            } else if (titulo.length() > 15) {
                JOptionPane.showMessageDialog(null, " Porfavor, ingrese un título de no más de 15 caracteres.", "Atención", 2);

                //Validación de las fechas. Si la fecha ingresada es una fecha más temprana que la fecha de hoy, el compare tira un TRUE y se entra al IF
            } else if (selection == 3 && DescuentoFrecuenteTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, " Porfavor, ingrese un descuento no vacío.", "Atención", 2);
            } else if (ingresada.compareTo(hoy) < 0) {
                JOptionPane.showMessageDialog(null, " La fecha ingresada está antes de la fecha de hoy.", "Atención", 2);

                //Validación de los campos relacionados a la opción milímetros
            } else if (selection == 2 && (milimetros == 0.0 || milimetros < 0.0)) {
                JOptionPane.showMessageDialog(null, "Al escoger la opción Con Imagen, debe insertar la cantidad de milímetros cuadrados de la imagen.\nÉsta debe ser un número positivo.", "Atención", 2);

                //Validación de los campos relacionados a la opción Cliente Frecuente
            } else if (selection == 3 && (descuentoFrecuente < 0.0 || descuentoFrecuente > 100.0)) {
                JOptionPane.showMessageDialog(null, "Al escoger la opción de Cliente Frecuente, debe insertar el descuento que desea aplicar.\nÉste debe ser un número positivo en el rango [0, 100].\nAsí, al ingresar 5 el descuento será de 5%, y al ingresar 50, será de 50%.\nNote que un descuento de 100% implica que el anuncio tendrá costo 0.", "Atención", 2);

                //Si ninguna validación falla entre a los cálculos
            } else {

                //Toma los lengths de título y descripción para contabilizar el número de caracteres del Anuncio
                int num_Titulo = titulo.length();
                int num_Descripcion = descripcion.length();
                int numero_Letras = num_Titulo + num_Descripcion;

                //Inicializa las variables de costos
                double costoSinIVA = 0;
                double costoIVA = 0;
                double IVA = 0;

                //Usa el método de establecer de las clases hijas de Anuncio para establecer los argumentos de los objetos de las tres distintas clases
                if (selection == 1) { //Debe seleccionar un tipo de anuncio

                    //Para anuncio tradicional, creamos un objeto para los cálculos
                    mi_Anuncio_Tradicional.setDescuento(descuento);
                    mi_Anuncio_Tradicional.setTitulo(titulo);
                    mi_Anuncio_Tradicional.setDescripcion(descripcion);
                    mi_Anuncio_Tradicional.setSeccion(seccion);
                    mi_Anuncio_Tradicional.setclienteID(iden_cliente);

                    //Utiliza los métodos de calculo definidos para la subclase AnuncioTradicional para obtener el costo con/sin IVA del Anuncio, incluimos el booleano descuento
                    costoSinIVA = mi_Anuncio_Tradicional.calculoAnuncio(numero_Letras, seccion, descuento);
                    costoIVA = mi_Anuncio_Tradicional.calculoAnuncioIVA(numero_Letras, seccion, descuento);
                    IVA = costoIVA - costoSinIVA;

                } else if (selection == 2) { //Debe seleccionar un tipo de anuncio

                    //Para anuncio con imagen, creamos un objeto para los cálculos
                    mi_Anuncio_Imagen.setMilimetros(milimetros);
                    mi_Anuncio_Imagen.setTitulo(titulo);
                    mi_Anuncio_Imagen.setDescripcion(descripcion);
                    mi_Anuncio_Imagen.setSeccion(seccion);
                    mi_Anuncio_Imagen.setclienteID(iden_cliente);

                    //Utiliza los métodos de calculo definidos para la subclase AnuncioImagen para obtener el costo con/sin IVA del Anuncio, incluimos el double milimetros
                    costoSinIVA = mi_Anuncio_Imagen.calculoAnuncio(numero_Letras, seccion, milimetros);
                    costoIVA = mi_Anuncio_Imagen.calculoAnuncioIVA(numero_Letras, seccion, milimetros);
                    IVA = costoIVA - costoSinIVA;

                } else if (selection == 3) { //Debe seleccionar un tipo de anuncio

                    //Para anuncio Cliente Frecuente, creamos un objeto para los cálculos
                    mi_Anuncio_Frecuente.setDescuentoFrecuente(descuentoFrecuente);
                    mi_Anuncio_Frecuente.setTitulo(titulo);
                    mi_Anuncio_Frecuente.setDescripcion(descripcion);
                    mi_Anuncio_Frecuente.setSeccion(seccion);
                    mi_Anuncio_Frecuente.setclienteID(iden_cliente);

                    //Utiliza los métodos de calculo definidos para la subclase AnuncioFrecuente para obtener el costo con/sin IVA del Anuncio, incluimos el double descuentoFrecuente
                    costoSinIVA = mi_Anuncio_Frecuente.calculoAnuncio(numero_Letras, seccion, descuentoFrecuente);
                    costoIVA = mi_Anuncio_Frecuente.calculoAnuncioIVA(numero_Letras, seccion, descuentoFrecuente);
                    IVA = costoIVA - costoSinIVA;
                }
                //Presentar una ventana de confirmacion que despligue la cotizacion y pregunte al usuario si desea aceptar la cotizacion
                int msg_Cotizar = JOptionPane.showConfirmDialog(null, "Costo sin IVA: " + Double.toString(costoSinIVA) + "\n" + "IVA: " + Double.toString(round(IVA, 2)) + "\n" + "Costo con IVA: " + Double.toString(round(costoIVA, 2)) + "\n" + "\n" + "¿Desea el cliente aceptar la cotización del anuncio?", "Confirme la cotización", JOptionPane.YES_NO_CANCEL_OPTION);
                //Si acepta la cotizacion, entramos al if
                if (msg_Cotizar == 0) {

                    boolean IDexiste = false;//Verificara que el ID de Cliente existe en los registros
                    //Utilizamos la seleccion para verificar segun el tipo de anuncio si existe el ID
                    if (selection == 1) {
                        lista_anuncios.add(mi_Anuncio_Tradicional);//Agregamos el anuncio de tipo Tradicional
                        //Usamos el anuncio para entrar a la funcion que verifica si el ID Existe
                        IDexiste = IDExisteFuncion(lista_clientes, mi_Anuncio_Tradicional.getclienteID());
                        //Repetimos para Anuncio Imagen
                    } else if (selection == 2) {
                        lista_anuncios.add(mi_Anuncio_Imagen);
                        IDexiste = IDExisteFuncion(lista_clientes, mi_Anuncio_Imagen.getclienteID());
                        //Repetimos para Anuncio Frecuente
                    } else if (selection == 3) {
                        lista_anuncios.add(mi_Anuncio_Frecuente);
                        IDexiste = IDExisteFuncion(lista_clientes, mi_Anuncio_Frecuente.getclienteID());
                    }
                    //Si el ID Existe en el registro, entonces solamente grabar en anuncios.dat
                    if (IDexiste) {
                        ActualizarArchivoAnuncios(lista_anuncios, "anuncios.dat");
                        // Si el ID no existe, entonces desplegar la JDialog de Cliente y solicitar que se llene la info
                        // Registramos en ambos cliente.dat (el cliente nuevo)
                        // Y en anuncios.dat
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.\nLlene los datos del cliente y agreguelo al registro.");
                        Clientes.setSize(600, 400);
                        Clientes.setLocationRelativeTo(null);
                        Clientes.setVisible(true);
                        Dialog_ComboBox.setSelectedItem("Agregar");
                        Dialog_ComboBox.setEnabled(false);
                        Dialog_ID.setText(iden_cliente);
                        Dialog_ID.setEnabled(false);
                        Regresar_Boton.setEnabled(false);
                        ActualizarArchivoAnuncios(lista_anuncios, "anuncios.dat");
                    }
                } else if (msg_Cotizar == 1) {
                    //Si niega la cotizacion entonces venta no se registra
                    JOptionPane.showMessageDialog(null, "Venta no registrada.");
                }

            }
            //Limpiamos campos
            titulo_JText.setText(null);
            descripcion_JText.setText(null);
            cliente_JText.setText(null);
            DescuentoFrecuenteTextField.setText(null);
            MilimetrosTextField.setText(null);
            Seccion.setSelectedItem(0);
            Tipo.setSelectedItem(0);
            CheckBox.setSelected(false);
            DDx.setSelectedItem(0);
            MMx.setSelectedItem(0);
            YYYYx.setSelectedItem(0);
        }
    }//GEN-LAST:event_CalcularBotonActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed

        int selection = Tipo.getSelectedIndex();
        if (selection == 0) { //Deshabilitar los campos relacionados a todos los tipos de anuncios

            MilimetrosTextField.setEnabled(false);
            MilimetrosLabel.setEnabled(false);
            DescuentoFrecuenteTextField.setEnabled(false);
            DescuentoFrecuenteLabel.setEnabled(false);
            CheckBox.setEnabled(false);
            CheckBox.setSelected(false);
            MilimetrosTextField.setText(null);
            DescuentoFrecuenteTextField.setText(null);

        } else if (selection == 1) {

            CheckBox.setEnabled(true);  //Si se selecciona Tradicional, habilitar los campos relacionados y deshabilitar los no relacionados
            DescuentoFrecuenteTextField.setEnabled(false);
            DescuentoFrecuenteLabel.setEnabled(false);
            MilimetrosTextField.setEnabled(false);
            MilimetrosLabel.setEnabled(false);
            CalcularBoton.setEnabled(true);
            MilimetrosTextField.setText(null);
            DescuentoFrecuenteTextField.setText(null);

        } else if (selection == 2) {

            MilimetrosTextField.setEnabled(true); //Si se selecciona Con Imagen, habilitar los campos relacionados y deshabilitar los no relacionados
            MilimetrosLabel.setEnabled(true);
            DescuentoFrecuenteTextField.setEnabled(false);
            DescuentoFrecuenteLabel.setEnabled(false);
            CheckBox.setEnabled(false);
            CalcularBoton.setEnabled(true);
            CheckBox.setSelected(false);
            DescuentoFrecuenteTextField.setText(null);

        } else if (selection == 3) {

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
        //Validar los milimetros ingresados

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            MilimetrosTextField.setEditable(false); //No es posible entrar un caracter que no sea numero
            JOptionPane.showMessageDialog(null, "Al escoger la opción Con Imagen, debe insertar la cantidad de milímetros cuadrados de la imagen.\nÉsta debe ser un número positivo.", "Atención", 2);

        } else {
            MilimetrosTextField.setEditable(true);
        }
    }//GEN-LAST:event_MilimetrosTextFieldKeyPressed

    private void DescuentoFrecuenteTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescuentoFrecuenteTextFieldKeyPressed
        //Validar el descuento ingresado

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            DescuentoFrecuenteTextField.setEditable(false); //No es posible entrar un caracter que no sea numero
            JOptionPane.showMessageDialog(null, "Al escoger la opción de Cliente Frecuente, debe insertar el descuento que desea aplicar.\nÉste debe ser un número positivo en el rango [0, 100].\nAsí, al ingresar 5 el descuento será de 5%, y al ingresar 50, será de 50%.\nNote que un descuento de 100% implica que el anuncio tendrá costo 0.", "Atención", 2);

        } else {
            DescuentoFrecuenteTextField.setEditable(true);
        }
    }//GEN-LAST:event_DescuentoFrecuenteTextFieldKeyPressed

    private void Regresar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar_BotonActionPerformed
        Clientes.dispose(); //Cerramos el JDialog
        LimpiarJTextFields(Clientes); //Usamos la función creada para limpiar campos de texto
    }//GEN-LAST:event_Regresar_BotonActionPerformed

    private void titulo_JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo_JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo_JTextActionPerformed

    private void Enviar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviar_BotonActionPerformed

        //Variables inicializadas
        String accion = "";
        String mi_id = "";
        String mi_nombre = "";
        String mi_apellido_1 = "";
        String mi_apellido_2 = "";
        double mi_edad = 0.0; //La rubrica no especifica tipo de variable, se opta por Double

        int selectionCliente = Dialog_ComboBox.getSelectedIndex();

        //Las variables de abajo sirven para validar que el ID ingresado existe 
        //Se utilizara cuando la opcion seleccionada sea modificar al cliente
        String ID_Actualizable = Dialog_ID.getText(); //Obtener string a modificar
        boolean existirAntesActualizar = IDExisteFuncion(lista_clientes, ID_Actualizable);

        //Validar opcion seleccionada   
        if (selectionCliente == 0) { //Debe seleccionar un tipo de anuncio
            JOptionPane.showMessageDialog(null, "Por favor, seleccione el tipo de acción.", "Atención", 2);
        } else if (selectionCliente == 2 && (!existirAntesActualizar)) {

            JOptionPane.showMessageDialog(null, "El ID ingresado no se encuentra en nuestro registro.\n\nSe procederá a cerrar la ventana.", "Atención", 2);
            LimpiarJTextFields(Clientes);
        } else {
            try { //Asignamos a los argumentos los valores de los JTextFields

                accion = Dialog_ComboBox.getSelectedItem().toString();
                mi_id = Dialog_ID.getText();
                mi_nombre = Dialog_Nombre.getText();
                mi_apellido_1 = Dialog_Apellido_1.getText();
                mi_apellido_2 = Dialog_Apellido_2.getText();
                mi_edad = Double.parseDouble(Dialog_Edad.getText());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: Ingrese un valor válido.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: No es posible dividir entre cero. Ingrese un valor válido.");
            }

            //Validar JTextFields
            if (mi_id.isEmpty() || mi_nombre.isEmpty() || mi_apellido_1.isEmpty() || mi_apellido_2.isEmpty()) {
                JOptionPane.showMessageDialog(null, " Porfavor, ingrese valores válidos para todos los campos antes de avanzar.", "Atención", 2);

                //Validar edad
            } else if (mi_edad < 0.0 || mi_edad > 125.0) {
                JOptionPane.showMessageDialog(null, " Porfavor, ingrese valores válidos para edad.", "Atención", 2);

                //Si ninguna validación falla, entonces entre a los cálculos
            } else {
                //Si es seleccion 1 ( agregar cliente ) entre aqui     
                if (selectionCliente == 1) {

                    try {

                        //Se crea el objeto y se llama al constructor sin argumentos
                        Cliente mi_Cliente = new Cliente();
                        mi_Cliente.setiD(mi_id);
                        mi_Cliente.setNombre(mi_nombre);
                        mi_Cliente.setApellido_1(mi_apellido_1);
                        mi_Cliente.setApellido_2(mi_apellido_2);
                        mi_Cliente.setEdad(mi_edad);
                        //Usar funcion de addSinDuplicados para verificar que el cliente por agregar no tiene un ID repetido
                        addSinDuplicados(lista_clientes, mi_Cliente);
                        //Grabar datos de la lista en cliente.dat
                        ActualizarArchivoClientes(lista_clientes, "clientes.dat");
                        //Confirmar adiccion
                        JOptionPane.showMessageDialog(null, "Cliente ID:    " + mi_id + "  ha sido agregado.", "Atención", 2);
                        //Al finalizar. Usamos la función creada para limpiar campos de texto
                        LimpiarJTextFields(Clientes);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Atención", 2);
                    } finally {
                        if (null != oos_clientes) { //Si el file no es nulo
                            try {
                                oos_clientes.close();//Cerramos el file
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                            }
                        }
                    }
                    //Si es seleccion 2 ( modificar cliente ) entre aqui 
                } else if (selectionCliente == 2) {
                    try {
                        //Use la funcion ModificarCliente que recoge toda la data del form y lo aplica al objeto de ambas listas cuyo ID sea el mismo al que se desea modificar
                        ModificarCliente(lista_clientes, lista_anuncios, mi_id, mi_nombre, mi_apellido_1, mi_apellido_2, mi_edad);
                        //Grabar la data en ambos archivos
                        ActualizarArchivoClientes(lista_clientes, "clientes.dat");
                        ActualizarArchivoAnuncios(lista_anuncios, "anuncios.dat");
                        //Confirmar
                        JOptionPane.showMessageDialog(null, "Cliente ID:    " + mi_id + "  ha sido modificado.", "Atención", 2);
                        //Limpiar
                        LimpiarJTextFields(Clientes);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Atención", 2);
                    } finally {
                        if (null != oos_clientes) { //Si el file no es nulo
                            try {
                                oos_clientes.close();//Cerramos el file
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                            }
                        }
                    }
                    //Si es seleccion 3 ( eliminar cliente ) entre aqui 
                } else if (selectionCliente == 3) {
                    try {

                        // Se usa la funcion EliminarCliente que verifica si 1) el cliente existe y 2) Si no tiene asociado ningun anuncio 
                        // Remueve el objeto de la lista de clientes y graba los datos y limpia
                        EliminarCliente(lista_clientes, lista_anuncios, mi_id);
                        ActualizarArchivoClientes(lista_clientes, "clientes.dat");
                        LimpiarJTextFields(Clientes);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Atención", 2);
                    } finally {
                        if (null != oos_clientes) {
                            try {
                                oos_clientes.close();
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                            }
                        }
                    }

                }

            }
        }
        Clientes.dispose(); //Cerramos el JDialog
    }//GEN-LAST:event_Enviar_BotonActionPerformed

    private void Cerrar_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar_tablaActionPerformed

        //El loop de abajo se segura de limpiar la tabla de reportes con nulls para su posterior reutilizacion
        for (int i = 0; i < lista_anuncios.size() + lista_clientes.size() + 1; i++) {
            tabla.setValueAt(null, i, 0);
            tabla.setValueAt(null, i, 1);
            tabla.setValueAt(null, i, 2);
            tabla.setValueAt(null, i, 3);
            tabla.setValueAt(null, i, 4);
            tabla.setValueAt(null, i, 5);
            tabla.setValueAt(null, i, 6);

        }
        LimpiarJTextFields(Display); //Usamos la función creada para limpiar campos de texto
        Display.dispose(); //Cerramos el JDialog
    }//GEN-LAST:event_Cerrar_tablaActionPerformed

    private void Dialog_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dialog_ComboBoxActionPerformed
        int selectionCliente = Dialog_ComboBox.getSelectedIndex();

        if (selectionCliente == 3) {
            //Para eliminar solo ocupamos el ID, es el unico campo que se deja habilitado ademas de los botones
            Dialog_Nombre.setEnabled(false);
            Dialog_Apellido_1.setEnabled(false);
            Dialog_Apellido_2.setEnabled(false);
            Dialog_Edad.setEnabled(false);

            //Se rellenan los campos del JDialog para evitar que los error handlers salten. Los campos son indiferentes dado que se planea eliminar el Id
            Dialog_Nombre.setText(" ");
            Dialog_Apellido_1.setText(" ");
            Dialog_Apellido_2.setText(" ");
            Dialog_Edad.setText("0");

        } else {//Otras selecciones ocupan dichos campos habilitados por ende los hacemos disponibles
            Dialog_Nombre.setEnabled(true);
            Dialog_Apellido_1.setEnabled(true);
            Dialog_Apellido_2.setEnabled(true);
            Dialog_Edad.setEnabled(true);
        }
    }//GEN-LAST:event_Dialog_ComboBoxActionPerformed

    private void Registro_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro_IDActionPerformed
        //Desplegamos el JDialog
        Display.setVisible(true);
        Display.setSize(600, 400);
        Display.setLocationRelativeTo(null);

        //1. Filtro por id cliente
        String ID_Filtro = JOptionPane.showInputDialog("Ingrese el ID que desea filtrar."); //Tomar el ID que se desea filtrar

        if (IDExisteFuncion(lista_clientes, ID_Filtro)) { //Probar su existencia en lista de anuncios e imprimir

            int contador_filas = 0;
            for (int i = 0; i < lista_anuncios.size(); i++) {
                if (ID_Filtro.equals(lista_anuncios.get(i).getclienteID())) {
                    tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getiD(), contador_filas, 0);
                    tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getNombre(), contador_filas, 1);
                    tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getApellido_1(), contador_filas, 2);
                    tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getApellido_2(), contador_filas, 3);
                    tabla.setValueAt(TipoServicio(lista_anuncios.get(i)), contador_filas, 4);
                    tabla.setValueAt(lista_anuncios.get(i).getTitulo(), contador_filas, 5);
                    tabla.setValueAt(CostoIVAFuncion(lista_anuncios.get(i)), contador_filas, 6);

                    contador_filas++;
                } else {
                }
            }
            if (tabla.getValueAt(0, 0) == null) { //Si existe el ID pero no hay anuncio, busque en lista de clientes e imprima unicamente campos relacionados al cliente
                for (int j = 0; j < lista_clientes.size(); j++) {

                    if (ID_Filtro.equals(lista_clientes.get(j).getiD())) {

                        tabla.setValueAt(lista_clientes.get(j).getiD(), contador_filas, 0);
                        tabla.setValueAt(lista_clientes.get(j).getNombre(), contador_filas, 1);
                        tabla.setValueAt(lista_clientes.get(j).getApellido_1(), contador_filas, 2);
                        tabla.setValueAt(lista_clientes.get(j).getApellido_2(), contador_filas, 3);

                        contador_filas++;
                    } else {
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.\nVerifique los datos ingresados.");
        }
    }//GEN-LAST:event_Registro_IDActionPerformed

    private void Registro_TipoServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro_TipoServActionPerformed
        //Desplegamos el JDialog 
        Display.setVisible(true);
        Display.setSize(600, 400);
        Display.setLocationRelativeTo(null);

        //2. Filtro por Tipo de Servicio
        String Tipos[] = {"Tradicional", "Imagen", "Frecuente"}; //opciones para combobox
        JComboBox combo = new JComboBox(Tipos);
        //Tomamos opcion del combobox
        int input_Tipo = JOptionPane.showConfirmDialog(this, combo, "Seleccione el tipo de Anuncio por filtrar", JOptionPane.DEFAULT_OPTION);
        String seleccionado_Tipo = "";
        if (input_Tipo == JOptionPane.OK_OPTION) {
            seleccionado_Tipo = (String) combo.getSelectedItem(); //Guardamos en modo string
        }

        int contador_filas = 0;
        for (int i = 0; i < lista_anuncios.size(); i++) {
            // Comparamos el tipo de servicio de cada elemento de la lista de anuncios con el string del combox 
            // Y solo imprimimos los del mismon tipo al seleccionado por el usuario
            if (seleccionado_Tipo.equals(TipoServicio(lista_anuncios.get(i)))) {
                tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getiD(), contador_filas, 0);
                tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getNombre(), contador_filas, 1);
                tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getApellido_1(), contador_filas, 2);
                tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getApellido_2(), contador_filas, 3);
                tabla.setValueAt(TipoServicio(lista_anuncios.get(i)), contador_filas, 4);
                tabla.setValueAt(lista_anuncios.get(i).getTitulo(), contador_filas, 5);
                tabla.setValueAt(CostoIVAFuncion(lista_anuncios.get(i)), contador_filas, 6);

                contador_filas++;
            }
        }
    }//GEN-LAST:event_Registro_TipoServActionPerformed

    private void Registro_HistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro_HistActionPerformed
        //Desplegamos el JDialog 
        Display.setVisible(true);
        Display.setSize(600, 400);
        Display.setLocationRelativeTo(null);

        //3. Filtro de información histórica
        int contador_filas = 0;
        for (int i = 0; i < lista_anuncios.size(); i++) {
            tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getiD(), contador_filas, 0);
            tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getNombre(), contador_filas, 1);
            tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getApellido_1(), contador_filas, 2);
            tabla.setValueAt(lista_clientes.get(PosicionCliente(lista_clientes, lista_anuncios.get(i).getclienteID())).getApellido_2(), contador_filas, 3);
            tabla.setValueAt(TipoServicio(lista_anuncios.get(i)), contador_filas, 4);
            tabla.setValueAt(lista_anuncios.get(i).getTitulo(), contador_filas, 5);
            tabla.setValueAt(CostoIVAFuncion(lista_anuncios.get(i)), contador_filas, 6);

            contador_filas++;
        }
        //Existe la posibilidad de clientes sin anuncios
        //Los cuales no los capturaria el for loop anterior
        //Se procede a repasar la lista de clientes por cualquier cliente sin anuncios y lo despliega en la tabla debajo de los clientes con anuncio
        for (int j = 0; j < lista_clientes.size(); j++) {

            if (ClienteConVentas(lista_clientes, lista_anuncios, lista_clientes.get(j).getiD())) {
            } else {

                tabla.setValueAt(lista_clientes.get(j).getiD(), contador_filas, 0);
                tabla.setValueAt(lista_clientes.get(j).getNombre(), contador_filas, 1);
                tabla.setValueAt(lista_clientes.get(j).getApellido_1(), contador_filas, 2);
                tabla.setValueAt(lista_clientes.get(j).getApellido_2(), contador_filas, 3);

                contador_filas++;
            }
        }
    }//GEN-LAST:event_Registro_HistActionPerformed

    private void Agregar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_MenuActionPerformed
        //Al seleccionar la opcion de agregar del menu se desplega el JDialog
        Clientes.setVisible(true);
        Clientes.setSize(420, 300);
        Clientes.setLocationRelativeTo(null);
        //Se fija la opcion de agregar y se deshabilita el combobox
        Dialog_ComboBox.setSelectedItem("Agregar");
        Dialog_ComboBox.setEnabled(false);

    }//GEN-LAST:event_Agregar_MenuActionPerformed

    private void Eliminar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_MenuActionPerformed
        //Al seleccionar la opcion de eliminar del menu se desplega el JDialog
        Clientes.setVisible(true);
        Clientes.setSize(600, 400);
        Clientes.setLocationRelativeTo(null);

        //Se fija la opcion de eliminar y se deshabilita el combobox
        Dialog_ComboBox.setSelectedItem("Eliminar");
        Dialog_ComboBox.setEnabled(false);

        //Se deshabilita campos irrelevantes, dado que para eliminar solo ocupamos el ID
        Dialog_Nombre.setEnabled(false);
        Dialog_Apellido_1.setEnabled(false);
        Dialog_Apellido_2.setEnabled(false);
        Dialog_Edad.setEnabled(false);


    }//GEN-LAST:event_Eliminar_MenuActionPerformed

    private void Actualizar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_MenuActionPerformed
        //Al seleccionar la opcion de Actualizar del menu se desplega el JDialog

        Clientes.setVisible(true);
        Clientes.setSize(600, 400);
        Clientes.setLocationRelativeTo(null);

        //Se fija la opcion de Actualizar y se deshabilita el combobox
        Dialog_ComboBox.setSelectedItem("Actualizar");
        Dialog_ComboBox.setEnabled(false);

    }//GEN-LAST:event_Actualizar_MenuActionPerformed

    private void Dialog_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dialog_IDActionPerformed
//Vacio
    }//GEN-LAST:event_Dialog_IDActionPerformed

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

    //Función para redondear los valores de costos, para una visualización más clara
    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    //Función creada para limpiar campos de texto
    public void LimpiarJTextFields(JDialog intFrame) {
        if (intFrame == null) {
            return;
        }
        Container con = intFrame.getContentPane();
        for (Component c : con.getComponents()) {
            if (c instanceof JTextField) {
                JTextField j = (JTextField) c;
                j.setText("");
            }
        }
    }

    //Función creada para verificar el tipo de servicio
    public String TipoServicio(Anuncio x) { //Recibe un anuncio general
        String tipo = "";
        //Verifica que tipo de subclase es el anuncio general
        if (x instanceof AnuncioTradicional) {
            tipo = "Tradicional";
        } else if (x instanceof AnuncioImagen) {
            tipo = "Imagen";
        } else if (x instanceof AnuncioFrecuente) {
            tipo = "Frecuente";
        }
        return tipo;
    }

    //Funcion que abre el archivo de clientes y llena la Lista lista_clientes con los objetos encontrados
    public void leerArchivoClientes() {
        try {
            ios_clientes = new ObjectInputStream(new FileInputStream("clientes.dat"));//Lector usando ObjectInputStream
            Object objeto = null; //Objeto comodin que recorrera el archivo
            while ((objeto = ios_clientes.readObject()) != null) { //Mientras no llegue a End Of file, lea el siguiente objeto
                if (objeto instanceof Cliente) { //Si el objeto es tipo Cliente,entre al if
                    Cliente obj = (Cliente) objeto; //Creamos otro objeto comodin de tipo Cliente donde se guarda el objeto leido
                    addSinDuplicados(lista_clientes, obj); //Grabamos ese objeto en la lista

                }
            }
        } catch (EOFException eof) { //Error handling para cuando no haya nada que leer y se llegue al eof
            JOptionPane.showMessageDialog(null, "Data de \nclientes.dat \nha sido cargada.");
        } catch (Exception e) {//Handler general
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Atención", 2);
        } finally {
            if (null != ios_clientes) { //Si el archivo no es nulo
                try {
                    ios_clientes.close(); //Cierre el archivo
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }
            }
        }
    }

    //Funcion que abre el archivo de anuncios y llena la Lista lista_anuncios con los objetos encontrados
    //Misma estructura de la de clientes.dat
    public void leerArchivoAnuncios() {
        try {
            ios_anuncio = new ObjectInputStream(new FileInputStream("anuncios.dat"));
            Object objeto = null;
            while ((objeto = ios_anuncio.readObject()) != null) {
                if (objeto instanceof Anuncio) {
                    Anuncio obj = (Anuncio) objeto;
                    lista_anuncios.add(obj);
                }
            }
        } catch (EOFException eof) {
            JOptionPane.showMessageDialog(null, "Data de \nanuncios.dat \nha sido cargada.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Atención", 2);
        } finally {
            if (null != ios_clientes) {
                try {
                    ios_clientes.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }
            }
        }
    }

    //Graba la lista en archivo clientes.dat
    public void grabarObjetoCliente(ArrayList lista_objeto) {
        Iterator Iter = lista_objeto.iterator(); //Iterador para el obeto lista de tipo de colecciones
        Cliente x = new Cliente(); //Objeto tipo cliente
        try {
            while (Iter.hasNext()) { //Mientras el iterador tenga un objeto siguiente
                x = (Cliente) Iter.next(); //Salve el objeto Cliente en x
                oos_clientes.writeObject(x); //Escriba x en el archivo
            }
        } catch (Exception ioe) {
        }
    }

    //Graba la lista en archivo anuncios.dat
    //Misma estructura de la de clientes.dat 
    public void grabarObjetoAnuncio(ArrayList lista_objeto) {
        Iterator Iter = lista_objeto.iterator();
        Anuncio x = new Anuncio();
        try {
            while (Iter.hasNext()) {
                x = (Anuncio) Iter.next();
                oos_anuncio.writeObject(x);
            }
        } catch (Exception ioe) {
        }
    }

    //Verifica si la ID del cliente que se desea ingresar está repetida en la lista actual y lo agrega a la lista
    public static void addSinDuplicados(ArrayList<Cliente> lista_c, Cliente anadir) {
        int contador = 0;
        try {
            for (int i = 0; i < lista_c.size(); i++) {
                if (anadir.getiD().equals(lista_c.get(i).getiD())) {
                } else {
                    contador++;
                }
            }

            //Si pasó por todos los objetos de la lista, es decir, si contador suma tantas "pasadas" como elementos en la lista
            //Y no hay ningun objeto cliente con igual ID al que se desea incluir
            //Entonces incluyalo
            //De lo contrario, mande un mensaje que advierta que el ID ya está en algun objeto Cliente de la lista
            if (contador == lista_c.size()) {
                lista_c.add(anadir);
            } else {
                JOptionPane.showMessageDialog(null, "El ID ingresado ya se encuentra en nuestros registros.", "Atención", 2);

            }
        } catch (Exception ioe) {
        }
    }

    //toma la lista de objetos Cliente y graba los datos en el archivo "clientes.dat"
    public void ActualizarArchivoClientes(ArrayList<Cliente> lista_objetos, String archivo) {
        /* Éste comando puede parecer extraño. Pero su fin es borrar todos los datos del archivo, simplemente al abrir y cerrarlo
         * Éste "workaround" permite lidiar con la inclusión por parte del ObjectOutputStream de strings relacionados al nombre del proyecto
         * que ocurren cuando se abre, escribe, cierra y se repite sobre el mismo archivo sin borrar los datos.
         * Éste problema dificultaba la lectura
         */

        try {
            PrintWriter pw = new PrintWriter(archivo);
            pw.close();
        } catch (IOException ex) {
        }
        try {
            oos_clientes = new ObjectOutputStream(new FileOutputStream(archivo, true));//Escritor para el archivo
            grabarObjetoCliente(lista_objetos); //Graba la lista en el archivo con la función explicada arriba
        } catch (EOFException eof) {
            JOptionPane.showMessageDialog(null, "EOF ha sido alcanzado.", "Atención", 2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Atención", 2);
        } finally {
            if (null != oos_clientes) {
                try {
                    oos_clientes.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }
            }
        }
    }

    //toma la lista de objetos Anuncio y graba los datos en el archivo "anuncios.dat"
    //Misma estructura de la de clientes.dat 
    public void ActualizarArchivoAnuncios(ArrayList<Anuncio> lista_objetos, String archivo) {
        try {
            PrintWriter pw = new PrintWriter(archivo);
            pw.close();
        } catch (IOException ex) {
        }
        try {
            oos_anuncio = new ObjectOutputStream(new FileOutputStream(archivo, true));
            grabarObjetoAnuncio(lista_objetos);
        } catch (EOFException eof) {
            JOptionPane.showMessageDialog(null, "EOF ha sido alcanzado.", "Atención", 2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", "Atención", 2);
        } finally {
            if (null != oos_anuncio) {
                try {
                    oos_anuncio.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }
            }
        }
    }

    //Toma la lista de Clientes y verifica si cierto ID que se desea añadir, se encuentra en la lista de Clientes
    public static boolean IDExisteFuncion(ArrayList<Cliente> lista_c, String anadir) {
        boolean dupli = false;
        try {
            for (int i = 0; i < lista_c.size(); i++) {
                if (anadir.equals(lista_c.get(i).getiD())) {
                    dupli = true; //Si el ID ya existe, retorna verdadero
                } else {
                }
            }
        } catch (Exception ioe) {
        }
        return dupli;
    }

    //Toma las listas de Clientes y Anuncios y toma los mismos elementos del contructor de Cliente
    public void ModificarCliente(ArrayList<Cliente> lista_c, ArrayList<Anuncio> lista_a, String iD, String nombre, String apellido_1, String apellido_2, double edad) {

        try {
            for (int i = 0; i < lista_c.size(); i++) { //Pasa primero por la lista de clientes
                if (iD.equals(lista_c.get(i).getiD())) { //Busca un elemento segun su ID
                    //Si lo encuentra sustituye los valores del objeto con una serie de setters
                    lista_c.get(i).setiD(iD);
                    lista_c.get(i).setNombre(nombre);
                    lista_c.get(i).setApellido_1(apellido_1);
                    lista_c.get(i).setApellido_2(apellido_2);
                    lista_c.get(i).setEdad(edad);

                } else {
                }
            }
        } catch (Exception ioe) {
        }
        //repite con anuncio
        try {
            for (int i = 0; i < lista_a.size(); i++) {
                if (iD.equals(lista_a.get(i).getclienteID())) {
                    lista_a.get(i).setclienteID(iD);
                } else {
                }
            }
        } catch (Exception ioe) {
        }
    }

    //Busca eliminar un objeto de la lista cliente sin que esté en la de anuncios
    public void EliminarCliente(ArrayList<Cliente> lista_c, ArrayList<Anuncio> lista_a, String anadir) {
        int posicion = -1; //Valor de la posición default
        boolean dupli_c = false; //Boolean que se torna verdadero si el ID está en la lista cliente
        try {
            for (int i = 0; i < lista_c.size(); i++) { //Recorra lista cliente
                if (anadir.equals(lista_c.get(i).getiD())) { //Si encuentra el ID que se busca en esa lista
                    dupli_c = true; //Pase a true el boolean
                    posicion = i; //Recupere la posicion de la lista donde encontro el objeto
                } else {
                }
            }
        } catch (Exception ioe) {
        }
        //Repetimos para anuncio pero sin posicion, lo único que interesa es asegurarse que no se encuentre en la lista de anuncio
        //O sea, que no tenga ningun anuncio relacionado
        boolean dupli_a = false;
        try {
            for (int i = 0; i < lista_a.size(); i++) { //Recorra
                if (anadir.equals(lista_a.get(i).getclienteID())) { //Si lo encuentra, cambie el booleano a true
                    dupli_a = true;
                } else {
                }
            }
        } catch (Exception ioe) {
        }
        //Si el booleano de la lista de anuncios es true, entonces advierta que no es posible borrarlo
        if (dupli_a) {
            JOptionPane.showMessageDialog(null, "No es posible eliminar el ID ingresado dado que existen ventas relacionadas a dicho identificador.", "Atención", 2);
        }
        //Si encontró el ID en clientes pero NO en anuncios, proceda a eliminar de la lista
        if (dupli_c && !dupli_a) {
            JOptionPane.showMessageDialog(null, "El ID ingresado ha sido eliminado con éxito", "Atención", 2);
            lista_c.remove(posicion);
        }

    }

    //Toma su estructura del EliminarCliente anterior, lo único que hace es verificar si el un ID  tiene una venta relacionada
    public boolean ClienteConVentas(ArrayList<Cliente> lista_c, ArrayList<Anuncio> lista_a, String anadir) {

        boolean dupli_c = false;
        try {
            for (int i = 0; i < lista_c.size(); i++) {
                if (anadir.equals(lista_c.get(i).getiD())) {
                    dupli_c = true;
                } else {
                }
            }
        } catch (Exception ioe) {
        }
        boolean dupli_a = false;
        try {
            for (int i = 0; i < lista_a.size(); i++) {
                if (anadir.equals(lista_a.get(i).getclienteID())) {
                    dupli_a = true;
                } else {
                }
            }
        } catch (Exception ioe) {
        }
        //Si ambos son true, es decir, el ID existe en lista de cliente y el Id tiene un anuncio relacionado
        // Entonces el AND devuelve TRUE. Es la única combinacion que devuelve TRUE.
        return dupli_a && dupli_c;
    }

    ////Toma su estructura del EliminarCliente anterior, busca la posición de un cliente en la lista y devuelve ese entero
    public int PosicionCliente(ArrayList<Cliente> lista_c, String anadir) {
        int posicion = -1;
        boolean dupli_c = false;
        try {
            for (int i = 0; i < lista_c.size(); i++) {
                if (anadir.equals(lista_c.get(i).getiD())) {
                    dupli_c = true;
                    posicion = i;
                } else {
                }
            }
        } catch (Exception ioe) {
        }
        return posicion;
    }

    public double CostoIVAFuncion(Anuncio x) {

        //Verifica que tipo de subclase es el anuncio general y llama al calculo del costo con IVA depeniendo del costo
        //Retorna el costo con IVA redondeado a dos decimles
        int selection = 0;
        if (x instanceof AnuncioTradicional) {
            return round(CostoIVATradicional((AnuncioTradicional)x),2);
        } else if (x instanceof AnuncioImagen) {
            return round(CostoIVAImagen((AnuncioImagen)x),2);
        } else if (x instanceof AnuncioFrecuente) {
            return round(CostoIVAFrecuentes((AnuncioFrecuente)x),2);
        }
        return 0.0;
    }
//Costo IVA solo para Tradicionales

    public double CostoIVATradicional(AnuncioTradicional x) {
        //Inicializa las variables de costos

        String titulo = "";
        String descripcion = "";
        String seccion = "";
        double costoSinIVA = 0;
        double costoIVA = 0;
        double IVA = 0;
        boolean descuento = false;

        //Para anuncio tradicional, creamos un objeto para los cálculos
        descuento = x.getDescuento();
        titulo = x.getTitulo();
        descripcion = x.getDescripcion();
        seccion = x.getSeccion();

        int num_Titulo = titulo.length();
        int num_Descripcion = descripcion.length();
        int numero_Letras = num_Titulo + num_Descripcion;

        //Utiliza los métodos de calculo definidos para la subclase AnuncioTradicional para obtener el costo con/sin IVA del Anuncio, incluimos el booleano descuento
        costoSinIVA = x.calculoAnuncio(numero_Letras, seccion, descuento);
        costoIVA = x.calculoAnuncioIVA(numero_Letras, seccion, descuento);
        IVA = costoIVA - costoSinIVA;
        return costoIVA;
    }

    //Costo IVA solo para Imagen
    public double CostoIVAImagen(AnuncioImagen x) {
        //Inicializa las variables de costos

        String titulo = "";
        String descripcion = "";
        String seccion = "";

        double costoSinIVA = 0;
        double costoIVA = 0;
        double IVA = 0;
        double milimetros = 0.0;

        //Para anuncio tradicional, creamos un objeto para los cálculos
        milimetros = x.getMilimetros();
        titulo = x.getTitulo();
        descripcion = x.getDescripcion();
        seccion = x.getSeccion();

        int num_Titulo = titulo.length();
        int num_Descripcion = descripcion.length();
        int numero_Letras = num_Titulo + num_Descripcion;

        //Utiliza los métodos de calculo definidos para la subclase AnuncioImagen para obtener el costo con/sin IVA del Anuncio, incluimos el double milimetros
        costoSinIVA = x.calculoAnuncio(numero_Letras, seccion, milimetros);
        costoIVA = x.calculoAnuncioIVA(numero_Letras, seccion, milimetros);
        IVA = costoIVA - costoSinIVA;
        return costoIVA;
    }

    //Costo IVA solo para Frecuentes
    public double CostoIVAFrecuentes(AnuncioFrecuente x) {
        //Inicializa las variables de costos

        String titulo = "";
        String descripcion = "";
        String seccion = "";

        double costoSinIVA = 0;
        double costoIVA = 0;
        double IVA = 0;
        double descuentoFrecuente = 0.0;

        //Para anuncio tradicional, creamos un objeto para los cálculos
        descuentoFrecuente = x.getDescuentoFrecuente();
        titulo = x.getTitulo();
        descripcion = x.getDescripcion();
        seccion = x.getSeccion();

        int num_Titulo = titulo.length();
        int num_Descripcion = descripcion.length();
        int numero_Letras = num_Titulo + num_Descripcion;

        //Utiliza los métodos de calculo definidos para la subclase AnuncioFrecuente para obtener el costo con/sin IVA del Anuncio, incluimos el double descuentoFrecuente
        costoSinIVA = x.calculoAnuncio(numero_Letras, seccion, descuentoFrecuente);
        costoIVA = x.calculoAnuncioIVA(numero_Letras, seccion, descuentoFrecuente);
        IVA = costoIVA - costoSinIVA;
        return costoIVA;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Actualizar_Menu;
    private javax.swing.JMenuItem Agregar_Menu;
    private javax.swing.JButton CalcularBoton;
    private javax.swing.JButton Cerrar_tabla;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JDialog Clientes;
    private javax.swing.JComboBox<String> DDx;
    private javax.swing.JLabel Desc_Label;
    private javax.swing.JLabel DescuentoFrecuenteLabel;
    private javax.swing.JTextField DescuentoFrecuenteTextField;
    private javax.swing.JTextField Dialog_Apellido_1;
    private javax.swing.JTextField Dialog_Apellido_2;
    private javax.swing.JComboBox<String> Dialog_ComboBox;
    private javax.swing.JTextField Dialog_Edad;
    private javax.swing.JTextField Dialog_ID;
    private javax.swing.JTextField Dialog_Nombre;
    private javax.swing.JDialog Display;
    private javax.swing.JMenuItem Eliminar_Menu;
    private javax.swing.JButton Enviar_Boton;
    private javax.swing.JComboBox<String> MMx;
    private javax.swing.JLabel MilimetrosLabel;
    private javax.swing.JTextField MilimetrosTextField;
    private javax.swing.JMenuItem Registro_Hist;
    private javax.swing.JMenuItem Registro_ID;
    private javax.swing.JMenuItem Registro_TipoServ;
    private javax.swing.JButton Regresar_Boton;
    private javax.swing.JComboBox<String> Seccion;
    private javax.swing.JButton TerminarBoton;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JLabel Titulo_Label;
    private javax.swing.JComboBox<String> YYYYx;
    private javax.swing.JTextField cliente_JText;
    private javax.swing.JTextField descripcion_JText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField titulo_JText;
    // End of variables declaration//GEN-END:variables
}
