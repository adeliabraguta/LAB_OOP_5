package People;

public class Restaurant {
    private final String name;
    private double rating;
    private double budget;

    public Restaurant(String name, double rating, double budget) {
        this.name = name;
        this.rating = rating;
        this.budget = budget;
    }

    public void setRating(double rating) {
        if (rating >= 5) {
            this.rating = 5;
        } else if (rating <= 0 ) {
            this.rating = rating;
            fail();
        } else {
            this.rating = rating;
        }
    }

    public void setBudget(double budget) {
        if (budget <=0) {
            this.budget = budget;
            fail();
        } else {
            this.budget = budget;
        }
    }

    public double getBudget() {
        return budget;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    private void fail() {
        if (getRating() <= 0) {
            System.out.println("People.Restaurant's rating went below 0, so no one visited it anymore");
            System.exit(0);
        }
        if(getBudget() <=0) {
            System.out.println("No money left to run the restaurant");
            System.exit(0);
        }
    }

    public double bills(double workingHours) {  
        return workingHours * 4.5;
    }

}
