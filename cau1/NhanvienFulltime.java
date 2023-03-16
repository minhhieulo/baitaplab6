
package cau1;
public class NhanvienFulltime extends NhanVien {
    private int loaichucvu;
    private int ngaylamthem;
    public NhanvienFulltime(){
        
    }
    public NhanvienFulltime(int loaichucvu, int ngaylamthem, String ten) {
       super();
    }
    public int getLoaichucvu() {
        return loaichucvu;
    }

    public void setLoaichucvu(int loaichucvu) {
        this.loaichucvu = loaichucvu;
    }

    public int getNgaylamthem() {
        return ngaylamthem;
    }

    public void setNgaylamthem(int ngaylamthem) {
        this.ngaylamthem = ngaylamthem;
    }

    @Override
    public String loaiNhanVien(){
        return "loaiNhanVien";       
    }
    @Override
    public void tinhLuong(){
        System.out.println("Luong cua nhan vien fulltime la 30tr/1 thang");
    }
}
