package Account;

import controller.ProfessionScreenController;

import java.util.ArrayList;
import java.util.Observable;

public class User extends Observable{

    private String Name;
    private String Sex;
    private String Dateofbirth;
    private String Username;
    private String Password;
    private String Email;
    private String Type;
    private ArrayList<String> Profession;
    private Communitybadge badge;

    public User(String Username, String Password, String Email, String Name, String Sex, String Dateofbirth, String Type) {
        this.Name = Name;
        this.Sex = Sex;
        this.Dateofbirth = Dateofbirth;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Type = Type;
        this.Profession=new ArrayList<>();
        Profession.add("Villager");
        this.badge = new Communitybadge(this);
    }

    public void addProfession (String profession) {
        if (!profession.equals("Villager")) {
            Profession.add(profession);
            setChanged();
            notifyObservers(Profession.size());
            System.out.println(badge.getRank());
        }
    }

    public void removeProfessionByName (String profession) {
        if (!profession.equals("Villager")) {
            for (int i = 0; i < Profession.size(); i++) {
                String professionCheck = Profession.get(i);
                if (profession.equals(professionCheck)) {
                    Profession.remove(i);
                }
            }
            setChanged();
            notifyObservers(Profession.size());
            System.out.println(badge.getRank());
        }
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

    public String getName() {
        return Name;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public String getSex() {
        return Sex;
    }

    public Communitybadge getBadge(){ return badge;}
}
