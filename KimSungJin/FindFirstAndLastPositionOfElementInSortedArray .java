import java.util.ArrayList;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 30, 30, 30, 40, 50, 50, 50, 50};
        // int[] nums = {};
        int target = 30;
        searchRange(nums, target);
        searchRange2(nums, target);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];

        ArrayList<Integer> numsList = new ArrayList<>(); //-> int[] to ArrayList<Integer>
        for(int num : nums) {
            numsList.add(num);
        }

        answer[0] = numsList.indexOf(target); //-> index == 1 부터 target 값과 동일한 index 찾기
        answer[1] = numsList.lastIndexOf(target); //-> index == list.length 부터 target 값과 동일한 index 찾기

        System.out.println("answer : " + answer[0]+" "+answer[1]);
        return answer;
    }

    public static int[] searchRange2(int[] nums, int target) {
        int [] result = new int[]{-1,-1};
        int i=0, j = nums.length-1; //-> i : nums 의 첫 index, j : nums 의 마지막 index
        
        //nums 에 값이 없을 때는 모든 while 문을 지나서 바로 result[-1, -1] 를 반환한다.

        //배열의 중간값 기준 앞쪽 배열 탐색
        while(i <= j)
        {
            int mid = (i+j)/2; //-> nums 의 중간 index
            
            System.out.println("mid 1 : " + mid);

            if(target < nums[mid]) //-> target 이 mid 값 보다 작을 경우
                j = mid -1; //-> mid-1 을 마지막 인덱스로 변경
            else if(target > nums[mid]) //-> target 이 mid 값 보다 클 경우
                i = mid + 1; //-> mid+1 을 시작 인덱스로 변경
            else
            {
                if(mid == 0 || nums[mid] != nums[mid-1]) //-> nums 에 값이 1개 일 때, nums의 중간 값과 중간 값 바로 이전 값이 같지 않을 때,
                {
                    result[0] = mid;
                    break;
                }   
                else 
                    j = mid -1; //-> 마지막 인덱스를 줄여가면서 target 의 첫 번째 값 탐색
            }
            
        }
        
        i =0;
        j = nums.length-1;

        //배열의 중간값 기준 뒷쪽 배열 탐색 (이전 while 문과 논리 동일)
         while(i <= j)
        {
            int mid = (i+j)/2;

            System.out.println("mid 2 : " + mid);

            if(target < nums[mid]) //-> target 이 mid 값 보다 작을 경우
                j = mid -1; //-> mid-1 을 마지막 인덱스로 변경
            else if(target > nums[mid]) //-> target 이 mid 값 보다 클 경우
                i = mid + 1; //-> mid+1 을 시작 인덱스로 변경
            else
            {
                if(mid == nums.length-1 || nums[mid] != nums[mid+1]) //-> nums 에 값이 1개 일 때, nums의 중간 값과 중간 값 바로 다음 값이 같지 않을 때,
                {
                    result[1] = mid;
                    break;
                }   
                else 
                    i = mid + 1; //-> 첫번째 인덱스를 늘려가면서 target 의 첫 번째 값 탐색
            }
            
        }
        
        System.out.println("result : " + result[0]+" "+result[1]);
        return result;
    }
}