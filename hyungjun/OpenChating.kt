//오픈채팅방
//record : Array<String> : Array<String>
//["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
//["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
// 풀이 방법
// 들어왔다가 나간 경우를 전부 체크 (uid 값으로 확인) => change 는 미포함
// 마지막 uid의 닉네임 값을 확인.
fun main(){
    var record : Array<String> = arrayOf("Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan")
    var lerecod = mutableMapOf<Int,String>()    // Enter/Leave 기록 확인 uid 에 맞게 확인
    var id_name = mutableMapOf<String,String>() // uid 에 맞는 닉네임값 저장 => 마지막 닉네임 값을 가지고 있는다.
    var check_map : Map<String,String>          // funtion 을 타고 나온 값을 가지고 있는 임시저장소
    var count = 0                               // return 값에 대한 Index를 선언해줄 count

    //들어왔다 나간 경우를 전부 체크 => Enter/Leave 로만 체크
    record.forEach {
        check_map = check(it)
        if(check_map.containsKey("uid")){       //check_map 에 키가 있는지 확인하기.
         check_map.get("uid")?.let { it1 -> id_name.put(it1, check_map.get("nick_name")!!) }
        }
        if(check_map.containsKey("result")) {       //cehck_map 에 키가 있는지 확인하기
            lerecod.put(count,check_map.get("result").toString())
            count++
            }
    }
    var answer = Array<String>(lerecod.count(),{""})//결과값

    lerecod.forEach { k, v ->
        var uid_check = v.split("님")
        var name_check = id_name.get(uid_check[0]).toString()
        answer[k] = v.replace(uid_check[0], name_check)
    }

    answer.forEach {
        println(it)
    }
}


// record를 받을 함수.
// 해당 함수 n 으로
fun check(n : String):Map<String,String>{
    var check_action = n.substring(0,1)             // 첫번째 글자 확인
    var check_uid = n.split(" ")           // 문자열의 특정 문자를 기준으로 배열로 만들기
    var result = mutableMapOf<String,String>()      // 선언 후에 값을 넣을 수 있는 mutableMapOf

    if(check_action=="L"){
        result.put("result", check_uid.last()+"님이 나갔습니다.")     //Leave 같은 경우에는 나가는 값으로 닉네임이 없음
    }else{
        result.put("uid", check_uid[1])                     //uid 값을 선언
        result.put("nick_name",check_uid.last())            //nick_name 값을 선언ㅣ

        if(check_action=="E"){                                  //Enter 같은 경우 값이 들어옴
            result.put("result", check_uid[1]+"님이 들어왔습니다.")
        }
    }
    return result
}