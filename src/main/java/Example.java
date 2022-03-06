import PhanSo.PhanSo;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(4,3);
        PhanSo b = new PhanSo(1,1);
        a = a.tru(b).rutGon();
        a.hienThi();
    }
}
