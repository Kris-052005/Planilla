package datos;

import java.util.ArrayList;
import logica.Puestos;

/**
 *
 * @author krist
 */
public class AlmacenamientoPuestos {

    private ArrayList<Puestos> listaPuestos;

    public AlmacenamientoPuestos() {
        this.listaPuestos = new ArrayList();
    }

    public ArrayList<Puestos> getListaPuestos() {
        return listaPuestos;
    }

    public void setListaPuestos(ArrayList<Puestos> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }

    // metodos del crud
    public void insertarPuesto(Puestos puesto) {
        if (this.listaPuestos != null) {
            this.listaPuestos.add(puesto);

        }
    }

    public void editarPuesto(int index, Puestos newPuesto) {
        if (index >= 0 && newPuesto != null && listaPuestos.isEmpty()) {
            this.listaPuestos.set(index, newPuesto);
        }
    }

    public boolean eliminarPuesto(Puestos puesto) {
        if (this.listaPuestos.contains(puesto)) {
            this.listaPuestos.remove(puesto);
            return true;
        }
        return false;
    }

}
