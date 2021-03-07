public class DeluxeHamburger extends Hamburger{
    private int additionOfChipsAndDrinks;

    public DeluxeHamburger(String breadRollType, boolean isMeat) {
        super(breadRollType, isMeat);
        this.additionOfChipsAndDrinks = 10;
    }

    @Override
    public int totalCost() {
        this.price += additionOfChipsAndDrinks;
        System.out.println("Added addition of chips and drinks for " + this.additionOfChipsAndDrinks + "$");
        return super.totalCost();
    }
}
