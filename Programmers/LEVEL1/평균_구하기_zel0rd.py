def solution(arr):
    answer = 0
    for i in range(len(arr)):
        answer += arr[i]
    return answer/len(arr)
"""
def solution(arr):
    return sum(arr)/len(arr)
"""
