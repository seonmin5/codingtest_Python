def solution(myString, pat):
    endPoint = myString.rfind(pat)
    return (myString[:endPoint+len(pat)])