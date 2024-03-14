import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Meeting meeting = new Meeting();

        meeting.setSecretCode(sc.next());
        meeting.setMeetingPoint(sc.next());
        meeting.setTime(sc.nextInt());

        System.out.println("secret code : " + meeting.getSecretCode());
        System.out.println("meeting point : " + meeting.getMeetingPoint());
        System.out.println("time : " + meeting.getTime());
    }

    static class Meeting {
    private String secretCode;
    private String meetingPoint;
    private int time;

    public Meeting() {}

    public Meeting(String secretCode, String meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public void setSecretCode(String secretCode){
        this.secretCode = secretCode;
    }

    public void setMeetingPoint(String meetingPoint){
        this.meetingPoint = meetingPoint;
    }

    public void setTime(int time){
        this.time = time;
    }

    public String getSecretCode(){
        return this.secretCode;
    }

    public String getMeetingPoint(){
        return this.meetingPoint;
    }

    public int getTime(){
        return this.time;
    }
}
}