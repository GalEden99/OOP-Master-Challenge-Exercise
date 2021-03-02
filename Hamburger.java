public class Hamburger {
    private String breadRollType;
    private boolean meat;
    private int price;

    public Hamburger(String breadRollType, boolean meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 0;
    }
    
    public int costOfAddition(String additionName){
        int cost;
        switch (additionName.toLowerCase()){
            case "lettuce":
                cost = 2;
                break;
            case "tomato":
                cost = 3;
                break;
            case "carrot":
                cost = 4;
                break;
            default:
                cost = 1;
                break;
        }
        return cost;
    }

    public void addition1(String additionName, int amount){
        int addition1Cost;
        addition1Cost = (costOfAddition(additionName))*amount;
        System.out.println("Added "+ amount + " " + additionName + " for " + costOfAddition(additionName) + "$ each");
        this.price += addition1Cost;
    }

    public void addition2(String additionName, int amount){
        int addition2Cost;
        addition2Cost = (costOfAddition(additionName))*amount;
        System.out.println("Added "+ amount + " " + additionName + " for " + costOfAddition(additionName) + "$ each");
        this.price += addition2Cost;
    }

    public void addition3(String additionName, int amount){
        int addition3Cost;
        addition3Cost = (costOfAddition(additionName))*amount;
        System.out.println("Added "+ amount + " " + additionName + " for " + costOfAddition(additionName) + "$ each");
        this.price += addition3Cost;
    }

    public void addition4(String additionName, int amount){
        int addition4Cost;
        addition4Cost = (costOfAddition(additionName))*amount;
        System.out.println("Added "+ amount + " " + additionName + " for " + costOfAddition(additionName) + "$ each");
        this.price += addition4Cost;
    }


    public int totalCost(){
        if (meat == true) this.price +=9;// meat price
        this.price += 15; // base price
        System.out.println("In total your meal costs " + this.price + "$");
        return this.price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }
}
