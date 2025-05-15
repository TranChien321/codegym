package Lesson_5.Customer;

public class TestCustomer {
        public static void main(String[] args) {
            Customer c1 = new Customer(1, "Chiến", "tranchienn2307@gmail.com", "0966307975", "1999-07-23", 950);
            c1.makePurchase(100);
            c1.displayInfo();

            System.out.println("\n---\n");

            Customer c2 = new Customer("Bách");
            c2.setId(2);
            c2.setEmail("bachnnt99@example.com");
            c2.setPhone("0987654321");
            c2.setJoinDate("1999-01-01");
            c2.setTotalPurchases(400);
            c2.displayInfo();
        }
    }

