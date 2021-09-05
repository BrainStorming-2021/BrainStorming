/**
 *
 */
fun main(){
    var strings = readLine()!!
    var returns = 0
    if(!strings.contains('+')){ // - 만 있거나 또는 혼자인 경우
        var minus_array = strings.split("-")
        returns = minus_array[0].toInt()
        if(minus_array.size>1){
            for(i in 1 .. minus_array.size-1){
                returns = returns - minus_array[i].toInt()
            }
        }
    }else if(!strings.contains('-')){   // + 만 있는경우
        var plus_array = strings.split("+")
        plus_array.forEach {
            returns = returns + it.toInt()
        }
    }else{      // + 랑 - 랑 같이 있는경우
        var minus_array = strings.split("-")
        var numbers = mutableListOf<Int>()
        var adds : Int
        minus_array.forEach{
            var check = it.split("+")
            adds = 0
            check.forEach {
                adds = adds+ it.toInt()
            }
            numbers.add(adds)
        }
        returns = numbers[0]
        var max = 0
        for(i in 1 .. numbers.size-1){
            if( max < numbers[i]){
                max = numbers[i]
            }
            returns = returns + numbers[i]
        }
        returns = returns - max - max
    }
    println(returns)
}