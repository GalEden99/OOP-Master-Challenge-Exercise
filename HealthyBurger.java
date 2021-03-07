public class HealthyBurger extends Hamburger {

    private int maxAdditions;

    public HealthyBurger(boolean isMeat) {
        super("Brown rye bread roll", isMeat);
        this.maxAdditions = 6;
    }

    @Override
    public int getMaxAdditions() {
        return maxAdditions;
    }
}