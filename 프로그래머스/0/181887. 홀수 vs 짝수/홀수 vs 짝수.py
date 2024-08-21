def solution(num_list):
    # 첫번째 원소 1 -> index[0] 매칭
    # 홀수번째 원소 합, 짝수 번째 원소 합 => 큰 값 return
    return max(sum(num_list[::2]), sum(num_list[1::2]))
    