import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a String: ");
            strings[i] = sc.nextLine();
        }

        String concatenation = concat(strings);
        System.out.println("Concatenation of strings in array is: " + concatenation);

        int[] occurences = countOccurences(concatenation);
        for (int i = 0; i < occurences.length; i++) {
            System.out.println((char) (i + 'a') + " appeared " + occurences[i] + " times.");
        }
        sc.close();
    }

    public static String concat(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    public static int[] countOccurences(String str) {
        str = str.toLowerCase();
        int[] count = new int[26];

        for (char c : str.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }
}