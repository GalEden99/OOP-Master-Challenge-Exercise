public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Regular", true);
        hamburger.addition1("Lettuce", 3);
        hamburger.addition2("Tomato", 2);
        hamburger.addition3("carrot", 1);
        hamburger.addition4("Pickle", 5);
        hamburger.totalCost();

        System.out.println("-------");

        HealthyBurger healthyBurger = new HealthyBurger(true);
        healthyBurger.addition1("Lettuce", 3);
        healthyBurger.addition2("Tomato", 2);
        healthyBurger.addition3("carrot", 1);
        healthyBurger.addition4("Pickle", 5);
        healthyBurger.addition5("Lettuce", 3);
        healthyBurger.addition5("Avocado", 2);
        healthyBurger.totalCost();

    }
}
