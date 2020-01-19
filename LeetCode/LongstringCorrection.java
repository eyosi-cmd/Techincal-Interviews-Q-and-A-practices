import java.util.*;
public class LongstringCorrection {


    public int Substring(String s) {
int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
        }
    public static void main(String [] args) {
        String s =  "abcabcbb";
        Longstring st = new Longstring();
        System.out.println("\n" + st.Substring(s));

    }
}