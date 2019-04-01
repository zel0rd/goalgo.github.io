/**
 *  체육복 
 *  https://programmers.co.kr/learn/courses/30/lessons/42862
 *  ** fail **
 */

function solution(n, lost, reserve) {
    var answer = 0;
    let students = new Array(n).fill(1);
    lost.forEach(i => students[i-1] = 0)
    reserve.forEach(i => students[i-1]++)
    
    for(let i=0; i<n; i++) {
        if(students[i] == 0) {
            if(0 < i && i < n && students[i-1] == 2) {
                students[i] = 1
                students[i-1] = 1
            }
            else if(i < n-1 && students[i+1] == 2) {
                students[i] = 1
                students[i+1] = 1
            }
        }
    }
    
    students.forEach(i => {
        if(i == 2 || i == 1) answer++
    })
    return answer;
}