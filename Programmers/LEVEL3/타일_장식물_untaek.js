function solution(N) {
    let blk1 = 1
    let blk2 = 1
    let temp = 0

    for(let i=0; i<N-1; i++) {
        temp = blk1
        blk1 = blk2
        blk2 = temp + blk2
    }

    return (blk1 + blk2) * 2;
}