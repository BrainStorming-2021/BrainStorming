/**
 * 배열을 받으면 배열을 최소화하여 최소화 갯수를 return
 */
fun main(){
    var A = arrayOf(2,1,1,1,3)
    var result = A.distinct().count()

    print(result)
}