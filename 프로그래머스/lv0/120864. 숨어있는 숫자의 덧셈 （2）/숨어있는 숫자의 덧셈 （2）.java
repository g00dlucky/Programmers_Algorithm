class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //char[] charArr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        int sum  = 0;
        for (char c : my_string.toCharArray()) {
            //숫자라면 sb에 저장.
            if (Character.isDigit(c)) {
                sb.append(c);
            } else { //숫자가 아니고, 문자열의 마지막이 숫자라면 숫자로 변환하여 합산
                if (sb.length() > 0) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);  // number 초기화
                }
            }
        }  
        //문자열 끝까지 돌면서 문자열의 끝부분이 숫자로 끝나는 경우,
        // 문자열을 만나는 것이 안되기 때문에 따로 합산을 해줘야 함.
        if(sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }
        return sum;
    }
}