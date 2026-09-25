package LTDB.View;

import LTDB.DTO.ShipmentsDetailDTO;
import LTDB.Repository.ShipmentDetailRepository;

import java.util.ArrayList;

public class ShipmentDetail {
    public static void main(String[] args) {

        ShipmentDetailRepository repository = new ShipmentDetailRepository();

        ArrayList<ShipmentsDetailDTO> shipments = repository.getAllDetail();

        System.out.println("========== SHIPMENT DETAIL LIST ==========");

        for (ShipmentsDetailDTO ship : shipments) {

            System.out.println(
                    "Shipment Detail ID: " + ship.getShipments_detail_id()
            );

            System.out.println(
                    "Product Name: " + ship.getProduct_name()
            );

            System.out.println(
                    "Shipment Info: " + ship.getShipment_info()
            );

            System.out.println(
                    "Carrier: " + ship.getCarrier()
            );

            System.out.println(
                    "Quantity: " + ship.getQuantity()
            );

            System.out.println("----------------------------------");
        }
    }
}