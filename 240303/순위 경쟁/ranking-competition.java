import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<String> hall = new HashSet<>();
        hall.add("A");
        hall.add("B");
        hall.add("C");
        
        Map<String, Integer> scoreBoard = new HashMap<>();
        scoreBoard.put("A", 0);
        scoreBoard.put("B", 0);
        scoreBoard.put("C", 0);

        int changes = 0;

        for(int i = 0; i < n; i++){
            String player = sc.next();
            int score = sc.nextInt();

            if(score == 0){
                continue;
            }

            scoreBoard.compute(player, (k, v) -> v + score);

            Set<String> topPlayer = new HashSet<>();
            topPlayer.add("A");
            int topScore = scoreBoard.get("A");
            for (Map.Entry<String, Integer> entry : scoreBoard.entrySet()) {
                if(entry.getValue() > topScore){ // 더 높은 플레이어 확인 시
                    topPlayer.clear();
                    topPlayer.add(entry.getKey());
                    topScore = entry.getValue();
                } else if(entry.getValue() == topScore){ // 동일 점수 플레이어 확인 시
                    topPlayer.add(entry.getKey());
                }
            }

            if(!hall.equals(topPlayer)){
                changes++;
                hall = topPlayer;
            }


        }
        System.out.println(changes);
    }
}