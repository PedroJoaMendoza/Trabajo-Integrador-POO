package models;

import interfaces.Dao;
import java.util.ArrayList;
import java.util.List;

public class RoomDao implements Dao<Room> {

    private final List<Room> rooms = new ArrayList<>();

    @Override
    public Room Get(long id) {
        for(Room r : rooms){
            if (r.getID() == id) {
                return r;
            }
        }
        System.out.println("No se encontro una habitacion"); // <-- En la ventana de busqueda, debe mostrarse el error
        return null;
    }

    @Override
    public List<Room> GetAll() {
        return rooms;
    }

    @Override
    public void save(Room room) {
        rooms.add(room);
    }

    @Override
    public boolean update(Room oldOne, Room newOne) {
        int index = rooms.indexOf(oldOne);
        if (index != -1) {
            rooms.set(index, newOne);
            return true;
        }
        return false;
    }

    @Override
    public void delete(Room room) {
        rooms.remove(room);
    }
}
