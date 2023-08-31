import java.util.*;

class Solution {
    
        static class Music {
        String genre;
        int play;
        int idx;
        
        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        //장르별 점수 총합 계산
       HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }        
        
        //장르 정렬(최대값 로직을 이용하여 )
        List<String> genres_ordered = new ArrayList<>();
        while(map.size() != 0) {
            int max = Integer.MIN_VALUE; 
            String max_key = "";
            
            for(String key : map.keySet()){
                int temp_val = map.get(key);
                if(temp_val > max) {
                    max = temp_val;
                    max_key = key;
                }
            }
            genres_ordered.add(max_key);
            map.remove(max_key);
        }
        // 장르 내 노래 선정
List<Music> result = new ArrayList<>();  // 최종 결과를 저장할 리스트
for(String x : genres_ordered) {  // 각 장르에 대해서 순회
    
    // 해당 장르에 속하는 음악만을 저장할 리스트
    List<Music> list = new ArrayList<>();
    
    // 모든 장르를 검사하여 현재 장르(x)와 일치하는 음악을 찾음
    for(int i=0; i<genres.length; i++) {
        if(genres[i].equals(x)){
            list.add(new Music(x, plays[i], i));  // 일치하는 음악을 리스트에 추가
        }
    }
    
    // 리스트를 play 횟수에 따라 내림차순으로 정렬
    Collections.sort(list, (o1, o2) -> o2.play - o1.play);
    
    // 가장 많이 재생된 음악을 결과에 추가
    result.add(list.get(0));
    
    // 만약 해당 장르에 음악이 1개보다 많다면, 두 번째로 많이 재생된 음악도 결과에 추가
    if(list.size() != 1) {
        result.add(list.get(1));
    }
}

        // print result
        answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i).idx;
        }
        
        return answer;
    }
    

    
}