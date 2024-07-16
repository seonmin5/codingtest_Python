def solution(my_string):
    vowelList = ['a', 'e', 'i', 'o', 'u']
    for vowel in vowelList:
        my_string = my_string.replace(vowel, '')
    return my_string