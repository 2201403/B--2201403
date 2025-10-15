import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;
        char grade;
        char plus = ' '; // 초기값을 ' '로 설정 (D로 할 필요 없음)
        int temp = -1; // temp 변수를 if 블록 바깥에 선언하고 초기화

        System.out.print("점수 입력(0~100) : ");
        score = keyboard.nextInt();


        if (score >= 0 && score <= 100) {
            temp = score / 10; // temp에 값을 할당

            switch (temp) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    plus = ' '; // F는 '+'가 없으므로 공백으로 설정
            }

            // A(90~99), B, C, D 학점에 대해서만 '+' 여부를 결정
            if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D') {

                // 100점은 이미 A+로 확정되거나, A+를 따지는 로직이 분리되어야 함.
                // 여기서는 100점은 제외하고 90점 이상 ~ 99점 이하를 A로 간주하고 로직을 진행

                // 100점인 경우 A+로 확정
                if (score == 100) {
                    plus = '+';
                }
                // 100점은 아니지만 A, B, C, D 학점인 경우
                else {
                    int temp1 = score % 10;
                    switch (temp1) {
                        case 9:
                        case 8:
                        case 7:
                        case 6:
                        case 5:
                            plus = '+';
                            break;
                        default:
                            plus = ' '; // 5점 미만은 '+'가 아님
                    }
                }
            }

            // 점수가 0~100일 때는 무조건 학점을 출력해야 합니다. (if 블록의 끝)
            System.out.printf("점수가 %d이면 학점은 %c%c 입니다.\n", score, grade, plus);

        } else {
            System.err.println("ERROR : 점수는 0~100입니다.");
        }
    }
}