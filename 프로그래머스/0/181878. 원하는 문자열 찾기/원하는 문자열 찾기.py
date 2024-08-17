def solution(myString, pat):
    # True 1, False 0 반환
    return int(pat.lower() in myString.lower())