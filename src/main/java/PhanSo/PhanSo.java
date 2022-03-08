package PhanSo;

public class PhanSo {
    //Properties
    private int tu;
    private int mau;

    //Constructor
    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu) {
        this.tu = tu;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        if (mau == 0) {
            this.mau = 1;
        } else {
            if (mau < 0) {
                mau = -mau;
                this.tu = -this.tu;
            }
            this.mau = mau;
        }
    }

    //Methods getter & setter
    public int getTu() {
        return this.tu;
    }

    public int getMau() {
        return this.mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        if (mau == 0) {
            System.out.println("Mẫu số phải khác 0!");
        } else {
            if (mau < 0) {
                mau = -mau;
                this.tu = -this.tu;
            }

            this.mau = mau;
        }
    }

    public void hienThi() {
        if (this.tu == 0) {
            System.out.print("0");
        }
        else if(this.mau == 1){
            System.out.print(this.tu);
        }
        else {
            System.out.printf("%d/%d", this.tu, this.mau);
        }
    }

    public PhanSo cong(PhanSo p) {
        int tu = this.tu * p.mau + this.mau * p.tu;
        int mau = this.mau * p.mau;
        return new PhanSo(tu, mau);
    }

    public PhanSo tru(PhanSo p){
        int tu = this.tu * p.mau - this.mau * p.tu;
        int mau = this.mau * p.mau;
        return new PhanSo(tu,mau);
    }

    public PhanSo rutGon(){
        int temp = PhanSo.ucln(this.tu,this.mau);
        int tu = this.tu / temp;
        int mau = this.mau / temp;
        return new PhanSo(tu,mau);
    }

    public PhanSo nhan(PhanSo p){
        int tu = this.tu * p.tu;
        int mau = this.mau * p.mau;
        return new PhanSo(tu,mau);
    }

    public PhanSo chia(PhanSo p){
        int tu = this.tu * p.mau;
        int mau = this.mau * p.tu;
        return new PhanSo(tu, mau);
    }

    public static int ucln(int a,int b){
        int d = a % b;
        while(d != 0){
            a = b;
            b = d;
            d = a % b;
        }
        return b;
    }
}