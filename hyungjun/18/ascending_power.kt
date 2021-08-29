/**
 * 오름차순으로 정렬하라
 * 첫번재 수는 몇개의 수를 입력할 건지 정하는 수
 */
fun main(){
    var input = readLine()!!.toInt()
    var numbers = mutableListOf<Int>()
    repeat(input){
        numbers.add(readLine()!!.toInt())
    }
    numbers.sort()
    numbers.forEach {
        println(it)
    }

}