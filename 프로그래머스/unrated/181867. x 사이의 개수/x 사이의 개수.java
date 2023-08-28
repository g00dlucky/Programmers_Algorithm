import java.util.*;

class Solution {
    public List<Integer> solution(String myString) {
        String[] x = {};
        List<Integer> answer = new ArrayList<>();
        
        x = myString.split("x",-1);
        for(String a : x){
            answer.add(a.length());
        }
        return answer;
    }
}

// Java의 String.split 메서드에서 두 번째 인자로 주어지는 값은 "제한"을 의미합니다. 이 제한 값에 따라서 분할의 결과가 달라집니다.

// 제한 값이 0 (또는 주어지지 않을 경우)

// 결과 배열은 trailing empty strings(마지막 빈 문자열들)을 포함하지 않습니다.
// 제한 값이 양수 (예: n)

// 분할은 최대 n개의 부분 문자열을 반환하며, 배열의 길이는 n 이하가 됩니다. 만약 n이 입력 문자열에 있는 구분자의 수보다 작으면, 마지막 원소는 나머지 전체 문자열을 포함합니다.
// 제한 값이 음수 (예: -1)

// 결과 배열은 trailing empty strings도 포함합니다.
// 이 문제에서 "oxooxoxxox" 같은 문자열에서 split("x")만 사용하면, 마지막에 연속된 'x'들에 의해 생성되는 빈 문자열들은 무시됩니다. 하지만 문제의 요구사항으로는 이 빈 문자열들의 길이도 반환 배열에 포함되어야 합니다. 그렇기 때문에 split("x", -1)을 사용하여 trailing empty strings도 포함하게 합니다.