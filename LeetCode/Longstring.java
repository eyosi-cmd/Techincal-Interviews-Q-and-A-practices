import java.util.*;
public class Longstring {


    public int Substring(String s) {
                int count = 1;
                ArrayList<String> st = new ArrayList<String>();
                Map<Integer, String> map = new HashMap<>();
                char [] c = s.toCharArray();
                String ch = null;
                for (int i = 0; i < s.length(); i++) {
                    ch = Character.toString(c[i]);
                        if (i == 0) {
                            map.put(i, ch);
                            st.add(ch);
                        }
                        else {
                            if (!map.containsValue(ch)) {
                                count++;
                                st.add(ch);

                            }
                             map.put(i, ch);

                        }
                }
                for (String ans: st)
                    System.out.print(ans);


            return count;
        }
    public static void main(String [] args) {
        String s =  "abcabcbb";
        Longstring st = new Longstring();
        System.out.println("\n" + st.Substring(s));

    }
}