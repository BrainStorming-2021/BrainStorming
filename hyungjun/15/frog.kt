/**
 * 개구리의 현재 위치 X, Y만큼 가야함(X>=Y), 개구리가 뛰는 거리 D
 * X, Y, D 가 주어질 경우 최소 뛰어야 하는 갯수를 RETURN
 *
 * 단, X<=Y
 */
fun main(){
    var X = 85
    var Y = 85
    var D = 30
    var count = (Y-X)/D
    if((Y-X)%D!=0){
        count++
    }
    println(count)
}