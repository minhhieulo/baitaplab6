
package cau2;


public class LopChuyenToan extends HocSinh{
    public LopChuyenToan() {
    }
    @Override
    public double AVG(){
      return 4/(super.getHoa()+super.getLy()+super.getToan()*2);
    }
}      


