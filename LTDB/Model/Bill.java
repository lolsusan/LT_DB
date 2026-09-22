package LTDB.Model;

public class Bill {
    private int bill_id;
    private int customer_id;
    private String date;
    private String customer_name;

    public Bill() {
    }

    public Bill(int bill_id, int customer_id, String customer_name, String date) {
        this.bill_id = bill_id;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.date = date;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bill_id=" + bill_id +
                ", customer_id=" + customer_id +
                ", date='" + date + '\'' +
                '}';
    }
}
