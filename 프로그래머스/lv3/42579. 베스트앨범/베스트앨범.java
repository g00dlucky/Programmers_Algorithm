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
        //장르 내 노래 선정
        List<Music> result = new ArrayList<>();
        for(String x : genres_ordered) {
            
            List<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++) {
                if(genres[i].equals(x)){
                    list.add(new Music(x,plays[i],i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); // 내림차순 소팅
            result.add(list.get(0));
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