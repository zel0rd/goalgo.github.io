function solution(numbers, target) {
    return find(numbers, target);
}

function find(numbers, target) {
    return _find(0, 0, numbers, target);
}

function _find(n, cnt, numbers, target) {
    if(cnt == numbers.length) {
        if(n == target) return 1;
        else return 0;
    }
    
    return _find(n+numbers[cnt], cnt+1, numbers, target)
        + _find(n-numbers[cnt], cnt+1, numbers, target);
}