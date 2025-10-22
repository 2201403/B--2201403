import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("구의 반지름을 입력하시오 : ");
        int r = keyboard.nextInt();

        double pi = 3.141592;
        double volume = (4.0 / 3.0) * pi * r * r * r;
        double Area = 4.0 * pi * r * r;

        System.out.println();
        System.out.println("반지름이 " + r + "인 구의 부피는 " + volume + "입니다.");
        System.out.println("반지름이 " + r + "인 구의 표면적은 " + Area + "입니다.");

        keyboard.close();
    }
}
