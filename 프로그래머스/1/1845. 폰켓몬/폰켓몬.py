def solution(nums):
    myDict = {num: "value" for num in nums}
    if len(nums) // 2 > len(myDict.keys()):
        return (len(myDict.keys()))
    else:
        return (len(nums)//2)