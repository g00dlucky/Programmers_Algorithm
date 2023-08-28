class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int index = 0;

        for(int a=i; a<=j; a++) {
            String aStr = String.valueOf(a);
            String kStr = String.valueOf(k);
            String[] b = aStr.split("");
            
            // if(aStr.contains(kStr) || (aStr.equals(kStr))) {
            //     answer++;   
            // }
            
            String[] parts = aStr.split(kStr, -1); 
            answer += parts.length - 1; 
           
        }
        
        return answer;
    }
}

            // //중복숫자처리
            //     for(int c=0; c<b.length; c++) {
            //         if(b[c].equals(kStr)) {
            //             index++;
            //         } 
            //     }