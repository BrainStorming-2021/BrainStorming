/**
 * https://www.acmicpc.net/problem/10808
 * 알파벳 개수 구하기
 */
fun main() {
    var value = readLine().toString()
    var arrays = Array<Int>(26){ i-> 0}

    value.forEach {
        arrays = check_string(arrays, it);
    }
    arrays.forEach {
        print("$it ");
    }
}

fun check_string(arrays : Array<Int>, a : Char):Array<Int> {
    when(a) {
        'a'->arrays[0] = arrays[0]+1
        'b'->arrays[1] =  arrays[1] +1
        'c'->arrays[2] =  arrays[2] +1
        'd'->arrays[3] =  arrays[3] +1
        'e'->arrays[4] =  arrays[4] +1
        'f'->arrays[5] =  arrays[5] +1
        'g'->arrays[6] =  arrays[6] +1
        'h'->arrays[7] =  arrays[7] +1
        'i'->arrays[8] =  arrays[8] +1
        'j'->arrays[9] =  arrays[9] +1
        'k'->arrays[10] = arrays[10]+1
        'l'->arrays[11] = arrays[11]+1
        'm'->arrays[12] = arrays[12]+1
        'n'->arrays[13] = arrays[13]+1
        'o'->arrays[14] = arrays[14]+1
        'p'->arrays[15] = arrays[15]+1
        'q'->arrays[16] = arrays[16]+1
        'r'->arrays[17] = arrays[17]+1
        's'->arrays[18] = arrays[18]+1
        't'->arrays[19] = arrays[19]+1
        'u'->arrays[20] = arrays[20]+1
        'v'->arrays[21] = arrays[21]+1
        'w'->arrays[22] = arrays[22]+1
        'x'->arrays[23] = arrays[23]+1
        'y'->arrays[24] = arrays[24]+1
        'z'->arrays[25] = arrays[25]+1
    }
    return arrays;
}