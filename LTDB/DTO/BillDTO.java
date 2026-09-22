package LTDB.DTO;

public class BillDTO {

    private int billId;
    private String date;
    private String customerName;
    private String productName;
    private int productSellingPrice;
    private int quantity;
    private int subTotalPrice;
    private double discount;
    private double totalPrice;

    public BillDTO() {
    }

    public BillDTO(int billId, double discount, double totalPrice, int subTotalPrice, int quantity, int productSellingPrice, String productName, String customerName, String date) {
        this.billId = billId;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.subTotalPrice = subTotalPrice;
        this.quantity = quantity;
        this.productSellingPrice = productSellingPrice;
        this.productName = productName;
        this.customerName = customerName;
        this.date = date;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(int productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSubTotalPrice() {
        return subTotalPrice;
    }

    public void setSubTotalPrice(int subTotalPrice) {
        this.subTotalPrice = subTotalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "BillDTO{" +
                "billId=" + billId +
                ", date='" + date + '\'' +
                ", customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", productSellingPrice=" + productSellingPrice +
                ", quantity=" + quantity +
                ", subTotalPrice=" + subTotalPrice +
                ", discount=" + discount +
                ", totalPrice=" + totalPrice +
                '}';
    }
}