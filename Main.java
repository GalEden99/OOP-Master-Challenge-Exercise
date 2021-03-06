public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Regular", true);
        System.out.println(hamburger.getMaxAdditions());
        hamburger.addAdditions("Lettuce", 3);
        hamburger.addAdditions("Tomato", 2);
        hamburger.addAdditions("carrot", 1);
        hamburger.addAdditions("Pickle", 5);
        hamburger.addAdditions("Another", 5);
        hamburger.totalCost();

        System.out.println("-------");

        HealthyBurger healthyBurger = new HealthyBurger(true);
        System.out.println(healthyBurger.getMaxAdditions());
        healthyBurger.addAdditions("Lettuce", 3);
        healthyBurger.addAdditions("Tomato", 2);
        healthyBurger.addAdditions("carrot", 1);
        healthyBurger.addAdditions("Pickle", 5);
        healthyBurger.addAdditions("Lettuce", 3);
        healthyBurger.addAdditions("Avocado", 2);
        healthyBurger.addAdditions("Avocado", 2);
        healthyBurger.totalCost();

        System.out.println("-------");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("regular", false);
        System.out.println(deluxeHamburger.getMaxAdditions());
        deluxeHamburger.addAdditions("Lettuce", 3);
        deluxeHamburger.addAdditions("Tomato", 2);
        deluxeHamburger.addAdditions("carrot", 1);
        deluxeHamburger.addAdditions("Pickle", 5);
        deluxeHamburger.addAdditions("Lettuce", 3);
        System.out.println(deluxeHamburger.totalCost());

    }
}
