/**
 * 동쪽으로 이동하는 차량은 0 P
 * 서쪽으로 이동하는 차량은 1 Q
 * A라는 배열에 0 또는 1의 값을 담아줌
 * P,Q 쌍이 될 수 있는 최대 갯수를 구할것
 * 1000000000 의 수를 넘을경우 -1 반환
 */

fun main(){
    var A = arrayOf(0,1,0,1,1)
    var returns = 0
    var zero_check = 0

    run {
        A.forEach {
            if(it == 0 ){
                zero_check=zero_check+1
            }else {
                returns = returns + zero_check
                if(returns >1000000000){
                    returns = -1
                    return@run
                }
            }
        }
    }
    println(returns)
}