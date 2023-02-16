import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String longestPalindromeSubstring = "";
        
        System.out.print("Write the phrase: ");
        String input = sc.nextLine();

        for(int first = 0; first < Math.round(input.length()); first++) {
            int firstIndex = input.indexOf(input.charAt(first), first);

            for(int next = first + 1; next < input.length(); next++) {
                int nextIndex  = input.indexOf(input.charAt(first), next);

                if(firstIndex != nextIndex && nextIndex >= 0) {//se entrar: tem letra repetida
                    String maybePalidromeString = input.substring(firstIndex, nextIndex + 1);
                    sb.append(maybePalidromeString);

                    if(maybePalidromeString.compareTo(sb.reverse().toString()) == 0) {
                        if(maybePalidromeString.length() > longestPalindromeSubstring.length()) {
                            longestPalindromeSubstring = maybePalidromeString;
                        }
                    }
                    next = nextIndex;
                    sb.delete(0, maybePalidromeString.length());
                }
            }
            first = firstIndex;
        }

        if(longestPalindromeSubstring.length() == 0) {
            System.out.println(String.valueOf(input.charAt(0)));
        } else {
            System.out.println(longestPalindromeSubstring + ": is the longest palidrome string.");
        }

        sc.close();
    }
}