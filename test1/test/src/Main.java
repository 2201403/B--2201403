import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");

        int age = keyboard.nextInt();
        int free;
        if (age >= 18) {
            free = 4000;
        } else if (age >= 13) {
            free = 3000;
        } else if (age >= 7) {
            free = 1000;
        } else {
            free = 0;
        }
        if (free == 0) {
            System.out.println("요금은 무료입니다.");
        } else {
            System.out.println("요금은 " + free + "원 입니다.");
        }
        keyboard.close();
    }
}
