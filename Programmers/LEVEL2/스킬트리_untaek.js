function solution(skill, skill_trees) {
    var answer = 0

    for(let i=0; i< skill_trees.length; i++) {
        let k = 0
        for(let j=0; j<skill_trees[i].length; j++) {
            if(!skill.includes(skill_trees[i][j])){
                continue
            }

            if(skill[k] === skill_trees[i][j]) {
                k++
            } 
            else {
                k = -1
                break
            }
        }
        if(k > -1) {
            answer++
        }
    }

    return answer
}
