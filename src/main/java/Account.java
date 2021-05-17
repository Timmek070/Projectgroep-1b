import java.util.ArrayList;

public abstract class Account {

    private String Name;
    private String Sex;
    private String Dateofbirth;

    public Account(String Name, String Sex, String Dateofbirth){
        this.Name = Name;
        this.Sex = Sex;
        this.Dateofbirth = Dateofbirth;
    }

    public String getName(){
        return this.Name;
    }

    public String getSex(){
        return this.Sex;
    }

    public String getDateofbirth(){
        return this.Dateofbirth;
    }
}

class User extends Account{

    private String Username;
    private String Password;
    private String Email;
    private String Type;
    private ArrayList<String> Proffession;

    public User(String Username, String Password, String Email, String Name, String Sex, String Dateofbirth, String Type, ArrayList<String> Proffession) {
        super(Name, Sex, Dateofbirth);
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Type = Type;
        this.Proffession = Proffession;
    }

    public String getUsername(){
        return this.Username;
    }

    public String getPassword(){
        return this.Password;
    }

    public String getEmail(){
        return this.Email;
    }

    public String getType(){
        return this.Type;
    }

    public ArrayList<String> getProffession(){
        return this.Proffession;
    }

    public String getRank() {
        if(this.getProffession().size() >= 6) {
            return "Gold";
        }
        if(this.getProffession().size() >= 4) {
            return "Silver";
        }
        if(this.getProffession().size() >= 2) {
            return "Bronze";
        }
        return "No badge";
    }
}

class Child extends Account{

    public Child(String Name, String Sex, String Dateofbirth) {
        super(Name, Sex, Dateofbirth);
    }
}