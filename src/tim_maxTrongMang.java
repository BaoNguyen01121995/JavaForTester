public class tim_maxTrongMang {
    public static int max_array(int[]a, int n){
        int max = a[0];
        for (int i = 1;i < n;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[]a = {2,5,6,7,8,10,22};
        System.out.print("Phan tu max la "+max_array(a,7));
    }
}
