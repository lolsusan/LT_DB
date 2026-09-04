package LTDB.Model;

public class Product {
    //Product
    //product_id int NOT NULL
    //product_name char(50) NOT NULL
    //product_purchase_price int NOT NULL
    //product_selling_price int NOT NULL
    //product_stock_quantity int NOT NULL

    private int product_id;
    private String product_name;
    private int product_purchase_price;
    private int product_selling_price;
    private int product_stock_quantity;


    public Product() {
    }

    public Product(int product_id, String product_name, int product_purchase_price, int product_selling_price, int product_stock_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_purchase_price = product_purchase_price;
        this.product_selling_price = product_selling_price;
        this.product_stock_quantity = product_stock_quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_purchase_price() {
        return product_purchase_price;
    }

    public void setProduct_purchase_price(int product_purchase_price) {
        this.product_purchase_price = product_purchase_price;
    }

    public int getProduct_selling_price() {
        return product_selling_price;
    }

    public void setProduct_selling_price(int product_selling_price) {
        this.product_selling_price = product_selling_price;
    }

    public int getProduct_stock_quantity() {
        return product_stock_quantity;
    }

    public void setProduct_stock_quantity(int product_stock_quantity) {
        this.product_stock_quantity = product_stock_quantity;
    }

    public void createNewProduct ( int product_id1 , String name1 , int purchase_price1 , int selling_price1 , int stock_quantity1){
        Product pro = new Product(product_id1 , name1 , purchase_price1 , selling_price1 , stock_quantity1 );
    }


    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_purchase_price=" + product_purchase_price +
                ", product_selling_price=" + product_selling_price +
                ", product_stock_quantity=" + product_stock_quantity +
                '}';
    }
}
