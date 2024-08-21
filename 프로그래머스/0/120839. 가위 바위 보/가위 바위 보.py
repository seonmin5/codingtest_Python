def solution(rsp):
    result = ''
    rspDict = {"2":"0", "0":"5", "5":"2"}
    for i in rsp:
        result += rspDict[i]
    return result