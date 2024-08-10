def solution(arr, idx):
    answer = ''
    for i in arr:
        answer += str(i)
    return (answer.find("1", idx))