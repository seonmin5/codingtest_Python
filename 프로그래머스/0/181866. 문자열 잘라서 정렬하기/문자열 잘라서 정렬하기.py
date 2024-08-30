def solution(myString):
    # sample_list = list(filter(None, sample_list))
    return sorted(list(filter(None, myString.split("x"))))