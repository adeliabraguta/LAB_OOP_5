package Pizza;

public class Capricioasa extends MeatPizza {

    private int gramsOfMushrooms;
    private int gramsOfEggplants;
    private int gramsOfSheepCheese;
    private int gramsOfMozzarella;

    public Capricioasa() {
        super("thick", 35, 50, 100, false);
        this.gramsOfMushrooms = 60;
        this.gramsOfEggplants = 30;
        this.gramsOfSheepCheese = 30;
        this.gramsOfMozzarella = 100;
    }

//    @Override
//    public void makePizza() {
//        super.makePizza();
//        System.out.println("In the end the cook added " + gramsOfMushrooms + " grams of mushrooms, "
//                + gramsOfEggplants + " grams of eggplants, " + gramsOfSheepCheese
//                + " gramsOfSheepCheese and on top, " + gramsOfMozzarella + " grams of Mozzarella cheese");
//    }

    @Override
    public double getPrice() {
        return super.getPrice() + (gramsOfEggplants * 0.2 + gramsOfMozzarella * 0.5 + gramsOfMushrooms * 0.3 + gramsOfSheepCheese * 0.4);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}