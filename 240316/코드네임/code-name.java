import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Score[] scores = new Score[5];

        for(int i = 0; i < 5; i++){
            scores[i] = new Score(sc.next(), sc.nextInt());
        }

        for(int i = 0; i < 1; i++){
            System.out.println(scores[i].toString());
        }
    }

    static class Score {
        private String codeName;
        private int score;

        

        public Score(String codeName, int score){
            this.codeName = codeName;
            this.score = score;
        }

        public String getCodeName(){
            return this.codeName;
        }

        public int getScore() {
            return this.score;
        }

        public String toString(){
            return codeName + " " + score;
        }
    }
}