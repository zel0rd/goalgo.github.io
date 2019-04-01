/**
 *  카카오 프렌즈 컬러링북
 *  https://programmers.co.kr/learn/courses/30/lessons/1829
 */

#include <vector>
#include <queue>

using namespace std;

int search(int x, int y, vector<vector<int>> &picture, vector<vector<bool>> &visited) {
    queue<int> q;
    int row = picture.size();
    int col = picture[0].size();
    int cnt = 0;
    q.push(y);
    q.push(x);
    visited[y][x] = true;
    cnt++;

    while(!q.empty()) {
        int i = q.front(); q.pop();
        int j = q.front(); q.pop();
        if(i<row-1 && !visited[i+1][j] && picture[i+1][j] == picture[i][j]) {
            q.push(i+1);
            q.push(j);
            visited[i+1][j] = true;
            cnt++;
        }
        if(i>0 && !visited[i-1][j] && picture[i-1][j] == picture[i][j]) {
            q.push(i-1);
            q.push(j);
            visited[i-1][j] = true;
            cnt++;
        }
        if(j<col-1 && !visited[i][j+1] && picture[i][j+1] == picture[i][j]) {
            q.push(i);
            q.push(j+1);
            visited[i][j+1] = true;
            cnt++;
        }
        if(j>0 && !visited[i][j-1] && picture[i][j-1] == picture[i][j]) {
            q.push(i);
            q.push(j-1);
            visited[i][j-1] = true;
            cnt++;
        }

    }

    return cnt;
}

vector<int> solution(int m, int n, vector<vector<int>> picture) {
    vector<int> answer(2, 0);
    vector<vector<bool>> visited(m, vector<bool>(n, false));
    int max = 0;

    for(int i=0; i<m; i++) {
        for(int j=0; j<n; j++) {
            if(picture[i][j] == 0) visited[i][j] = true;
            if(visited[i][j]) continue;
            max = search(j, i, picture, visited);
            answer[0]++;
            if(max > answer[1]) {
                answer[1] = max;
            }
        }
    }

    return answer;
}
