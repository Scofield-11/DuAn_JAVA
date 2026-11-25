package th1.congan;

public class CanhSatHinhSu extends CongAn {

    private String chuyenAnPhuTrach;
    private int soVuDaPha;

    public CanhSatHinhSu() {
        super();
    }

    public CanhSatHinhSu(String maSo, String hoTen, String capBac,
                         String chuyenAnPhuTrach, int soVuDaPha) {
        super(maSo, hoTen, capBac);
        this.chuyenAnPhuTrach = chuyenAnPhuTrach;
        setSoVuDaPha(soVuDaPha);
    }

    public String getChuyenAnPhuTrach() {
        return chuyenAnPhuTrach;
    }

    public void setChuyenAnPhuTrach(String chuyenAnPhuTrach) {
        this.chuyenAnPhuTrach = chuyenAnPhuTrach;
    }

    public int getSoVuDaPha() {
        return soVuDaPha;
    }

    public void setSoVuDaPha(int soVuDaPha) {
        if (soVuDaPha >= 0) {
            this.soVuDaPha = soVuDaPha;
        }
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== CANH SAT HINH SU ===");
        super.hienThiThongTin();
        System.out.println("Chuyen an phu trach: " + chuyenAnPhuTrach);
        System.out.println("So vu da pha: " + soVuDaPha);
    }
}