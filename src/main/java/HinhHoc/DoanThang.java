package HinhHoc;

public class DoanThang {
    private Diem d1;
    private Diem d2;
    public DoanThang(Diem d1, Diem d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    public Diem getD1(){
        return this.d1;
    }

    public Diem getD2(){
        return this.d2;
    }

    public void setD1(Diem d1){
        this.d1 = d1;
    }

    public void setD2(Diem d2){
        this.d2 = d2;
    }

    public void hienThi(){
        System.out.printf("[(%.1f ; %.1f), (%.1f ; %.1f)]\n",d1.getHoanhDo(), d1.getTungDo(), d2.getHoanhDo(), d2.getTungDo());
    }

    public double doDai(){
        return this.d1.khoangCach(d2);
    }

    public Diem trungDiem(){
        double x = (d1.getHoanhDo() + d2.getHoanhDo()) / 2;
        double y = (d1.getTungDo() + d2.getTungDo()) / 2;
        return new Diem(x,y);
    }

    public boolean isSongSong(DoanThang dt2){
        double a = this.d1.getHoanhDo() - this.d2.getHoanhDo();
        double b = this.d1.getTungDo() - this.d2.getTungDo();
        double c = dt2.getD1().getHoanhDo() - dt2.getD2().getHoanhDo();
        double d = dt2.getD1().getTungDo() - dt2.getD2().getTungDo();
        return a / b == c / d;
    }
}
