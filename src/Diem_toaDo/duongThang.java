package Diem_toaDo;

public class duongThang {
    Diem_toaDo A;
    Diem_toaDo B;

    public duongThang(Diem_toaDo a,Diem_toaDo b){
        A = a;
        B = b;
    }

    public double doDai_duongThang(){
        double temp = Math.pow((B.getX() - A.getX()),2) + Math.pow((B.getY() - A.getY()),2);
        return Math.sqrt(temp);
    }
}
