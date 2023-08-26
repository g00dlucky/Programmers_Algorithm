import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int a = 0;
        int nValue = n;
        int mValue = m;
        
        while(mValue != 0){
            int temp = mValue;
            mValue = nValue % mValue;
            nValue = temp;
            a = nValue;
        }
        
        
        int gcdValue = a;
        int lcmValue = n * m / gcdValue; 

        return new int[]{gcdValue, lcmValue};
        
        
    }
}