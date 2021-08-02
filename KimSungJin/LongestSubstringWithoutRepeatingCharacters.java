import java.util.*;

class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        lengthOfLongestSubstring("apple");
        lengthOfLongestSubstring2("apple");
    }

    public static int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int j = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(i + "의 c:" + c);

            while (set.contains(c)) {
                System.out.println(">>>  while 안에서 set 상태 확인 : " + set.toString());
                set.remove(s.charAt(j));
                j++;
            }

            set.add(c);
            System.out.println(">>> set 상태 확인 : " + set.toString());
            answer = Math.max(set.size(), answer);
            System.out.println(">>>>> answer = " + answer);
        }

        return answer;

    }

    public static int lengthOfLongestSubstring2(String s) {
        Set set = new HashSet<>();
        int n = s.length();
        int begin = 0, end = 0;
        int ans = 0;

        while (end < n) {

            System.out.println("s.charAt(end) = " + s.charAt(end));

            if (set.contains(s.charAt(end))) {

                System.out.println("in if before remove item : set.toString() = " + set.toString());

                set.remove(s.charAt(begin++));

                System.out.println("in if after remove item : set.toString() = " + set.toString());

            } else {
                System.out.println("else end value => " + end);
                System.out.println("in else before add item : set.toString() = " + set.toString());

                set.add(s.charAt(end++));

                System.out.println("else after end++ value => " + end);
                System.out.println("in else after add item : set.toString() = " + set.toString() + "\n");

                ans = Math.max(ans, end - begin);
            }
        }
        return ans;
    }
}