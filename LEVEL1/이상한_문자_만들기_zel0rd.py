def solution(s):
    answer = ''
    s = s.split(' ')
    for i in range(len(s)):
        for j in range(len(s[i])):
            if j % 2 == 0:
                answer += s[i][j].upper()
            else:
                answer += s[i][j].lower()
        answer += ' '
    return answer[:-1]
