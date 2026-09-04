package LTDB.Model;

public class Shipments {
    //shipment_id int NOT NULL
    //shipment_info char(50) NOT NULL
    //carrier char(50) NOT NULL

    private int shipment_id;
    private String shipment_info;
    private String carrier;

    public Shipments() {
    }

    public Shipments(String carrier, String shipment_info, int shipment_id) {
        this.carrier = carrier;
        this.shipment_info = shipment_info;
        this.shipment_id = shipment_id;
    }

    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }

    public String getShipment_info() {
        return shipment_info;
    }

    public void setShipment_info(String shipment_info) {
        this.shipment_info = shipment_info;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return "Shipments{" +
                "shipment_id=" + shipment_id +
                ", shipment_info='" + shipment_info + '\'' +
                ", carrier='" + carrier + '\'' +
                '}';
    }
}
