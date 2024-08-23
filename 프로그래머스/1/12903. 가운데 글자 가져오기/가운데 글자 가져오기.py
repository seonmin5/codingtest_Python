def solution(s):
    cal = int(len(s)/2)
    if len(s) % 2 == 1:
        return s[cal]
    else:
        return s[cal-1:cal+1]