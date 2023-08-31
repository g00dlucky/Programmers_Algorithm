class Solution {
    public int solution(int[][] board) {
        int answer = 0;
         int[] a = {-1,1,0,0,-1,-1,1,1};
         int[] b = {0,0,-1,1,1,-1,1,-1};
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 1) {
                    for(int k=0; k<8; k++) {
                        //위치 이동식 (i와 j를 고정시켜두고 dx,dy를 이동)
                         int dx = i + a[k];
                         int dy = j + b[k];
                        //배열의 인덱스값 기준(5*5 기준으로 
                        //index를 4를 넘어가거나 -1이 될 수 없음)
                          if(dx>=0 && dx <= board.length-1 &&
                            dy>=0 && dy <=board[i].length-1 && 
                           board[dx][dy]!= 1) {
                             //폭탄 주변을 하나씩 2로 만든다(위험지대 표시)
                             board[dx][dy] = 2;
                         }
                    }
                }
            }
        }
        
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
// //arrayboundsoutofexception 발생
// class Solution {
//     public int solution(int[][] board) {
//         int answer = 0;
        
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board[i].length; j++){
//                 if(board[i][j] == 1) {
      
//                     board[i-1][j] = 1;
//                     board[i+1][j] = 1;
//                     board[i][j-1] = 1;
//                     board[i][j+1] = 1;
//                     board[i-1][j+1] = 1;
//                     board[i-1][j-1] = 1;
//                     board[i+1][j+1] = 1;
//                     board[i+1][j-1] = 1;
                    
//                 }
//             }
//         }
        
        
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board[i].length; j++){
//                 if(board[i][j] == 0) {
//                     answer++;
//                 }
//             }
//         }
//         return answer;
//     }
// }