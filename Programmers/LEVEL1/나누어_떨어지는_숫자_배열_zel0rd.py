def solution(arr, divisor):
    answer = []
    for i in range(len(arr)):
        if divmod(arr[i],divisor)[1] == 0 :
            answer.append(arr[i])
    answer.sort()
    if answer == []:
        answer = [-1]
    return answer
