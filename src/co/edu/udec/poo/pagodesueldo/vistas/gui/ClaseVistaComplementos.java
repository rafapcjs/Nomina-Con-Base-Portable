/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udec.poo.pagodesueldo.vistas.gui;

import co.edu.udec.poo.pagodesueldo.modelo.crud.ClaseComplementosCRUD;
import co.edu.udec.poo.pagodesueldo.poo.modelo.entidades.ClaseComplementos;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author JARK
 */
public class ClaseVistaComplementos extends javax.swing.JFrame {

     DefaultTableModel modelcomplemento;



    /**
     * Creates new form ClaseVistaComplementos
     */
    public ClaseVistaComplementos() {
        initComponents();
        String[] titulos = {"IdComplementos",  " Fecha", "ValorComplemento"," Cantidad ", "  Cedula",};

        modelcomplemento = new DefaultTableModel(null, titulos);
        tablacomplemento.setModel(modelcomplemento);
        
        mostrardatos();
    }
    
    
    public void clening() {
        complemento.setText("");
        cantidad.setText("");
        valor.setText("");
        fecha.setText("");
        cedula.setText("");

    }
    
       public int variableSeleccion(){
        int variable = tablacomplemento.getSelectedRow();
        
        
        return variable;
    }
    
    public ClaseComplementos recuperardatos() {
        ClaseComplementos complementos = new ClaseComplementos();
        int id = complemento.getText().isEmpty() ? 0 : Integer.parseInt(complemento.getText());

        complementos.setIdComplementos(id);

        complementos.setFecha(fecha.getText());

        complementos.setCedula(valor.getText());

        complementos.setCantidad(Integer.parseInt(cantidad.getText()));

        complementos.setValorComplemento(Integer.parseInt(cedula.getText()));

        return complementos;

    }

    
        public void mostrardatos() {
        while (modelcomplemento.getRowCount() > 0) {
            modelcomplemento.removeRow(0);
        }

        ClaseComplementosCRUD conexión = new ClaseComplementosCRUD();
        try {
            ResultSet resultado = conexión.consultardato("SELECT*FROM COMPLEMENTOS");
            while (resultado.next()) {
                System.out.println(resultado.getString("ID"));
                System.out.println(resultado.getString("FECHA"));
                System.out.println(resultado.getString("CEDULA"));
                System.out.println(resultado.getString("CANTIDAD"));
                System.out.println(resultado.getString("VALOR"));
                /////////////////////////////////////////////////
                Object[] oUsuario = {resultado.getString("ID"), resultado.getString("FECHA"),
                   resultado.getString("CEDULA"), resultado.getString("CANTIDAD"),
                   resultado.getString("VALOR")};
                modelcomplemento.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }
    


    

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablacomplemento = new javax.swing.JTable();
        complemento = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        Buscar1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Modificar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        jMenu1.setText("Menu");

        jMenuItem1.setText("Deducciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Transacciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Complementos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Categorías");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("R Nomina");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Empleados");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Calcular sueldo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Home");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Complementos");
        setSize(new java.awt.Dimension(950, 580));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Cedula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Valor del complemento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Id complementos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1320, 0));

        tablacomplemento.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tablacomplemento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Descripcion", "Fecha ", "Cantidad", "Cedula", "Complemento"
            }
        ));
        tablacomplemento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacomplementoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablacomplemento);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 770, 110));

        complemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                complementoKeyTyped(evt);
            }
        });
        jPanel1.add(complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 120, -1));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 160, -1));

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 120, -1));

        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorKeyTyped(evt);
            }
        });
        jPanel1.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 130, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Cantidad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        eliminar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/ELIMINARPE.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/ELIMINARPE.png"))); // NOI18N
        eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/ELIMINARBIG.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 70, 60));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Fecha ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaKeyTyped(evt);
            }
        });
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 150, -1));

        Buscar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/pequebuscar.png"))); // NOI18N
        Buscar1.setText(" ");
        Buscar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/pequebuscar.png"))); // NOI18N
        Buscar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/grandebuscar.png"))); // NOI18N
        Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 70, 50));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 140, 30));

        Crear.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/CREARSMALL.png"))); // NOI18N
        Crear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/CREARSMALL.png"))); // NOI18N
        Crear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/Diseño sin título.png"))); // NOI18N
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 100, 60));

        Modificar1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Modificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/MODIFICARPEQUE.png"))); // NOI18N
        Modificar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/MODIFICARPEQUE.png"))); // NOI18N
        Modificar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/MODIFICARGRANDE.png"))); // NOI18N
        Modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 100, 60));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel4.setText("COMPLEMENTOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Crear");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 90, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Eliminar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 90, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Modificar");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 90, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/NÓMINA JARK (1).png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1060, 590));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Crear");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 90, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("Eliminar");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/poo/pagodesueldo/vistas/iconos/NÓMINA JARK (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1060, 550));

        jMenu3.setText("Menu");

        jMenuItem9.setText("Deducciones");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem11.setText("Contratos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Categorías");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("R Nomina");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Empleados");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuItem16.setText("Home");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Procesos");

        jMenuItem17.setText("C. Sueldo");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Transacciones");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        ClaseVistaDeducciones visDedu = new ClaseVistaDeducciones();
        visDedu.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        ClaseVistaContratos visContra = new ClaseVistaContratos();
        visContra.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        ClaseVistaCategoria visCate = new ClaseVistaCategoria();
        visCate.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        ClaseVistaRegistroNomina visNomina = new ClaseVistaRegistroNomina();
        visNomina.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        ClaseVistaEmpleado visEmpleado = new ClaseVistaEmpleado();
        visEmpleado.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        ClaseVistaHome home = new ClaseVistaHome();
        home.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

int k = JOptionPane.showConfirmDialog(null, "desea eliminar  ");
        if (k==0) {                  JOptionPane.showMessageDialog(null, " se elimino correctamente");        ClaseComplementosCRUD conexión = new ClaseComplementosCRUD();
        ClaseComplementos claseComplementos = recuperardatos();
        String strSentenciaInsert = String.format("DELETE FROM  COMPLEMENTOS WHERE ID =%d", claseComplementos.getIdComplementos());
        conexión.ejecuarsentencia(strSentenciaInsert);

        this.mostrardatos();}
        else   {
            JOptionPane.showMessageDialog(null, " No elimino correctamente");
        } 
        
    }//GEN-LAST:event_eliminarActionPerformed
    
    
    
    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        ClaseVistaCalculoSueldo visCalcu = new ClaseVistaCalculoSueldo();
        visCalcu.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        ClaseVistaTransacciones visTransa = new ClaseVistaTransacciones();
        visTransa.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyTyped


       // TODO add your handling code here:
    }//GEN-LAST:event_fechaKeyTyped

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped







char Name=evt.getKeyChar();
        if (Name<'0'||Name>'9')evt.consume(); {
       

   
}















        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaKeyTyped

    private void valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyTyped
char Name=evt.getKeyChar();
        if (Name<'0'||Name>'9')evt.consume(); {
       

   
}        // TODO add your handling code here:
    }//GEN-LAST:event_valorKeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
char Name=evt.getKeyChar();
        if (Name<'0'||Name>'9')evt.consume(); {
       

   
}        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadKeyTyped

    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar1ActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar1ActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed

        int k = JOptionPane.showConfirmDialog(null, "dese  crear");
        if (k==0) { JOptionPane.showMessageDialog(null, "se agrego correctamente");

        
        ClaseComplementosCRUD conexión = new ClaseComplementosCRUD();
        ClaseComplementos comple = recuperardatos();
        String strSentenciaInsert = String.format("INSERT INTO COMPLEMENTOS( FECHA, CEDULA, CANTIDAD,VALOR)"
                + "VALUES('%s','%s','%s','%s')", comple.getFecha(), comple.getCedula(), comple.getCantidad(), comple.getValorComplemento());

        conexión.ejecuarsentencia(strSentenciaInsert);
        this.mostrardatos();
        this.clening();
    } 
        else{
                              JOptionPane.showMessageDialog(null, "No se agrego correctamente");

        }
    }//GEN-LAST:event_CrearActionPerformed

    private void Modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar1ActionPerformed
int k = JOptionPane.showConfirmDialog(null, "desea modificar  ");
        if (k==0) {                  JOptionPane.showMessageDialog(null, " se modficar correctamente"); 

        ClaseComplementosCRUD conexión = new ClaseComplementosCRUD();
        ClaseComplementos comple = recuperardatos();

        String strSentenciaInsert = String.format("UPDATE COMPLEMENTOS SET FECHA='%s',CEDULA='%s',CANTIDAD='%s',VALOR='%s' WHERE ID='%d'", comple.getFecha(), comple.getCedula(), comple.getCantidad(), comple.getValorComplemento(), comple.getIdComplementos());

        conexión.ejecuarsentencia(strSentenciaInsert);

        this.mostrardatos();
this.clening();
}else  JOptionPane.showMessageDialog(null, "  No se modficar correctamente");
            
    
        {
    }
        
        
    }//GEN-LAST:event_Modificar1ActionPerformed


    private void tablacomplementoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacomplementoMouseClicked
        // TODO add your handling code here:
        
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            complemento.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());

            fecha.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            cedula.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());

            cantidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());

            valor.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
        }

        Crear.setEnabled(true);
        eliminar.setEnabled(true);
        Modificar1.setEnabled(true);
        
        
    }//GEN-LAST:event_tablacomplementoMouseClicked

    private void complementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_complementoKeyTyped
        char Name=evt.getKeyChar();
        if (Name<'0'||Name>'9')evt.consume(); {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoKeyTyped

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

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
            java.util.logging.Logger.getLogger(ClaseVistaComplementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaseVistaComplementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaseVistaComplementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaseVistaComplementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaseVistaComplementos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar1;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Modificar1;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField complemento;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablacomplemento;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
