package Diem_toaDo;

import java.util.Scanner;

public class Diem_toaDo {
    private int x;
    private int y;

    public Diem_toaDo(int X,int Y){
        int tempX, tempY;
        Scanner sc = new Scanner(System.in);
        if(X > 2000 || X < -2000){
            System.out.print("Nhap X: ");
            x = sc.nextInt();
        }else{
            x = X;
        }
        if(Y > 2000 || Y < -2000){
            System.out.print("Nhap Y: ");
            y = sc.nextInt();
        }else{
            y = Y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
