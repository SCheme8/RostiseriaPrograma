// Santiago Chemello (251469)

package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Sistema implements Serializable {

    public ArrayList<Cliente> listaClientes = new ArrayList<>();
    public ArrayList<Producto> listaProductos = new ArrayList<>();
    public ArrayList<Categoria> listaCategorias = new ArrayList<>();
    public ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public void agregarCliente(Cliente unCliente) {
        listaClientes.add(unCliente);
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void agregarProducto(Producto unProducto) {
        listaProductos.add(unProducto);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarCategoria(Categoria unaCategoria) {
        listaCategorias.add(unaCategoria);
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void agregarPedido(Pedido unPedido) {
        listaPedidos.add(unPedido);
    }

    public boolean existeNombre(String nombre) {
        boolean ok = false;
        Iterator<Cliente> it = this.getListaClientes().iterator();
        while (it.hasNext()) {
            Cliente Unc = it.next();
            if (Unc.getNombre().equalsIgnoreCase(nombre)) {
                ok = true;
            }
        }
        return ok;
    }

    public boolean existeDescripcion(String descripcion) {
        boolean ok = false;
        Iterator<Categoria> it = this.getListaCategorias().iterator();
        while (it.hasNext()) {
            Categoria UnaC = it.next();
            if (UnaC.getDescripcion().equalsIgnoreCase(descripcion)) {
                ok = true;
            }
        }
        return ok;
    }

    public boolean existeNombreProducto(String nombreProducto) {
        boolean ok = false;
        Iterator<Producto> it = this.getListaProductos().iterator();
        while (it.hasNext()) {
            Producto Unp = it.next();
            if (Unp.getNombre().equalsIgnoreCase(nombreProducto)) {
                ok = true;
            }
        }
        return ok;
    }

    public void busquedaCliente(String texto, ArrayList<Cliente> listaFiltro) {
        listaFiltro.clear();
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getNombre().toLowerCase().contains(texto)) {
                listaFiltro.add(listaClientes.get(i));
            }
        }
    }

    public void leerArchivo(String unNombre) {
        try {
            ArchivoLectura arch = new ArchivoLectura(unNombre);
            int i = 0;

            // leer clientes
            int cantidadClientes = leerCantidadObjectos(arch);
            for (i = 0; i < cantidadClientes; i++) {
                arch.hayMasLineas();
                String linea = arch.linea();
                String[] partes = linea.split(";");
                String nombre = partes[0];
                String direccion = partes[1];
                int numero = Integer.parseInt(partes[2]);
                Cliente cliente = new Cliente(nombre, direccion, numero);
                agregarCliente(cliente);
            }

            // leer categorias
            int cantidadCategorias = leerCantidadObjectos(arch);
            for (i = 0; i < cantidadCategorias; i++) {
                arch.hayMasLineas();
                String linea = arch.linea();
                String[] partes = linea.split(";");
                String descripcion = partes[0];
                String detalles = partes[1];
                int prioridad = Integer.parseInt(partes[2]);
                Categoria categoria = new Categoria(descripcion, prioridad, detalles);
                agregarCategoria(categoria);
            }

            // leer productos
            int cantidadProductos = leerCantidadObjectos(arch);
            for (i = 0; i < cantidadProductos; i++) {
                if (arch.hayMasLineas()) {
                    String linea = arch.linea();

                    String[] partes = linea.split(";");
                    String nombre = partes[0];
                    int precio = Integer.parseInt(partes[1]);
                    ArrayList<Categoria> categorias = new ArrayList<>();
                    // agrego categorias
                    for (int j = 2; j < partes.length; j++) {
                        String categoriaDescripcion = partes[j];
                        for (int k = 0; k < getListaCategorias().size(); k++) {
                            Categoria categoria = getListaCategorias().get(k);
                            if (categoria.getDescripcion().equals(categoriaDescripcion)) {
                                categorias.add(categoria);
                            }
                        }
                    }

                    Producto producto = new Producto(nombre, precio, categorias);
                    agregarProducto(producto);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Archivo leido correctamente");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo invalido, se iniciara el sistema vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int leerCantidadObjectos(ArchivoLectura arch) {
        arch.hayMasLineas();
        String linea = arch.linea();
        String[] partes = linea.split(";");
        return Integer.parseInt(partes[0]);
    }
}
