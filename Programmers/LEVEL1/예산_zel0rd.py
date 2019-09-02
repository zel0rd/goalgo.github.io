def solution(d, budget):
    d.sort()
    for i in range(len(d)):
        if budget >= d[i]:
            budget -= d[i]
        else:
            return i
    return len(d)
"""
def solution(d, budget):
    d.sort()
    while sum(d) > budget:
        d.pop()
    return len(d)
"""
