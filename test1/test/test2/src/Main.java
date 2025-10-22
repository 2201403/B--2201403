import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("시간 입력 : ");
        double time = keyboard.nextDouble();

        int totalSeconds = (int)(time * 3600);
        int days = totalSeconds / 86400;
        int hours = (totalSeconds % 86400) / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println();
        System.out.println(time + " 시간은 " + days + " 일 " + hours + " 시간 "
                + minutes + " 분 " + seconds + " 초 입니다.");

        keyboard.close();
    }
}
