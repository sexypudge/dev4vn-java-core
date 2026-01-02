package Lab7;

    public class SinhVienIt extends SinhVien{
    double diemToan;
    double diemVan;
    public SinhVienIt(String hoTen, String nganh, double diemToan, double diemVan) {
        super(hoTen, nganh);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    @Override
    public double getDiem() {
        return (diemToan+diemVan)/2;
    }
}
