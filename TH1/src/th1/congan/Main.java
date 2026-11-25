package th1.congan;

public class Main {
    public static void main(String[] args) {
        CanhSatGiaoThong csgt = new CanhSatGiaoThong(
                "CSGT01", "Nguyen Van An", "Dai uy", "Quan Cau Giay", 25
        );

        CanhSatHinhSu cshs = new CanhSatHinhSu();
        cshs.setMaSo("CSHS02");
        cshs.setHoTen("Tran Minh Duc");
        cshs.setCapBac("Thieu ta");
        cshs.setChuyenAnPhuTrach("Phong chong toi pham cong nghe cao");
        cshs.setSoVuDaPha(12);

        csgt.hienThiThongTin();
        System.out.println();
        cshs.hienThiThongTin();
    }
}