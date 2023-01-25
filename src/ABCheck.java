// 첫글자가 a,A이고, 첫글자에서 5칸 뒤의 글자가 b,B || 첫글자가 b,B이고, 첫글자에서 5칸 뒤의 글자가 a,A 라면 true
public class ABCheck {
    public static void main(String[] args) {
        boolean output = Solution3.ABCheck("lane Borrowed");
        System.out.println(output);
    }
}

class Solution3 {
    public static boolean ABCheck(String str) {
        //예외는 false 반환
        if (str.length() == 0) return false;

        str = str.toLowerCase();

        for (int i = 4; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' && str.charAt(i-4) == 'b') || (str.charAt(i) == 'b'&& str.charAt(i-4) == 'a')) return true;
        }
        return false;
    }
}