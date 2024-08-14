def solution(answers):
    result = []
    sol1 = [1, 2, 3, 4, 5] * len(answers)
    sol2 = [2, 1, 2, 3, 2, 4, 2, 5] * len(answers)
    sol3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * len(answers)
    count1, count2, count3 = 0, 0, 0
    
    # 1번~3번 수포자 문제 정답여부 확인
    for i in range(len(answers)):
        if sol1[i] == answers[i]:
            count1 += 1
    for i in range(len(answers)):
        if sol2[i] == answers[i]:
            count2 += 1
    for i in range(len(answers)):
        if sol3[i] == answers[i]:
            count3 += 1
    
    # 가장 높은 점수 받은 사람(return값 오름차순)
    if count1 == count2 == count3:
        result.append(1)
        result.append(2)
        result.append(3)
    elif count1 == count2 and count1 > count3:
        result.append(1)
        result.append(2)
    elif count1 == count3 and count1 > count2:
        result.append(1)
        result.append(3)
    elif count1 > count2 and count1 > count3:
        result.append(1)
    elif count2 == count3 and count2 > count1:
        result.append(2)
        result.append(3)
    elif count2 > count3 and count2 > count1:
        result.append(2)
    else:
        result.append(3)
    return result
    