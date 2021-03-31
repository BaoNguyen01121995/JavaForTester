public class palindrome {
    public static boolean charactersEqualIgnoringCase(char c1, char c2) {
        if (c1 == c2) return true;
        char u1 = Character.toUpperCase(c1);
        char u2 = Character.toUpperCase(c2);
        if (u1 == u2) return true;
        return Character.toLowerCase(u1) == Character.toLowerCase(u2);
    }
    public static boolean Palindrome_check(String str){
        boolean flag = true;
        for (int i = 0;i < str.length()/2;i++){
            if(!charactersEqualIgnoringCase(str.charAt(i),str.charAt(str.length() - 1 - i))){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        if(Palindrome_check("cAbBAc")){
            System.out.print("Chuoi doi xung");
        }else{
            System.out.print("Chuoi khong doi xung");
        }
    }
}
