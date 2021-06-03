package Account;

public class Communitybadge {

    private String Rank;
    private User User;

    public Communitybadge(User User){
        this.Rank = User.getRank();
    }

    public String getRank() {
        return this.Rank;
    }

    public User getUser() {
        return this.User;
    }
}
