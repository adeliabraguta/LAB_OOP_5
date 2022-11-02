package Pizza;

public class BBQ extends MeatPizza {

    private int gramsOfBacon;
    private int gramsOfBbqSouse;

    public BBQ() {
        super("thick", 50, 70, 160, true);
        this.gramsOfBacon = 80;
        this.gramsOfBbqSouse = 30;
    }

//    @Override
//    public void makePizza() {
//        super.makePizza();
//        System.out.println("In the end the cook added " + gramsOfBacon + " grams of bacon and " + gramsOfBbqSouse + " grams of bbq souse");
//    }

    @Override
    public double getPrice() {
        return super.getPrice() + (gramsOfBacon * 0.9 + gramsOfBbqSouse * 0.5);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}