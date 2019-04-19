n, m = gets.chomp.split(' ').map(&:to_i)
for i in 0...m
    for j in 0...n
        print"*"
    end
    puts ""
end
