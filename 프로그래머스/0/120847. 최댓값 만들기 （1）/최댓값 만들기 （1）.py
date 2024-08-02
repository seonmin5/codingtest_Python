def solution(numbers):
    firstMaxNumber = max(numbers)
    indexMaxNumber = numbers.index(firstMaxNumber)
    numbers.pop(indexMaxNumber)
    secondMaxNumber = max(numbers)
    return(firstMaxNumber * secondMaxNumber)