package phanSo;

public class Main {
    public static void main(String[] args){
        phanSo a = new phanSo(8,20);
        phanSo b = new phanSo(5,6);
        phanSo c = new phanSo(9,16);
        phanSo sum2fractions = a.cong2phanSo(b);
        sum2fractions.getPhanSo();
        phanSo max = a.max_3phanSo(b,c);
        max.getPhanSo();
    }
}
