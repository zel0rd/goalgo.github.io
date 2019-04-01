def solution(n):
    if (n ** 0.5) % 1 == 0:
        return ((n ** 0.5) + 1) ** 2
    return -1
