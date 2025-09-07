package models;

/**
 *
 * @author Mateo Santarsiero <MateoSantar>
 */
public class Room {
    private int ID;
    private RoomCategory category;
    private double price;

    public Room(int ID, RoomCategory category, double price) {
        this.ID = ID;
        this.category = category;
        this.price = price;
    }

    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public RoomCategory getCategory() {
        return category;
    }

    public void setCategory(RoomCategory category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
