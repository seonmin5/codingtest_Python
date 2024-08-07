def solution(s):
    lowerS = s.lower()
    if lowerS.count("p") == lowerS.count("y"):
        return True
    else:
        return False