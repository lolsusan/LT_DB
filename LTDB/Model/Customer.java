package LTDB.Model;

public class Customer {
    private int customer_id;
    private String customer_name;
    private String customer_phone_num;

    public Customer() {
    }

    public Customer(int customer_id, String customer_name, String customer_phone_num) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_phone_num = customer_phone_num;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_phone_num() {
        return customer_phone_num;
    }

    public void setCustomer_phone_num(String customer_phone_num) {
        this.customer_phone_num = customer_phone_num;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_phone_num='" + customer_phone_num + '\'' +
                '}';
    }
}
