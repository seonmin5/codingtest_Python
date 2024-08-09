def solution(s1, s2):
    count = 0
    s1.sort()
    s2.sort()
    if len(s1) >= len(s2):
        for i in s1:
            if i in s2:
                count += 1
    if len(s1) < len(s2):
        for i in s2:
            if i in s1:
                count += 1
    return count
                
            