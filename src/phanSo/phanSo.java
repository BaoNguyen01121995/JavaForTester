package phanSo;

import java.util.Scanner;

public class phanSo {
    private int tu, mau;
    public phanSo(){
    }

    public phanSo(int Tu,int Mau){
        Scanner sc = new Scanner(System.in);
        if(Mau == 0){
            System.err.println("Nhap mau khong dung ! Mau so phai khac 0");
            do {
                System.out.println("Moi ban nhap lai mau: ");
                this.mau = sc.nextInt();
                if(this.mau == 0){
                    System.err.println("Nhap mau khong dung ! Mau so phai khac 0");
                }
            } while (this.mau == 0);
        }else{
            this.mau = Mau;
        }
        this.tu = Tu;
        int gcn = timUCLN(this.tu,this.mau);
        this.tu = this.tu/ gcn;
        this.mau = this.mau/ gcn;
    }

    public int timUCLN(int Tu, int Mau){
        if(Tu == 0)
            return Tu;
        if(Mau == 0)
            return Mau;
        if(Tu == Mau)
            return Tu;
        if(Tu > Mau)
            return timUCLN(Tu - Mau, Mau);
        return timUCLN(Tu, Mau - Tu);
    }

    public phanSo cong2phanSo(phanSo b){
        phanSo ps = new phanSo();
        ps.tu = (this.tu * b.mau) + (this.mau * b.tu);
        ps.mau = this.mau * b.mau;
        int gcn = ps.timUCLN(ps.tu, ps.mau);
        ps.tu = ps.tu / gcn;
        ps.mau = ps.mau / gcn;
        return ps;
    }

    public void getPhanSo(){
        System.out.print(this.tu + "/" + this.mau + "\n");
    }

    public int soSanh2phanSo(phanSo b){
        int flag = -1;
        double cal_a_tu = 1.00 * this.tu;
        double cal_a_mau = 1.00 * this.mau;
        double cal_a = cal_a_tu/cal_a_mau;
        double cal_b_tu = 1.00 * b.tu;
        double cal_b_mau = 1.00 * b.mau;
        double cal_b = cal_b_tu/cal_b_mau;
        if(cal_a == cal_b){
            flag = 0;
        }else if(cal_a > cal_b){
            flag = 1;
        }
        return flag;
    }

    public phanSo max_3phanSo(phanSo a, phanSo b){
        if(a.soSanh2phanSo(b) == 0){
            if(this.soSanh2phanSo(a) == 1)
                return this;
            else
                return a;
        }else if(a.soSanh2phanSo(b) == 1){
            if(this.soSanh2phanSo(a) == 0)
                return this;
            else if(this.soSanh2phanSo(a) == -1)
                return a;
            else
                return this;
        }else{
            if(this.soSanh2phanSo(b) == 0)
                return this;
            else if(this.soSanh2phanSo(b) == -1)
                return b;
            else
                return this;
        }
    }
}
