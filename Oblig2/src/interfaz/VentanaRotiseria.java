// Santiago Chemello (251469)

package interfaz;

import dominio.*;
import java.util.Collections;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

public class VentanaRotiseria extends javax.swing.JFrame {

    DefaultListModel listModel = new DefaultListModel();
    int precioTotal = 0;
    Cliente clienteElegido;

    public VentanaRotiseria(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        this.setTitle("ROTISERIA");
        inicializarComboCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnElegirCliente = new javax.swing.JButton();
        etqClienteElegido = new javax.swing.JLabel();
        etqObservacionesPedido = new javax.swing.JLabel();
        textObservacionesPedido = new javax.swing.JTextField();
        radioBtnCategoriasOrdenAlfabetico = new javax.swing.JRadioButton();
        radioBtnCategoriasOrdenPrioridad = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnVerPedidos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        comboCategoriasDisponibles = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btnReiniciarPedido = new javax.swing.JButton();
        etqTotalPedidoActual = new javax.swing.JLabel();
        panelProducto = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductosPedidoActual = new javax.swing.JList();
        btnEliminarItem = new javax.swing.JButton();
        btnGrabarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(3, 0));

        btnElegirCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnElegirCliente.setText("Elegir Cliente");
        btnElegirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnElegirCliente);

        etqClienteElegido.setBackground(new java.awt.Color(204, 255, 204));
        etqClienteElegido.setOpaque(true);
        jPanel1.add(etqClienteElegido);

        etqObservacionesPedido.setBackground(new java.awt.Color(204, 255, 204));
        etqObservacionesPedido.setOpaque(true);
        etqObservacionesPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqObservacionesPedido.setText("Observaciones:");
        jPanel1.add(etqObservacionesPedido);
        jPanel1.add(textObservacionesPedido);

        group.add(radioBtnCategoriasOrdenAlfabetico);
        radioBtnCategoriasOrdenAlfabetico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioBtnCategoriasOrdenAlfabetico.setText("Categorias por orden Alfabetico");
        radioBtnCategoriasOrdenAlfabetico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radioBtnCategoriasOrdenAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnCategoriasOrdenAlfabeticoActionPerformed(evt);
            }
        });
        jPanel1.add(radioBtnCategoriasOrdenAlfabetico);

        group.add(radioBtnCategoriasOrdenPrioridad);
        radioBtnCategoriasOrdenPrioridad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioBtnCategoriasOrdenPrioridad.setText("Categorias por orden Prioridad");
        radioBtnCategoriasOrdenPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnCategoriasOrdenPrioridadActionPerformed(evt);
            }
        });
        jPanel1.add(radioBtnCategoriasOrdenPrioridad);

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCliente.setText("Clientes");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnCliente);

        btnCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategoria.setText("Categorias");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCategoria);

        btnProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProducto.setText("Productos");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btnProducto);

        btnVerPedidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerPedidos);

        getContentPane().add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        comboCategoriasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriasDisponiblesActionPerformed(evt);
            }
        });
        jPanel3.add(comboCategoriasDisponibles);

        getContentPane().add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        btnReiniciarPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReiniciarPedido.setText("Reiniciar Pedido");
        btnReiniciarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarPedidoActionPerformed(evt);
            }
        });
        jPanel4.add(btnReiniciarPedido);

        etqTotalPedidoActual.setBackground(new java.awt.Color(204, 255, 204));
        etqTotalPedidoActual.setOpaque(true);
        etqTotalPedidoActual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqTotalPedidoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(etqTotalPedidoActual);

        getContentPane().add(jPanel4);

        panelProducto.setBackground(new java.awt.Color(204, 255, 204));
        panelProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProducto.setLayout(new java.awt.GridLayout(3, 0));
        getContentPane().add(panelProducto);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setViewportView(listaProductosPedidoActual);

        jPanel6.add(jScrollPane1);

        btnEliminarItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarItem.setText("Eliminar Item");
        btnEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItemActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminarItem);

        btnGrabarPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGrabarPedido.setText("Grabar Pedido");
        btnGrabarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarPedidoActionPerformed(evt);
            }
        });
        jPanel6.add(btnGrabarPedido);

        getContentPane().add(jPanel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElegirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirClienteActionPerformed
        VentanaElegirCliente vent = new VentanaElegirCliente(sistema, this);
        vent.setResizable(false);
        vent.setVisible(true);
    }//GEN-LAST:event_btnElegirClienteActionPerformed

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        VentanaVerPedidos vent = new VentanaVerPedidos(sistema);
        vent.setResizable(false);
        vent.setVisible(true);
    }//GEN-LAST:event_btnVerPedidosActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        VentanaRegistroProducto vent = new VentanaRegistroProducto(sistema, this);
        vent.setResizable(false);
        vent.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        VentanaRegistroCategoria vent = new VentanaRegistroCategoria(sistema, this);
        vent.setResizable(false);
        vent.setVisible(true);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        VentanaRegistroCliente vent = new VentanaRegistroCliente(sistema);
        vent.setResizable(false);
        vent.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void comboCategoriasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriasDisponiblesActionPerformed
        Categoria cat = (Categoria) comboCategoriasDisponibles.getSelectedItem();

        categoriaSeleccionada = cat;
        refreshBotones();

    }//GEN-LAST:event_comboCategoriasDisponiblesActionPerformed

    private void radioBtnCategoriasOrdenAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnCategoriasOrdenAlfabeticoActionPerformed
        if (radioBtnCategoriasOrdenAlfabetico.isSelected()) {
            Collections.sort(sistema.listaCategorias, (a, b) -> a.getDescripcion().toUpperCase().compareTo(b.getDescripcion().toUpperCase()));
        }
        
        inicializarComboCategorias();
    }//GEN-LAST:event_radioBtnCategoriasOrdenAlfabeticoActionPerformed

    private void radioBtnCategoriasOrdenPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnCategoriasOrdenPrioridadActionPerformed
        if (radioBtnCategoriasOrdenPrioridad.isSelected()) {
            Collections.sort(sistema.listaCategorias, (a, b) -> {
                return (a.getPrioridad() - b.getPrioridad());
            });

        }
        inicializarComboCategorias();
    }//GEN-LAST:event_radioBtnCategoriasOrdenPrioridadActionPerformed

    private void inicializarComboCategorias() {
        comboCategoriasDisponibles.removeAllItems();
        for (int i = 0; i < sistema.listaCategorias.size(); i++) {
            comboCategoriasDisponibles.addItem(sistema.listaCategorias.get(i));
        }
    }
    
    private void btnEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItemActionPerformed

        try {
            int[] listaProductosSeleccionadosAEliminar = listaProductosPedidoActual.getSelectedIndices();

            // convierte el array en un set para chequear que el producto que se va a eliminar usando contains.
            Set<Integer> setProductosSeleccionadosAEliminar = new HashSet<Integer>();
            for (Integer i : listaProductosSeleccionadosAEliminar) {
                setProductosSeleccionadosAEliminar.add(i);
            }

            DefaultListModel<Producto> listModelProductoFinal = new DefaultListModel();

            int i = 0;
            while (i < listModel.size()) {
                if (!setProductosSeleccionadosAEliminar.contains(i)) {
                    listModelProductoFinal.addElement((Producto) listModel.getElementAt(i));
                }
                i++;
            }

            listModel = listModelProductoFinal;
            listaProductosPedidoActual.setModel(listModel);
            actualizarPrecio();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No selecciono ningun producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarItemActionPerformed

    private void btnReiniciarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarPedidoActionPerformed
        reiniciarPedido();
        JOptionPane.showMessageDialog(this, "Pedido Reiniciado con exito.");
    }//GEN-LAST:event_btnReiniciarPedidoActionPerformed

    private void btnGrabarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarPedidoActionPerformed
        String observacion = textObservacionesPedido.getText();
        ArrayList<Producto> listaProductos = new ArrayList<>();

        if (listModel.size() == 0) {
            JOptionPane.showMessageDialog(null, "El pedido debe tener productos para ser grabado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (clienteElegido == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente para crear el pedido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (int i = 0; i < listModel.size(); i++) {
            listaProductos.add((Producto) listModel.get(i));
        }

        Pedido pedido = new Pedido(clienteElegido, listaProductos, precioTotal, observacion, numeroActualPedido());
        sistema.agregarPedido(pedido);

        reiniciarPedido();
        jPanel4.revalidate();
        JOptionPane.showMessageDialog(this, "Pedido Grabado con exito.");
    }//GEN-LAST:event_btnGrabarPedidoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try
        {   
            FileOutputStream file = new FileOutputStream("archivo");
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            out.writeObject(sistema);
              
            out.close();
            file.close();
              
        }
          
        catch(IOException ex)
        {
            
        }
    }//GEN-LAST:event_formWindowClosing

    public void llenarComboCategoria() {
        for (int i = 0; i < sistema.listaCategorias.size(); i++) {
            comboCategoriasDisponibles.addItem(sistema.listaCategorias.get(i));
        }
    }

    private class ProductoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton botonProducto = ((JButton) e.getSource());
            // código a completar según el botón presionado

            String nombreProducto = botonProducto.getName();
            for (int i = 0; i < sistema.listaProductos.size(); i++) {
                if (nombreProducto.equals(sistema.listaProductos.get(i).getNombre())) {
                    Producto producto = sistema.listaProductos.get(i);
                    listModel.addElement(producto);
                }
            }
            actualizarPrecio();

            listaProductosPedidoActual.setModel(listModel);
        }
    }

    public void actualizarPrecio() {
        precioTotal = 0;
        for (int i = 0; i < listModel.size(); i++) {
            Producto producto = (Producto) listModel.get(i);
            precioTotal += producto.getPrecio();
        }
        actualizarNumeroPedido();
    }

    public void refreshBotones() {
        panelProducto.removeAll();

        for (int i = 0; i < sistema.listaProductos.size(); i++) {
            Producto producto = sistema.listaProductos.get(i);
            ArrayList<Categoria> categorias = producto.getListaCategoriasDeProducto();
            for (int j = 0; j < categorias.size(); j++) {
                if (producto.getListaCategoriasDeProducto().get(j) == this.categoriaSeleccionada) {
                    JButton nuevo = new JButton(" ");
                    nuevo.setName(producto.getNombre());
                    nuevo.setMargin(new Insets(-5, -5, -5, -5));
                    nuevo.setBackground(Color.BLACK);
                    nuevo.setForeground(Color.WHITE);
                    nuevo.setText(sistema.listaProductos.get(i).getNombre() + " $" + sistema.listaProductos.get(i).getPrecio());
                    nuevo.addActionListener(new ProductoListener());
                    panelProducto.add(nuevo);
                }
            }
        }

        panelProducto.revalidate();
    }

    public void reiniciarPedido() {
        clienteElegido = null;

        DefaultListModel model = (DefaultListModel) listaProductosPedidoActual.getModel();
        model.clear();
        listaProductosPedidoActual.setModel(model);
        listModel = new DefaultListModel();

        etqClienteElegido.setText("");
        textObservacionesPedido.setText("");
        actualizarPrecio();
        etqTotalPedidoActual.setText("");
    }

    private void actualizarNumeroPedido() {
        etqTotalPedidoActual.setText("Pedido " + numeroActualPedido() + " $" + precioTotal);
    }

    private int numeroActualPedido() {
        return sistema.listaPedidos.size() + 1;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnElegirCliente;
    private javax.swing.JButton btnEliminarItem;
    private javax.swing.JButton btnGrabarPedido;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnReiniciarPedido;
    private javax.swing.JButton btnVerPedidos;
    public javax.swing.JComboBox comboCategoriasDisponibles;
    public static javax.swing.JLabel etqClienteElegido;
    private javax.swing.JLabel etqObservacionesPedido;
    private javax.swing.JLabel etqTotalPedidoActual;
    private javax.swing.ButtonGroup group;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaProductosPedidoActual;
    private javax.swing.JPanel panelProducto;
    private static javax.swing.JRadioButton radioBtnCategoriasOrdenAlfabetico;
    private static javax.swing.JRadioButton radioBtnCategoriasOrdenPrioridad;
    private javax.swing.JTextField textObservacionesPedido;
    // End of variables declaration//GEN-END:variables
    private Sistema sistema;
    private Categoria categoriaSeleccionada;
}
