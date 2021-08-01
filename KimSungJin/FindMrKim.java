import java.util.Arrays;

public class FindMrKim {
    public static void main(String[] args) {
        String[] seoul = { "J", "j", "Kim", "Park", "Lee" };
        solution(seoul);
        solution_ex(seoul);
    }

    public static String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        System.out.println("soulution answer : " + answer);
        return answer;
    }

    public static String solution_ex(String[] seoul) {
        // x에 김서방 위치 저장
        int x = Arrays.asList(seoul).indexOf("Kim");

        System.out.println("solution_ex : " + "김서방은 " + x + "에 있다");

        return "김서방은 " + x + "에 있다";
    }

}