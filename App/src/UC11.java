class PalindromeChecker {

    public boolean checkPalindrome(String input) {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UC11 {

    public static void main(String[] args) {
        String input = "Never Odd Or Even";

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Input String : " + input);

        if (result) {
            System.out.println("Result : The string is a Palindrome");
        } else {
            System.out.println("Result : The string is NOT a Palindrome");
        }
    }
}