// Santiago Chemello (251469) 

package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {

    private String nombre;
    private int precio;
    private ArrayList<Categoria> listaCat;

    public Producto(String unNombreP, int unPrecio, ArrayList<Categoria> unaListaCat) {
        this.setNombre(unNombreP);
        this.setPrecio(unPrecio);
        this.listaCat = unaListaCat;
    }

    public void setNombre(String unNombreP) {
        nombre = unNombreP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(int unPrecio) {
        precio = unPrecio;
    }

    public int getPrecio() {
        return precio;
    }

    public ArrayList<Categoria> getListaCategoriasDeProducto() {
        return listaCat;
    }

    @Override
    public String toString() {
        return this.getNombre() + " $" + this.getPrecio();
    }
}
