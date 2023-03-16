
package cau2;

import java.util.Scanner;


public class HocSinh {
    public String Hoten,lop;
    public float toan , ly ,hoa ;

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    
    public double AVG(){
        return((this.getHoa()+ this.getLy()+this.getToan())/3);
    }
    public void nhapvao(){
        System.out.println("Nhap vao ho ten: ");
        Scanner scanner = new Scanner(System.in);
        Hoten= scanner.nextLine();
        System.out.println("Nhap vao lop: ");
        lop=scanner.nextLine();
        System.out.println("NHap vao diem mon toan: ");
        toan= scanner.nextFloat();
        System.out.println("Nhap vao dien mon ly: ");
        ly= scanner.nextFloat();
        System.out.println("Nhap vao diem mon hoa: ");
        hoa= scanner.nextFloat();
    }
    public void xuat(){
        System.out.println("Ho ten"+this.getHoten()+"lop:"+this.getLop()+"toan"+this.getToan()+"ly"+this.getLy()+"hoa"+this.getHoa());
    }
}
