package Pizza;

public class VegetarianPizza extends Dough {

    private int tomatoes;
    private boolean broccoli;

    public VegetarianPizza(String thickness, int size, int amountOfSouse, int tomatoes, boolean broccoli) {
        super(thickness, size, amountOfSouse);
        this.tomatoes = tomatoes;
        this.broccoli = broccoli;
    }


//    @Override
//    public void makePizza() {
//        super.makePizza();
//        if (broccoli) {
//            System.out.println("After, the cook added " + tomatoes + " grams of tomatoes and broccoli on pizza");
//        } else {
//            System.out.println("After, the cook added " + tomatoes + " grams of tomatoes on pizza");
//        }
//    }

    @Override
    public double getPrice() {
        return super.getPrice() + (tomatoes * 0.3);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}