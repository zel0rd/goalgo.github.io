def solution(array, commands)
    answer = []
    commands.each {|com|
        answer << array[com[0]-1..com[1]-1].sort[com[2]-1]
    }

    return answer
end