public class StringSplosion {
public String stringSplosion(String str) {
  String str1 = "";
  String temp = "";
  for (int i = 0; i < str.length(); i++) {
    for (int j = 0; j <= i; j++) {

        str1 = temp + str.substring(0, j + 1);
    }
    temp = str1;
}
  return str1;
}
  public static void main(String [] args) {
        String S = "abc";

        StringSplosion obj = new StringSplosion();
        System.out.println(obj.stringSplosion(S));

}
}
