package Account;

import java.util.ArrayList;
import java.util.Observable;

public class User extends Observable{

    private String name;
    private String sex;
    private String dateOfBirth;
    private String username;
    private String password;
    private String email;
    private String type;
    private ArrayList<String> profession;
    private Communitybadge badge;

    public User(String username, String password, String email, String name, String sex, String dateOfbirth, String type) {
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfbirth;
        this.username = username;
        this.password = password;
        this.email = email;
        this.type = type;
        this.profession = new ArrayList<>();
        profession.add("Villager");
        this.badge = new Communitybadge(this);
    }

    public void addProfession (String profession) {
        if (!profession.equals("Villager")) {
            this.profession.add(profession);
            setChanged();
            notifyObservers(this.profession.size());
            System.out.println(badge.getRank());
        }
    }

    public void removeProfessionByName (String profession) {
        if (!profession.equals("Villager")) {
            for (int i = 0; i < this.profession.size(); i++) {
                String professionCheck = this.profession.get(i);
                if (profession.equals(professionCheck)) {
                    this.profession.remove(i);
                }
            }
            setChanged();
            notifyObservers(this.profession.size());
            System.out.println(badge.getRank());
        }
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getType() {
        return this.type;
    }

    public ArrayList<String> getProfession() {
        return this.profession;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public Communitybadge getBadge(){ return badge;}
}
