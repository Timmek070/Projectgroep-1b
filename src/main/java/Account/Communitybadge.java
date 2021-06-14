package Account;

public class Communitybadge {

    private String rank;
    private double discount = 0.0;


    public Communitybadge(String rank){
        this.rank = rank;
        if (this.rank.equals("Gold")) {
            this.discount = 0.15;
        }
        if (rank.equals("Silver")) {
            this.discount = 0.1;
        }
        if (rank.equals ("Bronze")) {
            this.discount = 0.05;
        }
        else {
            this.discount = 0.0;
        }
    }

    public String getRank() {
        return this.rank;
    }


    public Double getDiscount() {
        return discount;
    }

}
