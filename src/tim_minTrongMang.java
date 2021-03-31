public class tim_minTrongMang {
    public static int min_array(int[]a, int n){
        int min = a[0];
        for (int i = 1;i < n;i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[]a = {2,5,6,7,8,10,22};
        System.out.print("Phan tu max la "+min_array(a,7));
    }
}
