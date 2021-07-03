/*
음수가 아닌 두 정수를 나타내는 두 개의 비어 있지 않은 연결 목록이 제공됩니다.
자릿수는 역순으로 저장되며 각 노드에는 한 자릿수가 포함됩니다.
두 숫자를 추가하고 합계를 연결된 목록으로 반환합니다.

두 숫자에는 숫자 0을 제외하고 선행 0이 포함되어 있지 않다고 가정할 수 있습니다.
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
/**
 * ListNode 선언 후 .'val' 로 값을 가지고 올 수 있음
 * ListNode .next로 다음 값의 null을 확인
 * ListNode(a) = 'a' 정수 값으로 선언 가능.
 */
fun main(){
    /*var Node = ListNode(0)
    var t = Node.`val`
    println(t)
    Node.next=ListNode(1)

    if(Node.next!=null){
        Node = Node.next!!
        t = Node.`val`
        println(t)
    }*/
    var node = ListNode(0)
    var nodeval = node
    var add : Int
    var check = false
    var listnode1 = l1
    var listnode2 = l2
    // l1 다음 node 를 체크 null 일 경우에는 stop을 할 수 있도록 한다.
    while(listnode1 != null || listnode2 != null ){
        add = 0
        if(listnode1 != null){       //l1이 null 이 아닐경우
            add += listnode1.`val`
            listnode1 = listnode1.next      //listnode1 에 listnode1의 next를 넣어주기
        }

        if(listnode2 != null){       //l2의 값이 null 이 아닐경우
            add += listnode2.`val`
            listnode2 = listnode2.next
        }

        if(check == true){          //true 일 경우에는 10 + a 이므로  +1을 해줘야한다
            add +=1
        }

        if(add>=10){        //add 가 10보다 클 경우
            check = true
        }else{
            check = false
        }
        nodeval.next = ListNode(add%10)         //10으로 나눈 나머지값 => 일의자리만 들어가도록 한다
        nodeval = nodeval.next!!                //null이 아닐경우에 nodeval 에 넣어준다
    }
    if(check==true){
        nodeval.next = ListNode(1)
        nodeval = nodeval.next!!
    }
    return node.next
}