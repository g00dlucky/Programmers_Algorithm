class Solution {
public int[] solution(int[] arr, int[][] intervals) {
        int length = 0;
        for(int i = 0; i <intervals.length; i++){
            int[] group = intervals[i];//group에 i가 0일 때 [1,3],i가 1일 때 [0,4] w저장.
            length += group[1] - group[0] + 1; //i일 때 group[1]은 3이고, group[0] = 1 answer의 전체 길이를 구하는 것.
        }
        int[] answer = new int[length];
        int index = 0;
        for(int i = 0; i < intervals.length; i++){
           int[] group = intervals[i];
            for(int j = group[0]; j <= group[1]; j++){
                 answer[index++] = arr[j];
            }
        }
    
    
        return answer;
    }
}