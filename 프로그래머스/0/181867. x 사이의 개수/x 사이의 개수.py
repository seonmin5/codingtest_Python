def solution(myString):
    splitString = myString.split("x")
    answer = []
    for i in range(len(splitString)):
        answer.append(len(splitString[i]))
    return answer