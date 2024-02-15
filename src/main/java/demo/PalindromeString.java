package demo;

public class PalindromeString {
    // String s="A man, a plan, a canal: Panama";
    public String isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();
        char ch;

        if (s.equals(null) || s.length() > 1000) {
            return "false";
        } else {
            String s2 = s.toLowerCase();
            // System.out.println(s2);
            for (int i = 0; i < s2.length(); i++) {
                ch = s2.charAt(i);
                if ((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122)) {
                    s1.append(ch);
                    // System.out.println(s1);
                }
            }
            if (s1.toString().equals(s1.reverse().toString())) {
                return "true";
            } else {
                return "false";
            }
        }

    }

    static
     {
        System.out.println(" hi from Static block");
     }


  {
    System.out.println("hi this is default block");
  }



}
