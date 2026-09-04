package LTDB.View;

import LTDB.Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<Product>();
        Product pro1 = new Product(1, "tra", 34, 43, 5);
        Product pro2 = new Product(2, "nuoc ngot", 23, 32, 99);
        Product pro3 = new Product(3, "nuoc loc", 1, 5, 999);

        list.add(pro1);
        list.add(pro2);
        list.add(pro3);

       boolean con = true ;

//        System.out.println("Nhap ID");
//        int id = sc.nextInt();
//        sc.nextLine();
do {
        System.out.println("Nhap lua chon cua ban : \n 1.them sp \n 2.xoa sp \n 3.sua sp \n 0.thoat");
        int choice = sc.nextInt();
    sc.nextLine();
        switch (choice){
            case 0 :
                con = false;
                break;
            case 1 :

                System.out.println("Nhap ten");
                String ten = sc.nextLine();

                System.out.println("Nhap gia mua");
                int mua = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhap gia ban");
                int ban = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhap ton kho");
                int kho = sc.nextInt();
                sc.nextLine();

                Product pro = new Product(list.size() + 1, ten, mua, ban, kho);

                list.add(pro);

                System.out.println("\nProduct vua tao:");
                System.out.println(pro);

                System.out.println("\nDanh sach Product:");
                for (Product p : list) {
                    System.out.println(p);
                }
                break;
            case 2 :
                System.out.println("Nhap id sp muon xoa");
                int xoa = sc.nextInt();
                sc.nextLine();
                for (Product p : list) {
                    if (p.getProduct_id() == xoa){

                        System.out.println("da xoa : " + p);
                        list.remove(xoa - 1);
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