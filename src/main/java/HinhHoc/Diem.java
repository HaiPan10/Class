package HinhHoc;

public class Diem {
    private double hoanhDo;
    private double tungDo;
    public Diem(double hoanhDo, double tungDo){
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public double getHoanhDo(){
        return this.hoanhDo;
    }

    public double getTungDo(){
        return this.tungDo;
    }

    public void setHoanhDo(double hoangDo){
        this.hoanhDo = hoangDo;
    }

    public void setTungDo(double tungDo){
        this.tungDo = tungDo;
    }

    public void hienThi(){
        System.out.printf("(%.1f; %.1f)\n", this.hoanhDo, this.tungDo);
    }

    public double khoangCach(Diem d2){
        double x = Math.pow(this.hoanhDo - d2.hoanhDo,2);
        double y = Math.pow(this.tungDo - d2.tungDo,2);
        return Math.round(Math.sqrt(x + y));
    }
}
