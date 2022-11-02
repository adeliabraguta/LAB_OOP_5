import People.Cook;
import People.Customer;
import People.Restaurant;
import People.Waiter;
import Pizza.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Runea", 3, 10_000); //Change the rating to alter the simulation

        System.out.println(restaurant.getName() + " restaurant's initial rating and budget: " + restaurant.getRating()
                + ", " + restaurant.getBudget());

        Customer customer = new Customer();
        BBQ bbq = new BBQ();
        Capricioasa capricioasa = new Capricioasa();
        Pepperoni pepperoni = new Pepperoni();
        Diablo diablo = new Diablo();
        Margherita margherita = new Margherita();
        Neapolitana neapolitana = new Neapolitana();
        QuattroFormaggi quattroFormaggi = new QuattroFormaggi();
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        double profitDay = 0;
//        double totalProfit = 0;

        int nextDay = 1;
        int day=1;
        int badReview = 0;
        int goodReview = 0;

        int workHours = 480;
        int hour = 0;

        Waiter waiter = new Waiter();
        Cook cook = new Cook();

        while (nextDay == 1) {

            int newCustomers = customer.timeBetweenCustomers(restaurant.getRating());
            System.out.println("Next customer came in " + newCustomers + " minutes");
            hour += newCustomers;

            int randomPizza = rand.nextInt(7) + 1;
            int randomIsWithSomeone = rand.nextInt(2)+1;
            int pizzas = 1;
            if (randomIsWithSomeone == 2) {
                pizzas = customer.pizzaOrdered(restaurant.getRating());
            }
            int randomTimeTakeWaiter = rand.nextInt(20) + 1;
            hour += randomTimeTakeWaiter;
            if (randomTimeTakeWaiter > 15) {
                System.out.println("Waiter took too long so the customers left");
                restaurant.setRating((restaurant.getRating() - 0.1));
                badReview++;

                System.out.println(randomTimeTakeWaiter + " minutes waisted");
            } else {
                if(randomTimeTakeWaiter <= 5) {
                    System.out.println("Waiter came really quickly and customers were pleasantly surprised");
                    restaurant.setRating(restaurant.getRating() + 0.1);
                    goodReview++;
                }
                hour += randomTimeTakeWaiter;
                System.out.println("Waiter came in " + randomTimeTakeWaiter + " minutes");
                switch (randomPizza) {
                    case 1:
                        System.out.println("The customer ordered " + pizzas + " BBQ pizza");
//                        bbq.makePizza();
                        System.out.println("The check price was: " + bbq.getPrice() * pizzas);
                        profitDay += bbq.getPrice() * pizzas;
                        break;
                    case 2:
                        System.out.println("The customer ordered " + pizzas + " Capricioasa pizza");
//                        capricioasa.makePizza();
                        System.out.println("The check price was: " + capricioasa.getPrice() * pizzas);
                        profitDay += capricioasa.getPrice() * pizzas;
                        break;
                    case 3:
                        System.out.println("The customer ordered " + pizzas + " Diablo pizza");
//                        diablo.makePizza();
                        System.out.println("The check price was: " + diablo.getPrice() * pizzas);
                        profitDay += diablo.getPrice() * pizzas;
                        break;
                    case 4:
                        System.out.println("The customer ordered " + pizzas + " Margherita pizza");
//                        margherita.makePizza();
                        System.out.println("The check price was: " + margherita.getPrice() * pizzas);
                        profitDay += margherita.getPrice() * pizzas;
                        break;
                    case 5:
                        System.out.println("The customer ordered " + pizzas + " Neapolitana pizza");
//                        neapolitana.makePizza();
                        System.out.println("The check price was: " + neapolitana.getPrice() * pizzas);
                        profitDay += neapolitana.getPrice() * pizzas;
                        break;
                    case 6:
                        System.out.println("The customer ordered " + pizzas + " Pepperoni pizza");
//                        pepperoni.makePizza();
                        System.out.println("The check price was: " + pepperoni.getPrice() * pizzas);
                        profitDay += pepperoni.getPrice() * pizzas;
                        break;
                    case 7:
                        System.out.println("The customer ordered " + pizzas + " Quattro Formaggi pizza");
//                        quattroFormaggi.makePizza();
                        System.out.println("The check price was: " + quattroFormaggi.getPrice() * pizzas);
                        profitDay += quattroFormaggi.getPrice() * pizzas;
                        break;
                }
                hour += 15 * (pizzas / 2) + (pizzas % 2);
                int randomReview = rand.nextInt(3) + 1;
                switch (randomReview){
                    case 1:
                        System.out.println("The customer disliked the service and left a bad review");
                        restaurant.setRating((restaurant.getRating() - 0.2));
                        badReview++;
                        break;
                    case 2:
                        System.out.println("The customer left no reviews");
                        break;
                    case 3:
                        System.out.println("The customer was pleased with the service and left a good review");
                        restaurant.setRating((restaurant.getRating() + 0.2));
                        goodReview++;
                        break;
                }
            }
            System.out.println("**********************************++*********************************************");
            if(hour > 480) {

                System.out.println("Work day ended");
                System.out.println("The waiter was payed " + waiter.getSalary(workHours) + " and the cook " + cook.getSalary(workHours));
                System.out.println("Bill price for this day: " + restaurant.bills(workHours));
                profitDay -= waiter.getSalary(workHours) + cook.getSalary(workHours) + restaurant.bills(workHours);
//                totalProfit += profitDay;

                System.out.println("Profit for day " + day++ + ": " + profitDay);
//                System.out.println("Total profit so far: " + totalProfit);
                restaurant.setBudget(restaurant.getBudget() + profitDay);
                System.out.println("Today were left " + goodReview + " good reviews and " + badReview + " bad reviews");
                System.out.println(restaurant.getName() + " restaurant rating: " + restaurant.getRating());
                System.out.println(restaurant.getName() + " restaurant budget: " + restaurant.getBudget() );

                profitDay = 0;
                hour = 0;
                goodReview = 0;
                badReview = 0;

                System.out.println("*******************************************************************************");
                System.out.println("Type 0 to end the simulation or 1 to continue to the next day");
                nextDay = scanner.nextInt();
            }
        }

    }
}