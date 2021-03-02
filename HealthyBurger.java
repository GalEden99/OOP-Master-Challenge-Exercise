public class HealthyBurger extends Hamburger{

    public HealthyBurger(boolean meat) {
        super("Brown rye bread roll", meat);
    }

    int addition5Cost;
    int addition6Cost;


    public int addition5(String additionName, int amount){
        addition5Cost = (costOfAddition(additionName))*amount;
        System.out.println("Added "+ amount + " " + additionName + " for " + costOfAddition(additionName) + "$ each");
        return addition5Cost;
    }

    public int addition6(String additionName, int amount){
        addition6Cost = (costOfAddition(additionName))*amount;
        System.out.println("Added "+ amount + " " + additionName + " for " + costOfAddition(additionName) + "$ each");
        return addition6Cost;
    }

    @Override
    public int totalCost() {
        return (super.totalCost()+addition5Cost+addition6Cost);
    }
}
