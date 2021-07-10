/**
 * 문자열이 지정된 경우 문자를 반복하지 않고 가장 긴 하위 문자열의 길이를 찾습니다.
 * example
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
fun main(){
    var s = "dvdf"
    var check_string = ""
    var max = 0
    var count =0

    s.forEach {
        var check=it
        if(check_string.contains(check)){  //반복되는 문자열이 들어가는경우
            if(max < count){                //max 값과 count를 비교
                max = count                 // max 값에 count를 넣는다
            }
            var string_split = check_string.split(check)    // 중복이 나온 값을 기준으로 split 한다
            check_string=""+string_split.last()+check       // 중복 아닌 나머지 값을 check_string 값에 넣는다
            count=check_string.count()                      // count 는 check_string의 개수
        }else{
            count++                         // count 증가
            check_string+=check             // string에 check 값을 추가한다
        }
    }
    if(max<count){
        max = count
    }

    println(max)
}