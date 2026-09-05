package LTDB.Model;

public class Shipments_Detail {
    //shipments_detail_id int NOT NULL
    //product_id int NOT NULL
    //shipment_id int NOT NULL

    private int shipments_detail_id;
    private int product_id;
    private int shipment_id;

    public Shipments_Detail() {
    }

    public Shipments_Detail(int shipments_detail_id, int product_id, int shipment_id) {
        this.shipments_detail_id = shipments_detail_id;
        this.product_id = product_id;
        this.shipment_id = shipment_id;
    }

    public int getShipments_detail_id() {
        return shipments_detail_id;
    }

    public void setShipments_detail_id(int shipments_detail_id) {
        this.shipments_detail_id = shipments_detail_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }

    @Override
    public String toString() {
        return "Shipments_Detail{" +
                "shipments_detail_id=" + shipments_detail_id +
                ", product_id=" + product_id +
                ", shipment_id=" + shipment_id +
                '}';
    }
}
