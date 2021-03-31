import java.util.ArrayList;

public class cong_so_vao_mang {
    public static ArrayList<Integer> solve(ArrayList<Integer> list, int num){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0;i < list.size();i++){
            sum += list.get(i) * Math.pow(10,list.size() - 1 - i);
        }
        sum += num;
        int k;
        do{
            k = sum % 10;
            temp.add(k);
            sum /= 10;
        }while(sum > 0);
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        for (int i = 0;i<temp.size();i++) {
            temp2.add(temp.get(temp.size()-1-i));
        }
        return temp2;
    }


    public static void xuat(ArrayList<Integer> list){
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        ArrayList<Integer> list2 = solve(list,1);
        xuat(list2);
    }
}
