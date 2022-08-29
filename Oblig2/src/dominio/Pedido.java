// Santiago Chemello (251469) 
package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido implements Serializable {

    private Cliente cliente;
    private ArrayList<Producto> listaProductosPedidos;
    private int totalPrecio;
    private String observacion;
    private int numeroPedido;

    public Pedido(Cliente unCliente, ArrayList<Producto> unaListaProductos, int unTotalPrecio, String unaObservacion, int unNumeroPedido) {
        this.setCliente(unCliente);
        this.listaProductosPedidos = unaListaProductos;
        this.setTotalPrecio(unTotalPrecio);
        this.setObservacion(unaObservacion);
        this.setNumeroPedido(unNumeroPedido);
    }

    public void setCliente(Cliente unCliente) {
        cliente = unCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductosPedidos;
    }

    public void setTotalPrecio(int unTotalPrecio) {
        totalPrecio = unTotalPrecio;
    }

    public int getTotalPrecio() {
        return totalPrecio;
    }

    public void setObservacion(String unaObservacion) {
        observacion = unaObservacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setNumeroPedido(int unNumeroPedido) {
        numeroPedido = unNumeroPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    @Override
    public String toString() {
        return "Pedido " + this.getNumeroPedido() + " - " + "Cliente: " + this.getCliente().getNombre();
    }
}
