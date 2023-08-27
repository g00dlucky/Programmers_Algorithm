class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int[] size : sizes) {
            int width = Math.max(size[0],size[1]);
            int height = Math.min(size[0],size[1]);
            
            maxWidth = Math.max(maxWidth, width);
            //height값 중에 가장 큰 값을 찾기.
            maxHeight = Math.max(maxHeight, height);
        }
        
        return maxWidth * maxHeight;
    }
}