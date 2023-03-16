
package cau2;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HocSinh Hc = new HocSinh();
        LopChuyenToan Lct =new LopChuyenToan();
      int diem = scanner.nextInt();
        switch (diem) {
            case 1:
                Hc.nhapvao();
                Hc.xuat();
                break;
            case 2:
                Lct.nhapvao();
                Lct.xuat();
            default:
        }
    }
    

}
