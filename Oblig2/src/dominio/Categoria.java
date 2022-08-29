// Santiago Chemello (251469)

package dominio;

import java.io.Serializable;

public class Categoria implements Serializable {

    private String descripcion;
    private int prioridad;
    private String detalle;

    public Categoria(String unaDescripcion, int unaPrioridad, String unDetalle) {
        this.setDescripcion(unaDescripcion);
        this.setPrioridad(unaPrioridad);
        this.setDetalle(unDetalle);
    }

    public void setDescripcion(String unaDescripcion) {
        descripcion = unaDescripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrioridad(int unaPrioridad) {
        prioridad = unaPrioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setDetalle(String unDetalle) {
        detalle = unDetalle;
    }

    public String getDetalle() {
        return detalle;
    }

    @Override
    public String toString() {
        return this.getDescripcion();
    }
}
