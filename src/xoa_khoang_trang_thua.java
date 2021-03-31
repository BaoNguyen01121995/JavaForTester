public class xoa_khoang_trang_thua {
    public static String solve(String str){
        return str.replaceAll("\\s\\s+"," ").trim();
    }

    public static void main(String[] args){
        String str = "             Lập Trình     Không    Khó                ";
        System.out.print(solve(str));
    }
}
