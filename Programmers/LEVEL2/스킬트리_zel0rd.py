def solution(skill, skill_trees):
    answer = 0
    for i in skill_trees:
        temp = list(skill)
        for j in i:
            if j in temp:
                if j != temp.pop(0):
                    break
        else:
            print(i)
            answer += 1
    return answer
