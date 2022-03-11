import HinhHoc.*;
import SoHoc.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception {
        //menu();
        //menu2();
        //menu3();
        menu4();
    }

    public static void menu4() throws Exception {
        HinhChuNhat hcn = new HinhChuNhat(createDiem(1,4), createDiem(6,1));
        hcn.hienThi();
    }

    public static void menu3(){
        DoanThang dt1 = new DoanThang(createDiem(5,3), createDiem(2,3));
        DoanThang dt2 = new DoanThang(createDiem(3,1), createDiem(3,5));
        dt1.hienThi();
        dt2.hienThi();
        System.out.println(dt1.doDai());
        System.out.println(dt2.doDai());
        dt1.trungDiem().hienThi();
        dt2.trungDiem().hienThi();
        if(dt1.isSongSong(dt2))
            System.out.println("2 đoạn thẳng song song");
        else
            System.out.println("2 đoạn thẳng không song song");
    }

    public static Diem createDiem(double x, double y){
        return new Diem(x,y);
    }

    public static void menu2(){
        Diem d1 = new Diem(5,4);
        Diem d2 = new Diem(3,4);
        d1.hienThi();
        d2.hienThi();
        System.out.println(d1.khoangCach(d2));
    }

    public static void menu() throws Exception {
        Scanner sc = new Scanner(System.in);
        int choose;
        PhanSo p1 = new PhanSo(), p2 = new PhanSo();
        do{
            System.out.print("\033[H\033[2J");
            System.out.flush();
            p1.hienThi();
            p2.hienThi();
            System.out.print("""
                    1.Nhap hai phan so moi.
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

    public static PhanSo newPhanSo() throws Exception {
        int tu, mau;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tu so: ");
        tu = sc.nextInt();
        System.out.print("Nhap vao mau so: ");
        mau = sc.nextInt();
        return new PhanSo(tu,mau);
    }
}
