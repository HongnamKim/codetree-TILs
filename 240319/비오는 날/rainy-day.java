import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Day[] days = new Day[n];

        int rainyDay = 0;
        LocalDate rainyDate = LocalDate.MAX;
        for(int i = 0; i < n; i++){
            Day day = new Day(sc.next(), sc.next(), sc.next());
            days[i] = day;

            if("Rain".equals(day.weather)){
                if(day.date.isBefore(rainyDate)){
                    rainyDay = i;
                    rainyDate = day.date;
                }
            }
        }

        System.out.println(days[rainyDay].toString());
    }

    static class Day {
        public LocalDate date;
        public String day;
        public String weather;

        public Day(String date, String day, String weather) {
            this.date = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
            this.day = day;
            this.weather = weather;
        }

        @Override
        public String toString() {
            return date.toString() + " " + day + " " + weather;
        }
    }
}