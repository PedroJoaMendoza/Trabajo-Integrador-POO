package models;

import interfaces.Dao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateo Santarsiero
 */
public class ReservationDao implements Dao<Reservation> {

    private final List<Reservation> reservations = new ArrayList<>();

    @Override
    public Reservation Get(long id) {
        for (Reservation r : reservations) {
            if (r.getID() == id) {
                return r;
            }
        }
        System.out.println("No se encontro una reserva"); // <-- En la ventana de busqueda, debe mostrarse el error
        return null;
    }

    @Override
    public List<Reservation> GetAll() {
        return reservations;
    }

    @Override
    public void save(Reservation r) {
        reservations.add(r);
    }

    @Override
    public boolean update(Reservation oldOne, Reservation newOne) {
        int index = reservations.indexOf(oldOne);
        if (index != -1) {
            reservations.set(index, newOne);
            return true;
        }
        return false;
    }

    @Override
    public void delete(Reservation r) {
        reservations.remove(r);
    }

}
