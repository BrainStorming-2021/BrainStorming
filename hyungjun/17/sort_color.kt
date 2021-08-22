/**
 * 빨간색, 흰색 또는 파란색으로 색칠된 개체가 n개인 배열 번호가 지정된 경우 동일한 색상의 개체가 빨간색, 흰색 및 파란색 순서로 인접하도록 정렬합니다.

우리는 빨간색, 흰색, 파란색 각각 0, 1, 2의 정수를 사용하여 색을 나타낼 것입니다.

이 문제는 라이브러리의 정렬 기능을 사용하지 않고 해결해야 합니다.
n == nums.length
1 <= n <= 300
nums[i] is 0, 1, or 2.
 */
fun main(){
    var arrays = intArrayOf(2, 0, 2, 1, 1, 0)
    var result = mutableListOf<Int>()
    var count_zero = 0
    var count_one = 0
    var count_two = 0
    arrays.forEach {
        if(it == 0){
            count_zero++
        }else if(it==1){
            count_one++
        }else{
            count_two++
        }
    }
    var cnt = 0
    for(i in 1 .. count_zero){
        result.add(cnt,0)
        cnt++
    }
    for(i in 1 .. count_one){
        result.add(cnt,1)
        cnt++
    }
    for(i in 1 .. count_two){
        result.add(cnt,2)
        cnt++
    }
    println(result)
}