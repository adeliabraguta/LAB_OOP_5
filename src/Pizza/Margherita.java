package Pizza;

public class Margherita extends VegetarianPizza {
    private int gramsOfTomatoSouse;
    private int gramsOfMozzarella;

    public Margherita() {
        super("thin", 25, 75, 50, false);
        this.gramsOfTomatoSouse = 100;
        this.gramsOfMozzarella = 125;
    }

//    @Override
//    public void makePizza() {
//        super.makePizza();
//        System.out.println("In the end the cook added " + gramsOfTomatoSouse + " grams of tomato souse and "
//                + gramsOfMozzarella + " grams of mozzarella");
//    }

    @Override
    public double getPrice() {
        return super.getPrice() + gramsOfTomatoSouse * 0.3 + gramsOfMozzarella * 0.5;
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}