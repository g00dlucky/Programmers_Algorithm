import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i=0; i<queries.length; i++){
            int[] group = queries[i];
            for(int j=group[0]; j<=group[1]; j++){
                if(group[0] <= j && group[1] >= j){
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }
}

// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//         for (int i = 0; i < queries.length; i++) {
//             int[] query = queries[i];
//             int start = query[0];
//             int end = query[1];
            
//             for (int j = start; j <= end; j++) {
//                 arr[j] += 1;
//             }
//         }
        
//         return arr;
//     }
// }


// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {

//         for (int[] query : queries) {
//             int s = query[0], e = query[1];
//             for (int i = s; i <= e; i++)
//                 arr[i]++;
//         }
//         return arr;
//     }
// }
