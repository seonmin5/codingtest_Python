def solution(box, n):
    # 나누어 떨어지는 값 3개를 찾아 곱한 값 = 최대 개수
    divideWidth = box[0] // n
    divideHeight = box[1] // n
    divideDepth = box[2] // n
    
    return (divideWidth*divideHeight*divideDepth)