def solution(s)
    return s.each_byte.to_a
            .sort.reverse
            .map{|a| a.chr}.join
end