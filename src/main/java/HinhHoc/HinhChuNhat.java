package HinhHoc;
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
        return getChieuDai() * getChieuRong();
    }

    public double chuViHCN(){
        return (getChieuDai() + getChieuRong()) * 2;
    }

    public double getChieuRong(){
        return this.diemDuoiPhai.getHoanhDo() - this.diemTrenTrai.getHoanhDo();
    }

    public double getChieuDai(){
        return this.diemTrenTrai.getTungDo() - this.diemDuoiPhai.getTungDo();
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
