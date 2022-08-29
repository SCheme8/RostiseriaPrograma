// Santiago Chemello (251469)

package dominio;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String nombre;
    private String direccion;
    private long telefono;

    public Cliente(String unNombre, String unaDireccion, int unTelefono) {
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setTelefono(unTelefono);
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String unaDireccion) {
        direccion = unaDireccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long unTelefono) {
        telefono = unTelefono;
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getDireccion() + " - " + this.getTelefono() + ")";
    }
}
