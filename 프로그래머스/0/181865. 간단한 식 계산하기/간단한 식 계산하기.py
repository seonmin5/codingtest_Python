def solution(binomial):
    splitList = binomial.split(' ')
    digitList = []
    for i in splitList:
        if i.isdigit():
            digitList.append(int(i))
    if splitList[1] == '*':
        return (digitList[0]*digitList[1])
    elif splitList[1] == '+':
        return (digitList[0]+digitList[1])
    else:
        return (digitList[0]-digitList[1])