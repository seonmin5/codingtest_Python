def solution(strArr):
    answer = []
    for i in strArr:
        if "ad" not in i:
            answer.append(i)
        else:
            continue
    return answer