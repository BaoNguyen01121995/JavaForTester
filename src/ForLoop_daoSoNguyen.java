public class ForLoop_daoSoNguyen {
    public static void main(String[] args){
        int n = 12345;
        String str= String.valueOf(n);
        StringBuilder str_temp = new StringBuilder();
        for(int i = 0;i < str.length(); i++){
            str_temp.append(str.charAt(str.length() - 1 - i));
        }
        int number = Integer.parseInt(str_temp.toString());
        System.out.print(number);
    }
}
