package lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CustomerTest {
    @Test
    public void toStringTest() {
        Customer customer = new Customer("Name", "Surname", "Customer", 12);
        assertEquals(customer.toString(), "lab2.User{ name=Name, surname=Surname, user_type=Customer, customerId=12 }");
    }
    @Test
    void testEquals() {
        Customer customer = new Customer("Name", "Surname", "Customer", 12);
        Customer customer1 = new Customer("Name", "Surname", "Customer", 12);
        Customer customer2 = new Customer("Name", "Surname2", "Customer", 12);

        assertEquals(customer.equals(customer), true);
        assertEquals(customer.equals(customer1), true);
        assertEquals(customer.equals(customer2), false);

    }

    @Test
    void testHashCode() {
        Customer customer = new Customer("Name", "Surname", "Customer", 12);
        Customer customer1 = new Customer("Name", "Surname", "Customer1", 12);
        assertEquals(customer.hashCode(), customer.hashCode());
        assertNotEquals(customer.hashCode(),customer1.hashCode());

    }
    @Test
    void someTest(){
        User user = new User.UserBuilder()
                .setUser_type("user")
                .setSurname("Red")
                .setUserName("alex")
                .build();
        System.out.println(user.toString());
    }
}