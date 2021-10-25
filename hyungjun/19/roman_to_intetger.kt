import javax.xml.stream.events.Characters

/**
 * 로마 숫자를 숫자로 변경
 *  I : 1
 *  V : 5
 *  X : 10
 *  L : 50
 *  C : 100
 *  D : 500
 *  M : 1000
 */

fun main(){
    var word = "I";
    var arrays = word.toCharArray()
    var change_numbers = mutableMapOf<Char ,Int>('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to  100, 'D' to 500,'M' to 1000)
    var returns = change_numbers[arrays[0]]!!
    if(arrays.size!=1){
        for (i in 1 .. arrays.size-1){
            returns = returns + change_numbers[arrays[i]]!! // 일단 더함

            if(change_numbers[arrays[i-1]]!! < change_numbers[arrays[i]]!!){
                returns = returns - change_numbers[arrays[i-1]]!! - change_numbers[arrays[i-1]]!! //두번뺀다
            }
        }
    }
    print(returns)
}

/*
class Solution {

    fun romanToInt(s: String):Int {
        var value1 = 0
        var result = 0

        for(i in s.length - 1 downTo 0) {
            val letter = s[i]

            val value = getValue(letter)
            if(value >= value1) {
                result += value
            } else
                result -= value

            value1 = value
        }

        return result
    }

    private fun getValue(romNum: Char): Int{
        return when(romNum){
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> -1
        }
    }
}
 */