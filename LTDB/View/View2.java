package LTDB.View;

import LTDB.Model.Customer;
import LTDB.Repository.CustomerRepository;

import java.util.ArrayList;

public class View2 {
    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepository();

        ArrayList<Customer> Customers = repository.getAllCustomers();

        System.out.println("========== CUSTOMER LIST ==========");

        for (Customer Customer : Customers) {

            System.out.println(
                    "ID: " + Customer.getCustomer_id()
            );

            System.out.println(
                    "Name: " + Customer.getCustomer_name()
            );

            System.out.println(
                    "Phone number: "
                            + Customer.getCustomer_phone_num()
            );


            System.out.println("----------------------------------");
        }
    }
}
