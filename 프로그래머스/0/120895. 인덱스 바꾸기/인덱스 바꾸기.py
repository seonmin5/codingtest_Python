def solution(my_string, num1, num2):
    myList = list(my_string)
    answer = []
    for i in range(len(myList)):
        if i == num1:
            answer.append(myList[num2])
        elif i == num2:
            answer.append(myList[num1])
        else:
            answer.append(myList[i])
    return (''.join(answer))