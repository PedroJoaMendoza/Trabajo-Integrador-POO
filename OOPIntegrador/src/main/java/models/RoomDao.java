package models;

import interfaces.Dao;
import java.util.ArrayList;
import java.util.List;

public class RoomDao implements Dao<Room> {

    private final List<Room> rooms = new ArrayList<>();

    @Override
    public Room Get(long id) {
        return rooms.stream()
                .filter(r -> r.getID() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Room> GetAll() {
        return new ArrayList<>(rooms);
    }

    @Override
    public void save(Room room) {
        rooms.add(room);
    }

    @Override
    public void update(Room oldOne, Room newOne) {
        int index = rooms.indexOf(oldOne);
        if (index != -1) {
            rooms.set(index, newOne);
        }
    }

    @Override
    public void delete(Room room) {
        rooms.remove(room);
    }
}
