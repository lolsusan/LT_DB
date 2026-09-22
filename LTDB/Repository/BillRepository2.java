package LTDB.Repository;

import LTDB.Database.DatabaseConnection;
import LTDB.DTO.BillDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BillRepository2 {

    public ArrayList<BillDTO> getAllBills() {

        ArrayList<BillDTO> Bills = new ArrayList<>();

        String sql = "select\n" +
                "\t b.bill_id,\n" +
                "    b.date ,\n" +
                "    c.customer_name ,\n" +
                "    p.product_name ,\n" +
                "    p.product_selling_price ,\n" +
                "    bd.quantity ,\n" +
                "    bd.discount\n" +
                "    from bill b\n" +
                "    join customer c\n" +
                "    on b.customer_id = c.customer_id\n" +
                "    join bill_detail bd\n" +
                "    on b.bill_id = bd.bill_id\n" +
                "    join product p\n" +
                "    on bd.product_id = p.product_id\n" +
                "ORDER BY b.bill_id;";


        try {
            Connection connection = DatabaseConnection.getConnection();

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                BillDTO Bill = new BillDTO();

                Bill.setBillId(
                        resultSet.getInt("bill_id")
                );

                Bill.setCustomerName(
                        resultSet.getNString("customer_name")
                );

                Bill.setDate(
                        resultSet.getString("date")
                );

                Bill.setProductName(
                        resultSet.getString("product_name")
                );

                Bill.setProductSellingPrice(
                        resultSet.getInt("product_selling_price")
                );

                Bill.setQuantity(
                        resultSet.getInt("quantity")
                );

                Bill.setDiscount(
                        resultSet.getDouble("discount")
                );


                Bills.add(Bill);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Bills;
    }
}