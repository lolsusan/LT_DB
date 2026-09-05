package LTDB.View;

import LTDB.Model.Product;
import LTDB.Model.Shipments;
import LTDB.Model.Shipments_Detail;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Shipments_Detail> list = new ArrayList<>();

        Product pro1 = new Product(1, "tra", 34, 43, 5);
        Product pro2 = new Product(2, "nuoc ngot", 20, 30, 10);
        Product pro3 = new Product(3, "sua", 15, 25, 8);

        Shipments ship1 = new Shipments(1, "Giao tra", "Honda");
        Shipments ship2 = new Shipments(2, "Giao nuoc ngot", "Yamaha");
        Shipments ship3 = new Shipments(3, "Giao sua", "Toyota");

        Shipments_Detail detail1 = new Shipments_Detail();
        detail1.setShipments_detail_id(1);
        detail1.setProduct_id(pro1.getProduct_id());
        detail1.setShipment_id(ship1.getShipment_id());

        Shipments_Detail detail2 = new Shipments_Detail();
        detail2.setShipments_detail_id(2);
        detail2.setProduct_id(pro2.getProduct_id());
        detail2.setShipment_id(ship2.getShipment_id());

        Shipments_Detail detail3 = new Shipments_Detail();
        detail3.setShipments_detail_id(3);
        detail3.setProduct_id(pro3.getProduct_id());
        detail3.setShipment_id(ship3.getShipment_id());

        list.add(detail1);
        list.add(detail2);
        list.add(detail3);

        boolean con = true;
        int highest_id = 3;

        do {
            System.out.println("\nNhap lua chon cua ban:");
            System.out.println("1. Them shipment detail");
            System.out.println("2. Xoa shipment detail");
            System.out.println("3. Sua shipment detail");
            System.out.println("4. Hien thi danh sach");
            System.out.println("0. Thoat");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 0:
                    con = false;
                    break;

                case 1:
                    System.out.println("\nNhap product id:");
                    int product_id = sc.nextInt();

                    System.out.println("Nhap shipment id:");
                    int shipment_id = sc.nextInt();
                    sc.nextLine();

                    Shipments_Detail detail = new Shipments_Detail();

                    detail.setShipments_detail_id(highest_id + 1);
                    detail.setProduct_id(product_id);
                    detail.setShipment_id(shipment_id);

                    list.add(detail);

                    highest_id++;

                    System.out.println("\nShipment Detail vua tao:");
                    System.out.println(detail);

                    System.out.println("\nDanh sach Shipment Detail:");
                    for (Shipments_Detail d : list) {
                        System.out.println(d);
                    }

                    break;

                case 2:
                    System.out.println("\nNhap id shipment detail muon xoa:");
                    int xoa = sc.nextInt();
                    sc.nextLine();

                    boolean foundDelete = false;

                    for (int i = 0; i < list.size(); i++) {

                        if (list.get(i).getShipments_detail_id() == xoa) {

                            System.out.println("Da xoa: " + list.get(i));

                            list.remove(i);

                            foundDelete = true;
                            break;
                        }
                    }

                    if (!foundDelete) {
                        System.out.println("Khong tim thay shipment detail co id " + xoa);
                    }

                    break;

                case 3:
                    System.out.println("\nNhap id shipment detail muon sua:");
                    int sua = sc.nextInt();
                    sc.nextLine();

                    boolean foundEdit = false;

                    for (Shipments_Detail d : list) {

                        if (d.getShipments_detail_id() == sua) {

                            System.out.println("Truoc khi sua:");
                            System.out.println(d);

                            System.out.println("\nNhap product id moi:");
                            int product_id2 = sc.nextInt();

                            System.out.println("Nhap shipment id moi:");
                            int shipment_id2 = sc.nextInt();
                            sc.nextLine();

                            d.setProduct_id(product_id2);
                            d.setShipment_id(shipment_id2);

                            System.out.println("\nSau khi sua:");
                            System.out.println(d);

                            foundEdit = true;
                            break;
                        }
                    }

                    if (!foundEdit) {
                        System.out.println("Khong tim thay shipment detail co id " + sua);
                    }

                    break;

                case 4:
                    System.out.println("\nDanh sach Shipment Detail:");

                    for (Shipments_Detail d : list) {
                        System.out.println(d);
                    }

                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (con);

        sc.close();
    }
}