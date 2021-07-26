# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        
        it1 = l1
        number = 1
        fnumber = 0
        while it1 :
            fnumber += it1.val * number
            it1 = it1.next
            number *= 10
        
        it2 = l2
        number = 1
        snumber = 0
        while it2 :
            snumber += it2.val * number
            it2 = it2.next
            number *= 10
        
        result = int(fnumber) + int(snumber)
        
        head = None
        for i in reversed(str(result)):
            if not head :
                head = ListNode(int(i))
                curn = head
            else :
                curn.next = ListNode(int(i))
                curn = curn.next
        return head
    
sol = Solution()

sol.addTwoNumbers([1,2,3], [4,5,6])