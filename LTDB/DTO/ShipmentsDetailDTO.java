package LTDB.DTO;

public class ShipmentsDetailDTO {
    //shipments_detail_id int NOT NULL
    //product_id int NOT NULL
    //shipment_id int NOT NULL

    private int shipments_detail_id;
    private String product_name;
    private String shipment_info;
    private String carrier;
    private int quantity;


    public ShipmentsDetailDTO() {
    }

    public ShipmentsDetailDTO(int shipments_detail_id, String product_name, int quantity, String carrier, String shipment_info) {
        this.shipments_detail_id = shipments_detail_id;
        this.product_name = product_name;
        this.quantity = quantity;
        this.carrier = carrier;
        this.shipment_info = shipment_info;
    }

    public int getShipments_detail_id() {
        return shipments_detail_id;
    }

    public void setShipments_detail_id(int shipments_detail_id) {
        this.shipments_detail_id = shipments_detail_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getShipment_info() {
        return shipment_info;
    }

    public void setShipment_info(String shipment_info) {
        this.shipment_info = shipment_info;
    }

    @Override
    public String toString() {
        return "ShipmentsDetailDTO{" +
                "shipments_detail_id=" + shipments_detail_id +
                ", product_name='" + product_name + '\'' +
                ", shipment_info='" + shipment_info + '\'' +
                ", carrier='" + carrier + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
