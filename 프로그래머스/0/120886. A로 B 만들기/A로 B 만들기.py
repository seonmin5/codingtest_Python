def solution(before, after):
    sortBefore, sortAfter = list(before), list(after)
    sortBefore.sort()
    sortAfter.sort()
    if sortBefore == sortAfter:
        return 1
    else:
        return 0