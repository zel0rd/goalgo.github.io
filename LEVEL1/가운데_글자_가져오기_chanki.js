function solution(s) {
    var length = s.length;

    if(length % 2 == 1) return s.slice(length/2, length/2 + 1)
    else return s.slice(length/2 -1, length/2 + 1)
}
