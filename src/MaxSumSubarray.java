public class MaxSumSubarray {
    //Kadane's algorithm
    public static void solve(int []a,int n){
        int max_so_far = Integer.MIN_VALUE;
        int end = 0, start = 0, sum = 0, max_ending_here = 0;
        for(int i = 0;i < n;i++){
            max_ending_here += a[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
                start = sum;
                end = i;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
                sum = i + 1;
            }
        }

        for(int i = start;i < end;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args){
        int []a = {1,-2,23,22,11,0,-11,-23};
        solve(a,8);
    }
}
