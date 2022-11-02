package Pizza;

public class QuattroFormaggi extends VegetarianPizza {

    private int gramsOfBrieCheese;
    private int gramsOParmesanCheese;
    private int gramsOfMozzarellaCheese;
    private int gramsOfDorbluCheese;

    public QuattroFormaggi() {
        super("thin", 30, 50, 0, true);
        this.gramsOfBrieCheese = 75;
        this.gramsOParmesanCheese = 80;
        this.gramsOfMozzarellaCheese = 100;
        this.gramsOfDorbluCheese = 55;
    }

//    @Override
//    public void makePizza() {
//        super.makePizza();
//        System.out.println("In the end the cook added " + gramsOfBrieCheese + " grams of brie cheese, "
//                + gramsOParmesanCheese + " grams of parmesan cheese, " + gramsOfMozzarellaCheese
//                + " of mozzarella cheese and in last but not the lease " +  gramsOfDorbluCheese + " grams of dorblue cheese");
//    }

    @Override
    public double getPrice() {
        return super.getPrice() + gramsOfBrieCheese * 0.6 + gramsOfDorbluCheese + 0.8 + gramsOParmesanCheese * 0.9 + gramsOfMozzarellaCheese * 0.5;
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}