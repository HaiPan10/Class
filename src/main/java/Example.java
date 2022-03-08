import PhanSo.PhanSo;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int choose;
        PhanSo p1 = new PhanSo(), p2 = new PhanSo();
        do{
            System.out.print("\033[H\033[2J");
            System.out.flush();
            p1.hienThi();
            p2.hienThi();
            System.out.print("""
                    1. Nhap hai phan so moi.
                    2.Cong hai phan so.
                    3.Tru hai phan so.
                    4.Nhan hai phan so.
                    5.Chia hai phan so.
                    0.Exit.
                    Moi chon:\s""");
            choose = sc.nextInt();
            switch(choose) {
                case 1 -> {
                    p1 = newPhanSo();
                    p2 = newPhanSo();
                }
                case 2 -> p1.cong(p2).rutGon().hienThi();
                case 3 -> p1.tru(p2).rutGon().hienThi();
                case 4 -> p1.nhan(p2).rutGon().hienThi();
                case 5 -> p1.chia(p2).rutGon().hienThi();
                default -> System.out.println("Ban chon thoat.");
            }
            System.out.print("Nhan enter de tiep tuc.\n");
            sc.nextLine();
            sc.nextLine();
        }while(choose >= 1 && choose <= 5);
    }

    public static PhanSo newPhanSo(){
        int tu, mau;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tu so: ");
        tu = sc.nextInt();
        System.out.print("Nhap vao mau so: ");
        mau = sc.nextInt();
        return new PhanSo(tu,mau);
    }
}
