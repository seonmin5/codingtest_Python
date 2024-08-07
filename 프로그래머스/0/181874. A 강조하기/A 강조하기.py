def solution(myString):
    answer = ''
    replaceString = (myString).replace("a", "A")
    for i in replaceString:
        if i != "A" and i.isupper():
            answer += i.lower()
        else:
            answer += i
    return answer