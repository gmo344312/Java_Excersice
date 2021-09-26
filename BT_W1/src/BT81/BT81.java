
package BT81;

public class BT81 {
    private String ma;
    private String ten,lop;
    private double diem1,diem2;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }
    
    public double tb()
    {
       return(diem1+diem2)/2;
    }
    public String kq()
    {
        if(((diem1+diem2)/2)>=5)
        {
            return "Đậu";
        }
        else
            return "Rớt";
    }

    @Override
    public String toString() {
        return "khoailangnuong{" + "ma=" + ma + '}';
    }
    
}
