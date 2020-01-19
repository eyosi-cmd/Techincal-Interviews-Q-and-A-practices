import java.util.*;
public class removeString {
public String withoutString(String base, String remove) {
  String caseInSensitive = "(?i)";
caseInSensitive = caseInSensitive.concat(remove);
    if (remove.isEmpty())
      return "";
   base = base.replaceAll(caseInSensitive, "");
   return base;
}

    public static void main(String [] args) {
        String base = "This is a FISH";
        String remove = "IS";
        removeString  obj = new removeString();
        System.out.println(obj.withoutString(base, remove));

}
}