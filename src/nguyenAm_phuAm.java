public class nguyenAm_phuAm {
    public static void checkPhuAm_nguyenAm(char a){
        if((a >= 65 && a <= 90) || (a >= 97 && a <= 122)){
            if(a == 'e' || a == 'u' || a == 'o' || a == 'a' || a == 'i' || a == 'E' || a == 'U' || a == 'O' || a == 'A' || a == 'I'){
                System.out.print(a + " la nguyen am");
            }else
            {
                System.out.print(a + " la phu am");
            }
        }
    }
    public static void main(String[] args){
        checkPhuAm_nguyenAm('e');
    }
}
