package th1.congan;

public class CongAn {

    private String maSo;
    private String hoTen;
    private String capBac;

    public CongAn() {
    }

    public CongAn(String maSo, String hoTen, String capBac) {
        if (kiemTraThongTin(maSo, hoTen, capBac)) {
            this.maSo = maSo;
            this.hoTen = hoTen;
            this.capBac = capBac;
        } else {
            System.out.println("Thong tin cong an khong hop le!");
        }
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        if (maSo != null && !maSo.trim().isEmpty()) {
            this.maSo = maSo;
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if (hoTen != null && !hoTen.trim().isEmpty()) {
            this.hoTen = hoTen;
        }
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        if (capBac != null && !capBac.trim().isEmpty()) {
            this.capBac = capBac;
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma so: " + maSo);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Cap bac: " + capBac);
    }

    private boolean kiemTraThongTin(String maSo, String hoTen, String capBac) {
        if (maSo == null || maSo.trim().isEmpty()
                || hoTen == null || hoTen.trim().isEmpty()
                || capBac == null || capBac.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}