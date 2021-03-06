/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pere
 */
public class UtilidadesAula extends javax.swing.JDialog {

    Aula aula = new Aula();

    /**
     * Creates new form UtilidadesAula
     */
    public UtilidadesAula(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonBuscarModificacion.setEnabled(true);
        botonOKModificacion.setEnabled(false);
        botonLimpiarModificacion.setEnabled(false);

        jFTFIdentificacionModificacionBuscar.setText("");
        jFTFIdentificacionModificacion.setText("");
        jFTFCapacidadModificacion.setText("");
        jCBTipoClaseModificacion.setSelectedIndex(0);
        jFTFIdentificacionModificacionBuscar.setEnabled(true);
        jFTFIdentificacionModificacion.setEnabled(false);
        jFTFCapacidadModificacion.setEnabled(false);
        jCBTipoClaseModificacion.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFTFIdentificacionAlta = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBTipoAlta = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jFTFCapacidadAlta = new javax.swing.JFormattedTextField();
        botonOKAlta = new javax.swing.JButton();
        botonLimpiarAlta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAConsulta = new javax.swing.JTextArea();
        jTFIdentificadorConsulta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        botonBuscarConsulta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonBuscarModificacion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jFTFCapacidadModificacion = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCBTipoClaseModificacion = new javax.swing.JComboBox();
        botonOKModificacion = new javax.swing.JButton();
        botonLimpiarModificacion = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jFTFIdentificacionModificacionBuscar = new javax.swing.JTextField();
        jFTFIdentificacionModificacion = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        botonLimpiarBaja = new javax.swing.JButton();
        botonEliminarBaja = new javax.swing.JButton();
        jFTFIdentificadorBaja = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Identificacion:");

        jFTFIdentificacionAlta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel2.setText("Tipo:");

        jCBTipoAlta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "A", "B", "C", "D", "E" }));

        jLabel3.setText("Capacidad:");

        jFTFCapacidadAlta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        botonOKAlta.setText("OK");
        botonOKAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKAltaActionPerformed(evt);
            }
        });

        botonLimpiarAlta.setText("Limpiar");
        botonLimpiarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFTFIdentificacionAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jCBTipoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCapacidadAlta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(botonLimpiarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonOKAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFTFIdentificacionAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBTipoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFTFCapacidadAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOKAlta)
                    .addComponent(botonLimpiarAlta))
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("Alta", jPanel1);

        jTAConsulta.setColumns(20);
        jTAConsulta.setRows(5);
        jScrollPane1.setViewportView(jTAConsulta);

        jLabel9.setText("Identificador:");

        botonBuscarConsulta.setText("Buscar");
        botonBuscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTFIdentificadorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarConsulta)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFIdentificadorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarConsulta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel4);

        botonBuscarModificacion.setText("Buscar");
        botonBuscarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarModificacionActionPerformed(evt);
            }
        });

        jLabel4.setText("Identificador:");

        jFTFCapacidadModificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel5.setText("Capacidad:");

        jLabel6.setText("Tipo:");

        jCBTipoClaseModificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "A", "B", "C", "D", "E" }));

        botonOKModificacion.setText("OK");
        botonOKModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKModificacionActionPerformed(evt);
            }
        });

        botonLimpiarModificacion.setText("Limpiar");
        botonLimpiarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarModificacionActionPerformed(evt);
            }
        });

        jLabel8.setText("Identificador:");

        jFTFIdentificacionModificacionBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFIdentificacionModificacionBuscarActionPerformed(evt);
            }
        });

        jFTFIdentificacionModificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonLimpiarModificacion)
                        .addGap(18, 18, 18)
                        .addComponent(botonOKModificacion)))
                .addGap(98, 98, 98))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBTipoClaseModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTFCapacidadModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonBuscarModificacion)
                                    .addComponent(jFTFIdentificacionModificacion)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel8)
                        .addGap(38, 38, 38)
                        .addComponent(jFTFIdentificacionModificacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFTFIdentificacionModificacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(botonBuscarModificacion)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFTFIdentificacionModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBTipoClaseModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFTFCapacidadModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOKModificacion)
                    .addComponent(botonLimpiarModificacion))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Modificacion", jPanel2);

        jLabel7.setText("Identificador:");

        botonLimpiarBaja.setText("Limpiar");

        botonEliminarBaja.setText("Eliminar");
        botonEliminarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botonLimpiarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFTFIdentificadorBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFTFIdentificadorBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiarBaja)
                    .addComponent(botonEliminarBaja))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baja", jPanel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Visualización", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKAltaActionPerformed
        boolean existeix = false;
        Iterator itArrayAula = inici.ArrayLAula.iterator();

        try {

            if ("".equals(jFTFCapacidadAlta.getText()) || "".equals(jFTFIdentificacionAlta.getText()) || jCBTipoAlta.getSelectedItem() == "-") {

                JOptionPane.showMessageDialog(null,
                        "Hay campos vacios",
                        "Aletra",
                        JOptionPane.WARNING_MESSAGE);
            } else {

                String CapacidadString = jFTFCapacidadAlta.getText();
                int Capacidad = Integer.parseInt(CapacidadString);
                String identificadorString = jFTFIdentificacionAlta.getText();
                int identificador = Integer.parseInt(identificadorString);
                String Tipo = (String) jCBTipoAlta.getSelectedItem();

                if (!inici.ArrayLAula.isEmpty()) {

                    

                    while (itArrayAula.hasNext()) {
                        aula = (Aula) itArrayAula.next();
                        if (aula.getIdentificacion() == Integer.parseInt(jFTFIdentificacionAlta.getText()) ) {
                            existeix = true;
                            JOptionPane.showMessageDialog(null,
                                    "Ya existe la aula",
                                    "Aletra",
                                    JOptionPane.WARNING_MESSAGE);
                        } else {
                            System.out.println(aula.toString());
                            
                        }
                    }
                }
                if (!existeix) {

                    aula = new Aula(identificador, Tipo, Capacidad);
                    inici.ArrayLAula.add(aula);
                }
                System.out.println("hola");
            }
        } catch (Exception ex) {
            Logger.getLogger(UtilidadesAula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonOKAltaActionPerformed

    private void botonLimpiarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarAltaActionPerformed

        jFTFIdentificacionAlta.setText(null);
        jFTFCapacidadAlta.setText(null);
        jCBTipoAlta.setSelectedIndex(0);
    }//GEN-LAST:event_botonLimpiarAltaActionPerformed

    private void botonBuscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarConsultaActionPerformed

        Iterator itArrayAula = inici.ArrayLAula.iterator();

        if ("".equals(jTFIdentificadorConsulta.getText())) {

            JOptionPane.showMessageDialog(null,
                    "No has escrito ningun identificador",
                    "Aletra",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            if (!inici.ArrayLAula.isEmpty()) {
                aula = (Aula) itArrayAula.next();
                System.out.println(" no esta buit");

                for (int x = 0; x < inici.ArrayLAula.size(); x++) {

                    if (aula.getIdentificacion() == Integer.parseInt(jTFIdentificadorConsulta.getText())) {
                        jTAConsulta.setText(aula.toString());
                        System.out.println("trobat");
                    } else {
                        aula = (Aula) itArrayAula.next();
                    }

                }
                System.out.println("fora bucle");
            } else {
                jTAConsulta.setText("No hiha cap aula donada d'alta");

            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarConsultaActionPerformed

    private void botonBuscarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarModificacionActionPerformed
        Iterator itArrayAula = inici.ArrayLAula.iterator();

        if ("".equals(jFTFIdentificacionModificacionBuscar.getText())) {

            JOptionPane.showMessageDialog(null,
                    "No has escrito ningun identificador",
                    "Aletra",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            if (!inici.ArrayLAula.isEmpty()) {
                System.out.println(" no esta buit");

                for (int x = 0; x < inici.ArrayLAula.size(); x++) {

                    if (aula.getIdentificacion() == Integer.parseInt(jFTFIdentificacionModificacionBuscar.getText())) {

                        botonBuscarModificacion.setEnabled(false);

                        jFTFIdentificacionModificacionBuscar.setEnabled(false);
                        jFTFCapacidadModificacion.setText(String.valueOf(aula.getCapacidad()));
                        jFTFIdentificacionModificacion.setText(String.valueOf(aula.getIdentificacion()));
                        switch (aula.getTipo()) {
                            case "A":
                                jCBTipoClaseModificacion.setSelectedIndex(1);
                                break;
                            case "B":
                                jCBTipoClaseModificacion.setSelectedIndex(2);
                                break;
                            case "C":
                                jCBTipoClaseModificacion.setSelectedIndex(3);
                                break;
                            case "D":
                                jCBTipoClaseModificacion.setSelectedIndex(4);
                                break;
                            case "E":
                                jCBTipoClaseModificacion.setSelectedIndex(5);
                                break;
                            default:
                                jCBTipoClaseModificacion.setSelectedIndex(0);
                                break;

                        }
                        System.out.println("trobat");
                    } else {
                        aula = (Aula) itArrayAula.next();
                    }

                }
                System.out.println("fora bucle");
            } else {
                jTAConsulta.setText("No hiha cap aula donada d'alta");

            }
        }
        botonBuscarModificacion.setEnabled(false);
        botonOKModificacion.setEnabled(true);
        botonLimpiarModificacion.setEnabled(true);

        jFTFIdentificacionModificacionBuscar.setEnabled(false);
        jFTFIdentificacionModificacion.setEnabled(true);
        jFTFCapacidadModificacion.setEnabled(true);
        jCBTipoClaseModificacion.setEnabled(true);
    }//GEN-LAST:event_botonBuscarModificacionActionPerformed

    private void jFTFIdentificacionModificacionBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFIdentificacionModificacionBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFIdentificacionModificacionBuscarActionPerformed

    private void botonOKModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKModificacionActionPerformed

        if ("".equals(jFTFIdentificacionModificacionBuscar.getText()) && "".equals(jFTFIdentificacionModificacion.getText()) && "".equals(jFTFCapacidadModificacion.getText())) {

            JOptionPane.showMessageDialog(null,
                    "Los campos no pueden estar vacios",
                    "Aletra",
                    JOptionPane.WARNING_MESSAGE);
        }
        for (int x = 0; x < inici.ArrayLAula.size(); x++) {
            if (aula.getIdentificacion() == Integer.parseInt(jFTFIdentificacionModificacionBuscar.getText())) {
                aula.setCapacidad(Integer.parseInt(jFTFCapacidadModificacion.getText()));
                aula.setIdentificacion(Integer.parseInt(jFTFIdentificacionModificacion.getText()));
                aula.setTipo((String) jCBTipoClaseModificacion.getSelectedItem());
            }
        }
        botonBuscarModificacion.setEnabled(true);
        botonOKModificacion.setEnabled(false);
        botonLimpiarModificacion.setEnabled(false);

        jFTFIdentificacionModificacionBuscar.setText("");
        jFTFIdentificacionModificacion.setText("");
        jFTFCapacidadModificacion.setText("");
        jCBTipoClaseModificacion.setSelectedIndex(0);
        jFTFIdentificacionModificacionBuscar.setEnabled(true);
        jFTFIdentificacionModificacion.setEnabled(false);
        jFTFCapacidadModificacion.setEnabled(false);
        jCBTipoClaseModificacion.setEnabled(false);
    }//GEN-LAST:event_botonOKModificacionActionPerformed

    private void botonEliminarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarBajaActionPerformed
        Iterator itArrayAula = inici.ArrayLAula.iterator();
        boolean trobat=false;
        if ("".equals(jFTFIdentificadorBaja.getText())) {
            
            JOptionPane.showMessageDialog(null,
                    "No has posat cap element a borrar",
                    "Informacion",
                    JOptionPane.WARNING_MESSAGE);
          
        }else{
            if (!inici.ArrayLAula.isEmpty()) {
                aula = (Aula) itArrayAula.next();

                for (int x = 0; x < inici.ArrayLAula.size(); x++) {

                    if (aula.getIdentificacion() == Integer.parseInt(jFTFIdentificadorBaja.getText())) {
                        itArrayAula.remove();
                        JOptionPane.showMessageDialog(null,
                                "Se ha eliminado correctamente",
                                "Informacion",
                                JOptionPane.INFORMATION_MESSAGE);
                        jFTFIdentificadorBaja.setText("");
                        trobat=true;

                    } else {
                        aula = (Aula) itArrayAula.next();
                    }
                }
                if(!trobat){
                    JOptionPane.showMessageDialog(null,
                    "No s'ha trobat l'element a borrar",
                    "Informacion",
                    JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_botonEliminarBajaActionPerformed

    private void botonLimpiarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarModificacionActionPerformed
        jFTFIdentificacionModificacionBuscar.setText("");
        jFTFIdentificacionModificacion.setText("");
        jFTFCapacidadModificacion.setText("");
        jCBTipoClaseModificacion.setSelectedIndex(0);
    }//GEN-LAST:event_botonLimpiarModificacionActionPerformed

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
            java.util.logging.Logger.getLogger(UtilidadesAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UtilidadesAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UtilidadesAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UtilidadesAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UtilidadesAula dialog = new UtilidadesAula(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarConsulta;
    private javax.swing.JButton botonBuscarModificacion;
    private javax.swing.JButton botonEliminarBaja;
    private javax.swing.JButton botonLimpiarAlta;
    private javax.swing.JButton botonLimpiarBaja;
    private javax.swing.JButton botonLimpiarModificacion;
    private javax.swing.JButton botonOKAlta;
    private javax.swing.JButton botonOKModificacion;
    private javax.swing.JComboBox jCBTipoAlta;
    private javax.swing.JComboBox jCBTipoClaseModificacion;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFormattedTextField jFTFCapacidadAlta;
    private javax.swing.JFormattedTextField jFTFCapacidadModificacion;
    private javax.swing.JFormattedTextField jFTFIdentificacionAlta;
    private javax.swing.JFormattedTextField jFTFIdentificacionModificacion;
    private javax.swing.JTextField jFTFIdentificacionModificacionBuscar;
    private javax.swing.JFormattedTextField jFTFIdentificadorBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTAConsulta;
    private javax.swing.JTextField jTFIdentificadorConsulta;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
