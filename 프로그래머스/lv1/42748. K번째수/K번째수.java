import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int[] intArr = {};
        
        for(int i=0; i<commands.length; i++){
            int[] groups = commands[i];
            int a = groups[0]-1;
            int b = groups[1]-1;
            int c = groups[2]-1;
            
            intArr = new int[b-a+1];   
            int index = 0;
            for(int j=a; j<=b; j++) {
                intArr[index++] = arr[j];
            }
            
            Arrays.sort(intArr);
            list.add(intArr[c]);
           
        }
        return list;
    }
}