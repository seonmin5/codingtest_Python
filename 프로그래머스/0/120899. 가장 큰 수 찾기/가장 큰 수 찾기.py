def solution(array):
    answer = []
    maxNumber = max(array)
    maxIndex = array.index(maxNumber)
    answer.append(maxNumber)
    answer.append(maxIndex)
    return (answer)
    
