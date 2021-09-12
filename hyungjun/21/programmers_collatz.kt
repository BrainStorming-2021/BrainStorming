/**
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 * 콜라츠 추측
 *
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 */
fun main(){
    var num = 626331
    var value = num.toDouble()
    var count = 0
    while(value!=1.0){
        value = if(value%2==0.0) value/2 else (value*3)+1
        count = count + 1
        if(count==500)
        {
            value =1.0
            count=-1
        }
    }

    println(count)
}