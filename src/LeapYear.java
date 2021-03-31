public class LeapYear {
    public static boolean LeapYear_check(int year){
        boolean flag = false;
        if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 ==0))){
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args){
        int year = 2020;
        if(LeapYear_check(year)){
            System.out.print(year + " la nam nhuan");
        }else{
            System.out.print(year + " khong la nam nhuan");
        }
    }
}
