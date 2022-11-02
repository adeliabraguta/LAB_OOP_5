package Pizza;

public class Dough {

    private String thickness;
    private int size;
    private int amountOfSouse;

    private double price;

    public Dough(String thickness, int size, int amountOfSouse) {
        this.thickness = thickness;
        this.size = size;
        this.amountOfSouse = amountOfSouse;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setAmountOfSouse(int amountOfSouse) {
        this.amountOfSouse = amountOfSouse;
    }

//    public void makePizza(){
//        System.out.println("First, the cook makes a " + thickness + " pizza dough that is " + size
//                + " cm wide, and then he spreads " + amountOfSouse + " grams of souse on top of that.");
//    }

    public double getPrice() {
        price = 0;
        if (thickness == "thin") {
            price += 10;
        } else if (thickness == "thick") {
            price += 20;
        }
        price += size * 1.5;
        price += amountOfSouse * 0.5;
        return price;
    }

    public double costToMake() {
        return getPrice()/2;
    }
}