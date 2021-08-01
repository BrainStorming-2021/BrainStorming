/**
 * IntArray 가 주어질 경우
 * 해당 array에서 특정 숫자의 처음과 끝의 index 를 찾는 문제
 * nums = [5,7,7,8,8,10]
 * target
 * return IntArray => [3, 4]
 */
fun main(){
    var num : Array<Int> = arrayOf(5,7,7,8,8,10)
    var result = IntArray(2, { -1 } )
    var target = 8
    var target_count = 0
    var count = 0
    num.forEach {
        if(target == it){
            if(result[0]!=-1){
                target_count=1
            }
            result[target_count] = count
        }
        count++
    }
    if(result[1]==-1){
        result[1] = result[0]
    }
    result.forEach {
        println(it)
    }
}