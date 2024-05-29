// import java.util.Random;
// import java.util.Scanner;

// public class Seven {
//     public static void main(String[] args) {
//         int a, b;
//         Random random =new Random();
//         a=random.nextInt(100);
//         System.out.println(a);
//         Scanner scanner = new Scanner(System.in);

//         for (int i=1; i<8; i++) {
//             System.out.println("숫자 입력: ");
//             b=scanner.nextInt();
//             if (a==b && i==7) {
//                 System.out.println("정답입니다"+ " " +i +"번째");
//                 break;
//             }else if (i==7) {
//                 System.out.println("게임이 끝났습니다" + " " +i + "번째");
//                 break;
//             }else if (a<b) {
//                 System.out.println("입력한 수가 더 큽니다" + " " +i + "번째");
//             } else if (a>b) {
//                 System.out.println("입력한 수가 더 작습니다"+" " +i+"번째");
//             } else if (a==b) {
//                 System.out.println("정답입니다");
//                 break;
//             } 

//         }
//         scanner.close();
//     }

// }//3번안에 맞출 경우 천재, 5번안에 맞출경우 good, 7번안에 맞출경우 낫베드, 못 맞췄을 경우 정답 알려주기, 입력시에 i번째 도전인지 출력, while로 변경

// import java.util.Random;
// import java.util.Scanner;

// public class Seven {
//     public static void main(String[] args) {
//         int a, b,i=1;
//         Random random =new Random();
//         a=random.nextInt(100); //a에 난수 대입
//         System.out.println(a);
//         Scanner scanner = new Scanner(System.in);
//         // System.out.print("게임 횟수 입력: ");
//         // c =scanner.nextInt();

//         while (i<8){
//             System.out.print(i+"번째 도전, "+"숫자를 입력하세요: ");
//             b = scanner.nextInt();
//             if (a<b) {
//                 System.out.println("입력한 수가 더 큽니다");}
//             else if (a>b    ) {
//                 System.out.println("입력한 수가 더 작습니다"); }
//             else if (i<=3 && b==a) {
//                 System.out.println(i+"번째로 맞췄습니다 천재입니다");
//                 break; 
//                 }
//             else if (i<=5 && b==a) {
//                 System.out.println(i+"번째로 맞췄습니다 good");
//                 break; }
//             else if (i<=7 && b==a) {
//                 System.out.println(i+"번째로 맞췄습니다 Not bad");
//                 break; }
//             i++;
//         }
//         System.out.println("게임이 끝났습니다. 정답은"+a+"입니다.");
//         scanner.close();
//     } //do while로 고치기.
// }

// import java.util.Random;
// import java.util.Scanner;

// public class Seven {
//     public static void main(String[] args) {
//         int a, b,i=1;
// Random random =new Random();
// a=random.nextInt(100); //a에 난수 대입
// System.out.println(a);
//         Scanner scanner = new Scanner(System.in);
//         // System.out.print("게임 횟수 입력: ");
//         // c =scanner.nextInt();

//         do {
//             System.out.print(i + "번째 도전, 숫자를 입력하세요: ");
//             b = scanner.nextInt();
//             if (a < b) {
//                 System.out.println("입력한 수가 더 큽니다");
//             } else if (a > b) {
//                 System.out.println("입력한 수가 더 작습니다");
//             } else {
//                 if (i <= 3) {
//                     System.out.println(i + "번째로 맞췄습니다! 천재입니다!");
//                 } else if (i <= 5) {
//                     System.out.println(i + "번째로 맞췄습니다! Good!");
//                 } else if (i <= 7) {
//                     System.out.println(i + "번째로 맞췄습니다! Not bad!");
//                 }
//                 break;
//             }
//             i++;
//         } while (i <= 8);
//         System.out.println("게임이 끝났습니다 정답은 "+a+" 입니다.");
//         scanner.close();
//     } //do while로 고치기. /3번안에 맞출 경우 천재, 5번안에 맞출경우 good, 7번안에 맞출경우 낫베드, 못 맞췄을 경우 정답 알려주기, 입력시에 i번째 도전인지 출력, while로 변경
// } // 역할 분담, 여태까지 조건 + 재도전 여부(Y,N)->Y 누를 시 다시 시작, N = 종료
//--> 입력 후 값 출력 클래스 생성, 재도전 여부 

import java.util.Random;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int a, b;
        char y;
        boolean again = true;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (again == true) {
            a = random.nextInt(100)+1; // a에 난수 대입
            System.out.println(a);
            int i = 1;
            do {
                System.out.print(i + "번째 도전입니다, 숫자를 입력하세요: ");
                b = scanner.nextInt();
                if (a < b) {
                    System.out.println("입력한 수가 더 큽니다");
                } else if (a>b) {
                    System.out.println("입력한 수가 더 작습니다");
                } else {
                    break;
                }
                i++;
            } while (i < 9 || a == b);

            switch (i % 10) {
                case 1:
                case 2:
                case 3:
                    System.out.println(i + "번째로 맞췄습니다! 천재입니다!");
                    break;
                case 4:
                case 5:
                    System.out.println(i + "번째로 맞췄습니다! Good!");
                    break;
                case 6:
                case 7:
                    System.out.println(i + "번째로 맞췄습니다! Not bad!");
                    break;
                case 8:
                case 9:
                    System.out.println("정답을 못 맞췄습니다. 정답은" + a + "입니다");
                    break;
            }
            System.out.println("다시 하시겠습니까? Y(y), N(n)");
            y = scanner.next().charAt(0);
            if (y=='Y' || y=='y') {
                again = true;
            }else {
                again = false;
            }
        }
        scanner.close();
    }
}