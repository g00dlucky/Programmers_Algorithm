class Solution {
    public long solution(int[] num_list) {
        long answer = 0;
        int a = 1;
        
        for(int j = 0; j < num_list.length; j++) {
            if(num_list[j] >=1 && num_list[j] <=9) {
                if(num_list.length >= 2 && num_list.length <= 20) {

                        if(num_list.length>=11) {

                            answer += num_list[j];

                        } else {

                            a *= num_list[j];
                            answer = a;
                        }
                }
            }
        }
        return answer;
    }
}

// class Solution {
//     public int solution(int[] num_list) {
//         int length = num_list.length;
        
//         if (length >= 11) {
//             int sum = 0;
//             for (int num : num_list) {
//                 sum += num;
//             }
//             return sum;
//         } else {
//             int product = 1;
//             for (int num : num_list) {
//                 product *= num;
//             }
//             return product;
//         }
//     }
// }
