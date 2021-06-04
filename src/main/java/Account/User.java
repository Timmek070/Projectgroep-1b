package Account;

import java.util.ArrayList;

public class User extends Account {

    private String Username;
    private String Password;
    private String Email;
    private String Type;
    private ArrayList<String> Profession;
    private Communitybadge badge;

    public User(String Username, String Password, String Email, String Name, String Sex, String Dateofbirth, String Type) {
        super(Name, Sex, Dateofbirth);
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Type = Type;
        this.Profession=new ArrayList<>();
        Profession.add("a");
        Profession.add("a");
        Profession.add("a");
        Profession.add("a");
        Profession.add("a");
    }

    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getType() {
        return this.Type;
    }

    public ArrayList<String> getProfession() {
        return this.Profession;
    }

    public void updateBadge() {
        if (this.getProfession().size() >= 6) {
            this.badge = new Communitybadge("Gold");
        }
        else if (this.getProfession().size() >= 4) {
            this.badge = new Communitybadge("Silver");

        }
        else if (this.getProfession().size() >= 2) {
            this.badge = new Communitybadge("Bronze");

        }

        else {
            this.badge = null;
        }

    }

    public Communitybadge getBadge(){ return badge;}
}
