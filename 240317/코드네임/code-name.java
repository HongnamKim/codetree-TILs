import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Score[] scores = new Score[5];

        for(int i = 0; i < 5; i++){
            scores[i] = new Score(sc.next(), sc.nextInt());
        }

        Score minimumScore = findMinimumScore(scores);
        System.out.println(minimumScore.toString());
    }

    public static Score findMinimumScore(Score[] scores){
        int minimumScore = Integer.MAX_VALUE;
        int minimumIndex = 0;

        for(int i = 0; i < scores.length; i++){
            if(scores[i].getScore() < minimumScore){
                minimumScore = scores[i].getScore();
                minimumIndex = i;
            }
        }

        return scores[minimumIndex];
    }

    public static class Score {
        private String codeName;
        private int score;

        public Score(String codeName, int score) {
            this.codeName = codeName;
            this.score = score;
        }

        public String getCodeName() {
            return codeName;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {

            return this.codeName + " " + this.score;
        }
    }
}