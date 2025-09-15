package models;

/**
 *
 * @author Mateo Santarsiero <MateoSantar>
 */
public class Room {
    private int ID;
    private String category;
    private double price;

    public Room(int ID, String category, double price) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
