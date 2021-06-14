package Account;

import controller.ProfessionScreenController;

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
        Profession.add("Villager");
        updateBadge();

    }

    public void addProfession (String profession) {
        Profession.add(profession);
        updateBadge();
    }

    public void removeProfessionByName (String profession) {
        for (int i=0; i <Profession.size(); i++) {
            String professionCheck = Profession.get(i);
            if (profession.equals(professionCheck)){
                Profession.remove(i);
            }
        }
        updateBadge();
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
            this.badge = new Communitybadge("No badge yet");
        }

    }

    public Communitybadge getBadge(){ return badge;}
}
