import java.util.*;
public class longestSeqword {
    private int count;
    private String str;
    public String solution(String S, String [] D) {
       Map<String, Integer> map = new HashMap<>();
      for (int i = 0; i < D.length; i++) {
        if (isSubsequence(D[i], S)) {
            map.put(D[i], i);
        }

    }
    String maxKey = Collections.max(map.keySet());


    return maxKey;
}
public boolean isSubsequence(String s, String t) {
    if(s.length()==0)
        return true;

    int i=0, j = 0;
    while(i < s.length() && j < t.length()) {
        if(s.charAt(i)== t.charAt(j)){
            i++;
        }

        j++;

        if(i == s.length())
            return true;
    }

    return false;
}
    public static void main(String [] args) {
        String S = "abpppleee";
        String [] D = {"able", "ale", "apple", "kangaroo"};
        longestSeqword obj = new longestSeqword();
        System.out.println(obj.solution(S, D));

}
}