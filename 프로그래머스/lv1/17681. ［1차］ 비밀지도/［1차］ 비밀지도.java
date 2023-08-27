class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] strArr1= new String[arr1.length];
        
        for(int i=0; i<arr1.length; i++) {
            
            int c = arr1[i] | arr2[i];  // 비트 OR 연산 수행
            String e = Integer.toBinaryString(c);
            
            // 이진수 문자열의 길이가 n보다 작을 경우, 앞에 0을 채워주어야 함
            while (e.length() < n) {
                e = "0" + e;
            }
            
            String f = e.replaceAll("1","#").replaceAll("0"," ");
            strArr1[i] = f;
        }
        
        return strArr1;
    }
}