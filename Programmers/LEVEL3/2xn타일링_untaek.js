/**
 *  2xn 타일링  
 *  https://programmers.co.kr/learn/courses/30/lessons/12900 
 */

function solution(n) {
    var tiles = new Uint32Array(n + 1)

    let m = 3
    tiles[1] = 1
    tiles[2] = 2
    while(m <= n) {
        tiles[m] = (tiles[m-1] + tiles[m-2]) % 1000000007
        m++
    }

    return tiles[n]
}