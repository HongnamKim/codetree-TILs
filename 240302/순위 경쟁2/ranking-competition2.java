import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] score = new int[2];

        List<String> hall = new ArrayList<>();

        int changes = 0;

        for(int i = 0; i < n; i++){
            String player = sc.next();
            int point = sc.nextInt();

            if(point == 0){
                continue;
            }

            if(player.equals("A")){ // 점수 반영
                score[0] = score[0] + point;
            } else{
                score[1] = score[1] + point;
            }

            if(score[0] > score[1]){ // A 가 높은 점수
                if(!hall.contains("A")){ // A 가 없는 경우
                    hall.clear();
                    hall.add("A");
                    changes++;
                } else { // B 가 있는 경우 제거
                    hall.remove("B");
                    changes++;
                }
            } else if (score[0] < score[1]) { // B 가 높은 점수
                if(!hall.contains("B")) { // B 가 없는 경우
                    hall.clear();
                    hall.add("B");
                    changes++;
                } else if(hall.contains("A")){ // A 가 있는 경우 제거
                    hall.remove("A");
                    changes++;
                }
            } else { // 동일 점수
                if(!hall.contains("A")){ // A 가 없는 경우
                    hall.add("A");
                    changes++;
                } else{
                    hall.add("B");
                    changes++;
                }
            }
        }

        System.out.println(changes);
    }
}