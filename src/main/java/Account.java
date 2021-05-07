import java.util.Date;

public class Account {
    private String Name;
    private String Sex;
    private Date Dateofbirth;
    private String Type;
    private String Proffession;

    public Account(String Name, String Sex, Date Dateofbirth, String Type, String Proffession){
        this.Name = Name;
        this.Sex = Sex;
        this.Dateofbirth = Dateofbirth;
        this.Type = Type;
        this.Proffession = Proffession;
    }

    public String getName(){
        return this.Name;
    }

    public String getSex(){
        return this.Sex;
    }

    public Date getDateofbirth(){
        return this.Dateofbirth;
    }

    public String getType(){
        return this.Type;
    }

    public String getProffession(){
        return this.Proffession;
    }
}

class User extends Account{

    public User(String Name, String Sex, Date Dateofbirth, String Type, String Proffession) {
        super(Name, Sex, Dateofbirth, Type, Proffession);
    }

    private String Username;
    private String Password;
    private String Email;

    public String getUsername(){
        return this.Username;
    }

    public String getPassword(){
        return this.Password;
    }

    public String getEmail(){
        return this.Email;
    }
}

class Child extends Account{

    public Child(String Name, String Sex, Date Dateofbirth, String Type, String Proffession) {
        super(Name, Sex, Dateofbirth, Type, Proffession);
    }
}