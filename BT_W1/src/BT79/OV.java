package BT79;

public class OV {
    private String maNV;
    private String phanXuong;
    private int soSP;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getPhanXuong() {
        return phanXuong;
    }

    public void setPhanXuong(String phanXuong) {
        this.phanXuong = phanXuong;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    @Override
    public String toString() {
        return "Hausotphomai{" + "maNV=" + maNV + ", soSP=" + soSP + '}';
    }
    
    
}
