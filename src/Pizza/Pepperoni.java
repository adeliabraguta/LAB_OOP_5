package Pizza;

public class Pepperoni extends MeatPizza {

    private int gramsOfMozzarella;
    private int paprikaAndChilly;

    public Pepperoni() {
        super("thin", 30, 50, 100, true);
        this.gramsOfMozzarella = 100;
        this.paprikaAndChilly = 15;
    }

//    @Override
//    public void makePizza() {
//        super.makePizza();
//        System.out.println("In the end the cook added " + paprikaAndChilly + " grams of paprika and chilly to make it spicy and "
//                + gramsOfMozzarella + " grams of mozzarella");
//    }

    @Override
    public double getPrice() {
        return super.getPrice() + paprikaAndChilly * 0.15 + gramsOfMozzarella * 0.5;
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}