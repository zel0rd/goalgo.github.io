def solution(a, b):
    count_of_days = 0
    day_of_the_week = ["SUN","MON","TUE","WED","THU","FRI","SAT"]
    count_of_month = [31,29,31,30,31,30,31,31,30,31,30,31]

    #월만큼 날짜 계산
    for i in range(a-1):
        count_of_days = count_of_month[i] + count_of_days

    #일만큼 날짜 계산
    count_of_days = count_of_days + b

    #날짜 수정
    answer = day_of_the_week[(count_of_days + 4 )% 7]
    return answer
