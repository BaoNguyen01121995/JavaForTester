public class tamGiac {
    public static void tamGiac(int n){
        int m = 0;
        do{
            for (int i = 0;i <= m;i++)
                System.out.print(i + " ");
            System.out.print("\n");
            m++;
        }while (m <= n);
    }
    public static void main(String[] args){
        tamGiac(8);
    }
}
