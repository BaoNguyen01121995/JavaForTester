package Diem_toaDo;

public class Main {
    public static void main(String[] args){
        Diem_toaDo a = new Diem_toaDo(2,3);
        Diem_toaDo b = new Diem_toaDo(5,1);
        Diem_toaDo c = new Diem_toaDo(0,0);
        tamGiac tg = new tamGiac(a,b,c);
        tg.timDuongThang_daiNhat();
        System.out.print("Chu vi cua tam giac ABC la " + tg.chuVi());
    }
}
