def solution(age):
    # key-value
    dictAge = {0:'a', 1:'b', 2:'c', 3:'d', 4:'e', 5:'f', 6:'g', 7:'h', 8:'i', 9:'j'}
    calculateAge = ''
    
    for i in str(age):
        calculateAge += dictAge[int(i)]
    
    return calculateAge