package LTDB.Repository;

import LTDB.DTO.ShipmentsDetailDTO;
import LTDB.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ShipmentDetailRepository {

    public ArrayList<ShipmentsDetailDTO> getAllDetail() {

        ArrayList<ShipmentsDetailDTO> Ships = new ArrayList<>();

        String sql = "select \n" +
                "\tsd.shipments_detail_id,\n" +
                "    p.product_name,\n" +
                "    s.shipment_info,\n" +
                "    s.carrier,\n" +
                "    sd.quantity\n" +
                "from shipment_detail sd\n" +
                "join product p on p.product_id = sd.product_id \n" +
                "join shipments s on s.shipment_id = sd.shipment_id\n" +
                "order by sd.shipments_detail_id ;";


        try {
            Connection connection = DatabaseConnection.getConnection();

            assert connection != null;
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                ShipmentsDetailDTO Ship = new ShipmentsDetailDTO();

                Ship.setShipments_detail_id(
                        resultSet.getInt("shipments_detail_id")
                );
                Ship.setProduct_name(
                        resultSet.getString("product_name")
                );
                Ship.setShipment_info(
                        resultSet.getString("shipment_info")
                );
                Ship.setCarrier(
                        resultSet.getString("carrier")
                );
                Ship.setQuantity(
                        resultSet.getInt("quantity")
                );

                Ships.add(Ship);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Ships;
    }
}