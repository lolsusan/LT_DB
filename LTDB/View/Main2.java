package LTDB.View;

import LTDB.Model.Shipments;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shipments> list = new ArrayList<Shipments>();
        Shipments ship1 = new Shipments(1,"Giao tra" ,"Honda" );
        Shipments ship2 = new Shipments(2, "Giao nuoc ngot", "IDK");
        Shipments ship3 = new Shipments(3, "Giao nuoc loc", "Freari");

        list.add(ship1);
        list.add(ship2);
        list.add(ship3);

        boolean con = true ;
        int highest_id = 3;

        do {
            System.out.println("Nhap lua chon cua ban : \n 1.them ship \n 2.xoa ship \n 3.sua ship \n 0.thoat");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0 :
                    con = false;
                    break;
                case 1 :
                    System.out.println("Nhap tt ");
                    String tt = sc.nextLine();

                    System.out.println("Nhap ten xe ");
                    String ten = sc.nextLine();

                    Shipments ship = new Shipments(highest_id + 1, tt, ten);

                    list.add(ship);

                    highest_id++ ;

                    System.out.println("\nShipments vua tao:");
                    System.out.println(ship);

                    System.out.println("\nDanh sach Shipments:");
                    for (Shipments s : list) {
                        System.out.println(s);
                    }
                    break;
                case 2 :
                    System.out.println("Nhap id sp muon xoa");
                    int xoa = sc.nextInt();
                    sc.nextLine();
                    for (Shipments s : list) {
                        if (s.getShipment_id() == xoa){
                            if(highest_id == xoa){
                                highest_id-- ;
                            }
                            System.out.println("da xoa : " + s);
                            list.remove(xoa - 1);
                            break;
                        }
                    }
                    break;
                case 3 :
                    System.out.println("Nhap id sp muon sua");
                    int sua = sc.nextInt();
                    sc.nextLine();
                    for (Shipments p : list) {
                        if (p.getShipment_id() == sua){
                            System.out.println("truoc khi sua : " + p);

                            System.out.println("Nhap lai tt : ");
                            String tt2 = sc.nextLine();
                            p.setShipment_info(tt2);

                            System.out.println("Nhap lai ten xe : ");
                            String ten2 = sc.nextLine();
                            p.setCarrier(ten2);
                            break;
                        }
                    }
                    break;

                default:
                    continue;
            }
        } while (con);


        sc.close();
    }
}