def solution(n, m):
    gcd = lambda n, m : n if not m else gcd(m, n % m)
    lcm = int(n * m / gcd(n, m))
    answer = [gcd(n,m), lcm]
    return answer
"""
def solution(n,m):
    for i in range(n):
        if n%(n-i) + m%(n-i) == 0:
            return [n-i, n*m/(n-i)]

def solution(a, b):
    c, d = max(a, b), min(a, b)
    t = 1
    while t > 0:
        t = c % d
        c, d = d, t
    answer = [c, int(a*b/c)]

    return answer
"""
