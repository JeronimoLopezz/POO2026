package producto;
public class product {

    private String name;
    private double price;
    private int stock;

    public product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean setName(String newName) {

        if (!newName.isEmpty()) {
            name = newName;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPrice(double newPrice) {

        if (newPrice > 0) {
            price = newPrice;
            return true;
        } else {
            return false;
        }
    }

    public boolean setStock(int newStock) {

        if (newStock >= 0) {
            stock = newStock;
            return true;
        } else {
            return false;
        }
    }
}