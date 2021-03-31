package SinhVien;

import java.text.DecimalFormat;

public class SinhVien {
    private final String MSV = "JAK-" + (10 + (int) (Math.random() * 100));
    private String hoTen;
    private double toan;
    private double ly;
    private double hoa;
    private boolean gioiTinh;

    public void setHoTen(String HoTen){
        hoTen = HoTen;
    }
    public void setGioiTinh(boolean GioiTinh){
        gioiTinh = GioiTinh;
    }
    public double rand(int max,int min){
        double random_double = Math.random() * (max - min + 1) + min;
        return random_double;
    }
    public void setToan(double Toan){
        if(Toan < 0 || Toan > 10){
            System.err.print("Diem toan nhap chua dung, nhap lai va gia tri chi tu 0 toi 10");
        }else{
            toan = Toan;
        }
    }
    public void setLy(double Ly){
        if(Ly < 0 || Ly > 10){
            System.err.print("Diem ly nhap chua dung, nhap lai va gia tri chi tu 0 toi 10");
        }else{
            ly = Ly;
        }
    }

    public void setHoa(double Hoa){
        if(Hoa < 0 || Hoa > 10){
            System.err.print("Diem hoa nhap chua dung, nhap lai va gia tri chi tu 0 toi 10");
        }else{
            hoa = Hoa;
        }
    }
    public double tinhDTB(double Toan,double Ly,double Hoa){
        return (Toan*3 + Ly*2 + Hoa)/6;
    }

    public SinhVien(String HoTen, boolean GioiTinh, double Toan, double Ly, double Hoa){
        this.hoTen = HoTen;
        this.gioiTinh = GioiTinh;
        if((Toan < 0 || Toan > 10) && (Ly < 0 || Ly > 10) && (Hoa < 0 || Hoa > 10)){
            System.err.print("Diem Toan, Ly, Hoa nhap chua dung, moi diem chi duoc nhap tu 0-10");
        }else{
            this.toan = Toan;
            this.ly = Ly;
            this.hoa = hoa;
        }
    }

    public SinhVien(String HoTen, boolean GioiTinh){
        this.hoTen = HoTen;
        this.gioiTinh = GioiTinh;
        this.toan = rand(10,0);
        this.ly = rand(10,0);
        this.hoa = rand(10,0);
        DecimalFormat f = new DecimalFormat("#.00");
        f.format(this.toan);
        f.format(this.ly);
        f.format(this.hoa);
    }

    public void XuatThongTin(){
        System.out.println("MSV: " + this.MSV);
        System.out.println("Ho va ten: " + this.hoTen);
        System.out.println("Diem Toan: " + this.toan);
        System.out.println("Diem Ly: "+this.ly);
        System.out.println("Diem Hoa: "+this.hoa);
        if(this.gioiTinh){
            System.out.println("Gioi tinh: nam");
        }else{
            System.out.println("Gioi tinh: nu");
        }
        System.out.println("Diem trung binh: "+tinhDTB(this.toan,this.ly,this.hoa));
    }
}
