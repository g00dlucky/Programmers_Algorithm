class Solution {
		public int[] solution(int[] arr) {
			int[] answer = new int[arr.length];

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					int a = arr[i] / 2;
					answer[i] = a;
				} else if (arr[i] <= 50 && arr[i] % 2 == 1) {
					int a = arr[i] * 2;
					answer[i] = a;
				} else {
					answer[i] = arr[i];
				}
			}
			return answer;
		}
	}