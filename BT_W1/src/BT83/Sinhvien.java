
package BT83;


public class Sinhvien {
    private String ma;
    private String ten;
    private String gt;

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
    public String getGt() {
        return gt;
    }
    public void setGt(String gt) {
        this.gt = gt;
    }
    @Override
    public String toString()
    {
        return ma+"-"+ten+"-"+gt;
    }
}
