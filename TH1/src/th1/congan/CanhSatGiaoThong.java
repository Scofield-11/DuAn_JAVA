package th1.congan;

public class CanhSatGiaoThong extends CongAn {

    private String khuVucTuanTra;
    private int soBienBanXuPhat;

    public CanhSatGiaoThong() {
        super();
    }

    public CanhSatGiaoThong(String maSo, String hoTen, String capBac,
                            String khuVucTuanTra, int soBienBanXuPhat) {
        super(maSo, hoTen, capBac);
        this.khuVucTuanTra = khuVucTuanTra;
        setSoBienBanXuPhat(soBienBanXuPhat);
    }

    public String getKhuVucTuanTra() {
        return khuVucTuanTra;
    }

    public void setKhuVucTuanTra(String khuVucTuanTra) {
        this.khuVucTuanTra = khuVucTuanTra;
    }

    public int getSoBienBanXuPhat() {
        return soBienBanXuPhat;
    }

    public void setSoBienBanXuPhat(int soBienBanXuPhat) {
        if (soBienBanXuPhat >= 0) {
            this.soBienBanXuPhat = soBienBanXuPhat;
        }
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== CANH SAT GIAO THONG ===");
        super.hienThiThongTin();
        System.out.println("Khu vuc tuan tra: " + khuVucTuanTra);
        System.out.println("So bien ban xu phat: " + soBienBanXuPhat);
    }
}