package lab6.act3;

public class SinhVien {
    private String hoTen;
    private String email;
    private String sdt;
    private String cmnd;

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return this.cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public void xuat() {
        System.out.println("ho va ten: " + hoTen);
        System.out.println("ho va ten: " + email);
        System.out.println("ho va ten: " + sdt);
        System.out.println("ho va ten: " + cmnd);
    }

}
