def solution(arr):
    answer = []
    num = 0
    for num in range(len(arr)-1):
        if arr[num]!=arr[num+1]:
            answer.append(arr[num])
    answer.append(arr[len(arr)-1])
    return answer