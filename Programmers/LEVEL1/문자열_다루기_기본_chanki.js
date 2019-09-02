function solution(s) {
    if(s.length == 4 || s.length == 6){
        var pattern = /^[0-9]+$/;
        return pattern.test(s)
    }
    else return false;
}
