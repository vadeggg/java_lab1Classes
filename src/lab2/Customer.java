package lab2;

import java.util.Objects;


/**
 *  @author Vadym
 *  * @version 1.0
 *  * @since 1.1
 * */
/**
 *  Class Customer extends User*/
public class Customer extends User {
    int customerId;
    /**
     * Constructor
     * @param name - String
     * @param surname -  String
     * @param user_type - String
     * @param customerId - int*/
    public  Customer(String name, String surname, String user_type, int customerId){
        super(name, surname, user_type);
        this.customerId = customerId;
    }
    @Override()
    public String toString(){
//        String res = super.toString();
        return "lab2.User{ "
                + "name=" + this.name
                + ", surname=" + this.surname
                + ", user_type=" + this.user_type
                + ", customerId=" + this.customerId
                +" }";
    }
    /**
     * equals method
     * @param o Object
     * @return boolean
     * */
    public  boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(user_type, customer.user_type) && Objects.equals(customerId, customer.customerId);
    }
    /**
     * method for class hashing
     * @return result */
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + user_type.hashCode();
        result = 31 * result + customerId;
        return result;
    }
}