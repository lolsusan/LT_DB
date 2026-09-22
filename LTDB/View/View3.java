package LTDB.View;

import LTDB.Model.Bill;
import LTDB.Repository.BillRepository;

import java.util.ArrayList;

public class View3 {
    public static void main(String[] args) {

        BillRepository repository = new BillRepository();

        ArrayList<Bill> Bills = repository.getAllBills();

        System.out.println("========== Bill LIST ==========");

        for (Bill Bill : Bills) {

            System.out.println(
                    "ID: " + Bill.getBill_id()
            );

            System.out.println(
                    "Customer Name: " + Bill.getCustomer_name()
            );

            System.out.println(
                    "Date: " + Bill.getDate()
            );


            System.out.println("----------------------------------");
        }
    }
}
