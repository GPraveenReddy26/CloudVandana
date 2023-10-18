import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramorNot {
    public static boolean isPangram(String input) {
            Set<Character> characterSet = new HashSet<>();
            input = input.toLowerCase();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isLetter(ch)) {
                    characterSet.add(ch);
                }
            }

            return characterSet.size() == 26;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String input = scanner.nextLine();

            if (isPangram(input)) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }

            scanner.close();
        }
    }


