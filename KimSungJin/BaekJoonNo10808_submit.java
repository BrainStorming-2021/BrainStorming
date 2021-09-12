import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoonNo10808_submit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] answer = new int[26];
        ArrayList<Character> abc = new ArrayList<>();
        int asci = 97;
        for (int i = 0; i < 26; i++) {
            char abcChar = (char) asci;
            abc.add(abcChar);
            asci++;
        }
        System.out.println("abc : " + abc);

        String word = sc.nextLine();
        String[] wordList = word.split("");
        for (int i = 0; i < wordList.length; i++) {
            Character temp = wordList[i].charAt(0);
            if (abc.contains(temp)) {
                answer[abc.indexOf(temp)]++;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println("answer : " + answer[i]);
        }
        sc.close();
    }
}
