def solution(heights):
    answer = []
    #print(len(heights))
    for i in range(len(heights)-1,0,-1):
        print("A : " + str(heights[i]))
        temp = [0]
        for j in range(i-1,0,-1):
            if heights[j] > heights[i]:
                temp.append(j)
        answer.append(max(temp))
    return answer
