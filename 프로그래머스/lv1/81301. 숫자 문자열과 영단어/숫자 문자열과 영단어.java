import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        //String[] a = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        //String[] b = {"1","2","3","4","5","6","7","8","9","0"};
        
        String[] strArr = s.split("");
        int index = 0;
        int indexSS = 0;
        
        Map<String,String> map = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        
        for(char x : s.toCharArray()) {
            //숫자는 따로 result 객체로 저장.
            if(Character.isDigit(x)){
                result.append(x);
            //문자라면
            } else{
                //currentword에 저장.
                currentWord.append(x);
                //저장된 currentword 단어를 map의 키가 포함하고 있는지 확인하고
                if(map.containsKey(currentWord.toString())) {
                    //확인하여 있으면 result갹체에 map의 currentWord 키에 해당하는 값을 저장
                    result.append(map.get(currentWord.toString()));
                    //currentWord를 새로이 초기화.새롭게 담기 위해서.
                    currentWord = new StringBuilder();
                }
            }
            
        }
        
        
        
        
        

        
        
        return Integer.parseInt(result.toString());
    }
}


// class Solution {
//     public int solution(String s) {
//         String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//         for(int i = 0; i < strArr.length; i++) {
//             s = s.replaceAll(strArr[i], Integer.toString(i));
//         }
//         return Integer.parseInt(s);
//     }
// }
