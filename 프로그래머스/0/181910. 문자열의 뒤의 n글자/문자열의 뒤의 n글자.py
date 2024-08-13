def solution(my_string, n):
    answer = ''
    myList = list(my_string)
    startPoint = len(my_string)-n
    
    for i in myList[startPoint:]:
        answer += i
    
    return answer