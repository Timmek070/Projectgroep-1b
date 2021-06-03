package Account;

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

