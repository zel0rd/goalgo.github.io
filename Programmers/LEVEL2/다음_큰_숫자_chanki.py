def countNumber(n):
    a = 0;
    while(n != 0):
        if (n % 2 == 1):
            a = a + 1
        n = int(n / 2)
    return a


def solution(n):
    answer = n
    while (True):
        answer = answer + 1
        if ( countNumber(answer) == countNumber(n) ):
            return answer
