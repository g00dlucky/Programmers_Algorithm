class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] a = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index_list.length; i++) {
            sb.append(a[index_list[i]]);
        }
        answer = sb.toString();
        return answer;
    }
}