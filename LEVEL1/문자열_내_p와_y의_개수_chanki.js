function solution(s){
    var p = 0;
    var y = 0;
    for(var i=0; i < s.length;i++){
        if(s[i] == 'p' || s[i] == "P"){
            p = p + 1;
        }
        else if (s[i] == 'y' || s[i] == "Y"){
            y = y + 1;
        }
    }
    if(p === y) return true;
    else return false;
}
