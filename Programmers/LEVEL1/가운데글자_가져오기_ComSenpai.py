def solution(str):
    if len(str) % 2: 
        return str[len(str)//2]
    else: 
        return str[(len(str)//2-1) : len(str)//2+1]
