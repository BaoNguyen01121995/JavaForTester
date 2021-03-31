public class soNguyenTo {
    public static void kiemTraNguyenTo(int n){
        if(n < 2){
            System.out.print(n + " khong la so nguyen to");
        }
        else{
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.print(n + " khong la so nguyen to");
                    break;
                }
            }
        }
        System.out.print(n + " la so nguyen to");
    }
    public static void main(String[] args){
        kiemTraNguyenTo(11);
    }
}
