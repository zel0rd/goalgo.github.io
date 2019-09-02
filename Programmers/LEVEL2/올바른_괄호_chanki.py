def solution(s):
    left = 0
    right = 0
    if(s[0] == '}'):
        return False
    for i in range(len(s)):
        if s[i] == '(' :
            left = left + 1
        else :
            right = right + 1

        if(right > left) :
            return False

    if (left == right) :
        return True
    else :
        return False
