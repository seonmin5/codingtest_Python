def solution(strArr):
    i = 0
    while i < len(strArr):
        if "ad" in strArr[i]:
            strArr.remove(strArr[i])
        else:
            i += 1
    return strArr
            