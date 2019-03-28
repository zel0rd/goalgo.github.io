def solution(n):
    answer = []
    for i in range(len(str(n))):
        answer.append(str(n)[i])
    answer.sort(reverse=True)
    answer =  int("".join(answer))
    return answer
