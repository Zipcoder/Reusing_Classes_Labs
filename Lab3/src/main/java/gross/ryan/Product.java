package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class Product {
    private double price;
    private int id;
    private int qoh;




    public Product(double aPrice, int anID, int aQOH) {
        this.price = aPrice;
        this.id = anID;
        this.qoh = aQOH;
    }

    public double getPrice() {
        return price;
    }

    public int getQOH() {
        return qoh;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public void setQOH(int qoh) {
        this.qoh = qoh;
    }

    public double totalValue() {
        return this.getPrice() * this.getQOH();
    }

}
