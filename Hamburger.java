public class Hamburger {
    private String breadRollType;
    private boolean isMeat;
    public int price;
    private int maxAdditions;

    public Hamburger(String breadRollType, boolean isMeat) {
        this.breadRollType = breadRollType;
        this.isMeat = isMeat;
        this.price = 0;
        this.maxAdditions = 4;
    }
    
    public int costOfAddition(String additionName){
        switch (additionName.toLowerCase()){
            case "lettuce":
                return 2;
            case "tomato":
                return 3;
            case "carrot":
                return 4;
            default:
                return 1;
        }
    }

    public void addAdditions(String additionName, int amount){
        if (getMaxAdditions()>0){
            int totalAddition;
            totalAddition = (costOfAddition(additionName))*amount;
            System.out.println("Added "+ amount + " " + additionName + " for " + costOfAddition(additionName) + "$ each");
            this.price += totalAddition;
            this.maxAdditions -= 1;
        } else System.out.println("You have reached your maximum limit for additions.");
    }

    public int getMaxAdditions(){
        return 4;
    }


    public int totalCost(){
        if (isMeat == true) this.price +=9;// meat price
        this.price += 15; // base price
        System.out.println("In total your meal costs " + this.price + "$");
        return this.price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public int getPrice() {
        return price;
    }
}
