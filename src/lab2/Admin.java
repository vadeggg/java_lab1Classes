package lab2;

import java.util.Arrays;
import java.util.Objects;
/**
 * @author Vadym
 * */
/**
 * Admin class extends User*/
public class Admin extends User{
    int[] admKeys;
    /**
     * @param name - String
     * @param surname -  String
     * @param user_type - String
     * @param admKeys - int[]*/
    public Admin(String name, String surname, String user_type, int[] admKeys){
        super(name, surname, user_type);
        this.admKeys = admKeys;
    }
    public String toString(){
        return "lab2.User{ "
                + "name= " + this.name
                + ", surname= " + this.surname
                + ", user_type= " + this.user_type
                + ", admin_keys= " + Arrays.toString(this.admKeys)
                +" }";
    }
    /**
     * equals method
     * @param o Object
     * @return  boolean*/
    public  boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin adm = (Admin) o;
        return Objects.equals(name, adm.name) && Objects.equals(surname, adm.surname) && Objects.equals(user_type, adm.user_type) && Objects.equals(admKeys, adm.admKeys);
    }

    @Override
    /**
     * method that class hashing
     * @return int*/
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + user_type.hashCode();
        result = 31 * result + Arrays.stream(admKeys).sum();
        return result;
    }

}
