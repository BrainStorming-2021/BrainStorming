/**
 * 삼각형 만들기git
 * */

fun main(){
    var arrays = arrayOf(10,2,5,1,8,20)
    var flag = 0
    arrays.sort()
    for ( i in 0 .. arrays.size-3){
        for(j in i+2 .. arrays.size-1){
            if( (arrays[i]>0 && arrays[i+1] == Int.MAX_VALUE) || arrays[i]+arrays[i+1] > arrays[j]){
                flag =1
                break;
            }else{
                break;
            }
        }
        if(flag==1){
            break;
        }
    }
    println(flag)
}

/*
참고 : https://namget.tistory.com/entry/%EC%BD%94%EB%94%9C%EB%A6%AC%ED%8B%B0-Lesson-6-Triangle
 */