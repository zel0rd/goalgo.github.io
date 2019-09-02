def div(n):
    arr = []
    for i in range(1, n+1):
        if n % i == 0 :
            arr.append(i)
    return arr

def solution(n):
    return sum(div(n))
