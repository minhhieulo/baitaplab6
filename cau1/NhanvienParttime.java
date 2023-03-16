
package cau1;


public class NhanvienParttime extends NhanVien {
    private int Giolamviec;
    public NhanvienParttime(){
        
    }

    public int getGiolamviec() {
        return Giolamviec;
    }

    public void setGiolamviec(int Giolamviec) {
        this.Giolamviec = Giolamviec;
    }

    public NhanvienParttime(int Giolamviec, String ten) {
        super();
    }
    @Override
    public String loaiNhanVien(){ 
        return"loaiNhanVien";
        
    }
    @Override
    public void tinhLuong(){
        System.out.println("Luon cua nhan vien Parttime la 30k/1h");
    }
}
