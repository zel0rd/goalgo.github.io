def solution(s, n):
    answer = ""
    for i in range(len(s)):
        if ord("a") <= ord(s[i]) and ord(s[i]) <= ord("z") :
            if(ord(s[i]) + n > ord("z")):
                answer += chr(ord(s[i]) + n - ord("z") + ord("a") - 1 )
            else:
                answer += chr(ord(s[i]) + n)
        if ord("A") <= ord(s[i]) and ord(s[i]) <= ord("Z") :
            if(ord(s[i]) + n > ord("Z")):
                answer += chr(ord(s[i]) + n - ord("Z") + ord("A") - 1)
            else:
                answer += chr(ord(s[i]) + n)
        if(s[i] == " "):
            answer += " "
    return answer
