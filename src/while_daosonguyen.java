public class while_daosonguyen {
    public static void main(String[] args){
        int n = 12345;
        String str= String.valueOf(n);
        StringBuilder str_temp = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            str_temp.append(str.charAt(str.length() - 1 - i));
            i++;
        }
        int number = Integer.parseInt(str_temp.toString());
        System.out.print(number);
    }
}
