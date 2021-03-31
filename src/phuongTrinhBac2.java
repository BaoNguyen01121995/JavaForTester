public class phuongTrinhBac2 {
    private static double a;
    private static double b;
    private static double c;

    public static double delta(double a, double b, double c){
        return Math.sqrt(Math.pow(b,2.0) - 4.0 * a*c);
    }
    public static void solve(double a, double b, double c){
        if(a == 0){
            double x = (-c)/b;
            System.out.println("x = " + x);
        }else{
            if(delta(a,b,c) < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if(delta(a,b,c) == 0){
                double x0 = (-b)/(2 * a);
                System.out.println("x = " + x0);
            }else{
                double x1 = (-b + delta(a,b,c))/(2*a);
                double x2 = (-b - delta(a,b,c))/(2*a);
                System.out.println("x1 = " + x1 + ", " + "x2 = " + x2);
            }
        }
    }

    public static void main(String[] args){
        solve(0,-2,-5);
    }
}
