function solution(n) {
    let arr = [];
    for(let i=0; i<n;i++){
        arr.push(i % 2 ? "박" : "수");
    }
 
    return arr.join('');
}