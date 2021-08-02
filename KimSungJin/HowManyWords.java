import java.util.Scanner;

public class HowManyWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        if (sentence.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(sentence.split(" ").length);
        }
        sc.close();
    }
}