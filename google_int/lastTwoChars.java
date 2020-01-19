import java.util.*;
public class lastTwoChars {
public int last2(String str) {
  String temp;
  int n = str.length();
  int count = 0;
  String result = "";
  int  j = 0;
  if (n >= 2)
    temp = str.substring(str.length() - 2);
  else
    temp = null;

  for (int i = 0; i < str.length() - 2; i++) {
    if (str.length() == 1 && str.length() == 0)
          return 0;
    if (temp.charAt(j) == str.charAt(i) &&
    temp.charAt(j + 1) == str.charAt(i + 1)) {
      count++;
    }


  }

  return count;
}

    public static void main(String [] args) {
        String [] S = {"hixxhi", "xaxxaxaxx", "axxxaaxx",
                "xxaxxaxxaxx", "xaxaxaxx",  "xxxx", "13121312",
                "11212", "13121311", "1717171", "hi", "h"};
        lastTwoChars obj = new lastTwoChars();
        for (String s: S) {
            int num = obj.last2(s);
        System.out.printf("\"%-5s\" \t %d%n", s, num);
        }

}
}