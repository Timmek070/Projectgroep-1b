package Account;

import java.util.Observable;
import java.util.Observer;

public class Communitybadge implements Observer {

    private String rank;
    private double discount;
    private User hasBadge;


    public Communitybadge(User user ){
        this.hasBadge = user;
        hasBadge.addObserver(this);

    }

    public String getRank() {
        return this.rank;
    }


    public Double getDiscount() {
        return discount;
    }

    @Override
    public void update(Observable o, Object arg) {
        int a = (int)arg;
        if (a >= 6) {
            this.rank ="Gold";
            this.discount=0.15;
        }
        else if (a >= 4) {
            this.rank ="Silver";
            this.discount=0.10;

        }
        else if (a >= 2) {
            this.rank = "Bronze";
            this.discount=0.05;

        }
        else {
            this.rank = "No badge yet";
        }
    }
}
