package demo;

public class Palindrome {

    /**
     * @param input
     * @return
     */
    public String isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            char leftChar = Character.toLowerCase(input.charAt(left));
            char rightChar = Character.toLowerCase(input.charAt(right));
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (leftChar != rightChar) {
                    return "false";
                }
                left++;
                right--;
            }
        }
        return "true";
    }

}
