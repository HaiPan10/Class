package Class;
public class HinhChuNhat {
    private Diem diemTrenTrai;
    private Diem diemDuoiPhai;
    public HinhChuNhat(Diem dtt, Diem ddp) throws Exception {
        if(dtt.getTungDo() >= ddp.getTungDo() && dtt.getHoanhDo() <= ddp.getHoanhDo()){
            this.setDiemTrenTrai(dtt);
            this.setDiemDuoiPhai(ddp);
        }
        else{
            throw new Exception("Invalid data");
        }
    }

    public double dienTichHCN(){
        double chieuRong = this.diemDuoiPhai.getHoanhDo() - this.diemTrenTrai.getHoanhDo();
        double chieuDai = this.diemTrenTrai.getTungDo() - this.diemDuoiPhai.getTungDo();
        return chieuRong * chieuDai;
    }

    public double chuViHCN(){
        double chieuRong = this.diemDuoiPhai.getHoanhDo() - this.diemTrenTrai.getHoanhDo();
        double chieuDai = this.diemTrenTrai.getTungDo() - this.diemDuoiPhai.getTungDo();
        return (chieuRong + chieuDai) * 2;
    }

    public void hienThi(){
        diemTrenTrai.hienThi();
        diemDuoiPhai.hienThi();
        System.out.printf("Dien tich: %.1f\n", dienTichHCN());
        System.out.printf("Chu vi: %.1f\n", chuViHCN());
    }

    public Diem getDiemTrenTrai() {
        return diemTrenTrai;
    }

    public void setDiemTrenTrai(Diem diemTrenTrai) {
        this.diemTrenTrai = diemTrenTrai;
    }

    public Diem getDiemDuoiPhai() {
        return diemDuoiPhai;
    }

    public void setDiemDuoiPhai(Diem diemDuoiPhai) {
        this.diemDuoiPhai = diemDuoiPhai;
    }
}
