package Diem_toaDo;

import static java.lang.Math.round;

public class tamGiac {
    private Diem_toaDo A;
    private Diem_toaDo B;
    private Diem_toaDo C;

    public tamGiac(Diem_toaDo a, Diem_toaDo b, Diem_toaDo c){
        A = a;
        B = b;
        C = c;
    }

    public double[] getLine(){
        Diem_toaDo a = A;
        Diem_toaDo b = B;
        Diem_toaDo c = C;
        duongThang ab = new duongThang(a,b);
        duongThang bc = new duongThang(b,c);
        duongThang ac = new duongThang(a,c);

        return new double[] {ab.doDai_duongThang(), bc.doDai_duongThang(), ac.doDai_duongThang()};
    }

    public void timDuongThang_daiNhat(){
        double[] temp1;
        temp1 = this.getLine();
        double max = temp1[0];
        for(int i = 1;i < temp1.length;i++){
            if(max < temp1[i]){
                max = temp1[i];
            }
        }

        System.out.println("Duong thang dai nhat co do dai la " + max);
    }

    public double chuVi(){
        return (this.getLine()[0] + this.getLine()[1] + this.getLine()[2]);
    }
}
