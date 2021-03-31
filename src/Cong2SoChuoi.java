public class Cong2SoChuoi {
    public static String xuLyChuoiSo(String str){
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                temp.append(str.charAt(i));
            }
        }
        return temp.toString();
    }
    public static void main(String[] args){
        String str1 = "ABDD123EE";
        String str2 = "12DASF445";
        str1 = xuLyChuoiSo(str1);
        str2 = xuLyChuoiSo(str2);
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = a + b;
        System.out.print(c);

    }
}
