public class sort_giamDan {
    public static void sapXepGiamDan(int[] a,int n){
        for(int i = 0;i < n;i++)
            for(int j = i + 1;j < n;j++){
                if(a[i] < a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }

        for (int i = 0;i < n;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] a = {1,2,6,8,111,0,9,22,3};
        sapXepGiamDan(a,9);
    }
}
