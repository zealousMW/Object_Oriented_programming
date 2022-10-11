public class ShaPalindromeString{
    public static void main(String[] args) {
      String str = "malayalam";
      String rev = " ";
      for (int i = str.length() - 1; i >= 0; i--) {
        rev = rev + str.charAt(i);
        System.out.println(str + " is " + (str.equals(rev) ? " " : "Not" + " a Palindrome"));
  
      }
    }