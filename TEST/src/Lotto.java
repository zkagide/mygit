//0차
// import java.util.Random;

// public class lotto {
//     public static void main(String[] args) {
//         int[] Lotto = new int[6];
//         Random random = new Random();
//         for (int i=0; i<6; i++) { //난수 생성
//             int rd = random.nextInt(45)+1;
//             for(int j=0; j<i; j++) { //중복 제거를 어떻게 해야될까요?
//                 if (Lotto[j]==rd) {
//                     continue;
//                 }
//             }
//          Lotto[i]= rd;
//         }
//         for (int rd : Lotto) {
//             System.out.print( rd + " ");
//         }
//         System.out.println(Lotto.length);
//     }

// }
//1차
// import java.util.Random;

// public class Lotto {
//     public static void main(String[] args) {
//         int[] Lotto = new int[6];
//         Random random = new Random();
//         for (int i = 0; i < Lotto.length; i++) { // 난수 생성
//             int rd;
//             do { //while의 조건문이 true일 떄 rd 반복 ->난수 생성 false일때 반복 종료 -> Lotto[]에 난수 대입
//                 rd = random.nextInt(45) + 1;
//             } while (aa(Lotto, rd)); // 중복 확인
//             Lotto[i] = rd;
//         }
//         for (int rd : Lotto) {
//             System.out.print(rd + " ");
//         }
//         System.out.println(Lotto.length);
//     }
// //------------------------------------------------------------------------------------------------
//     // 배열에서 중복된 값이 있는지 확인하는 함수(메서드)
//     public static boolean aa(int[] array, int value) {
//         for (int num : array) { //num의 모든 요소 출력한다.
//             if (num == value) {
//                 return true; //중복이 있으면 true 없으면 false -> false일때 실행x?
//             }
//         }
//         return false;
//     }
// } //게임 출력 갯수 입력 받고 i개의 게임 셋트 출력(i번 : ~), 중복검사 최악일 경우 중복이 계속 될 경우 : 난수 출력하면 전체에서 빠지게 ->중복검사 없이 실행하기 

//2차
// import java.util.Random;
// import java.util.Scanner;
// import java.util.Arrays;

// public class Lotto {
//     public static void main(String[] args) {
//         int a;
//         Scanner sca = new Scanner(System.in);
//         System.out.print("게임 출력 갯수 입력: ");
//         a = sca.nextInt(); //n번 게임 입력
//         int[] Lotto = new int[6];
//         Random random = new Random();

//         for (int i=0; i<a; i++) { //n번째까지 숫자 출력
//             for (int j=0; j<Lotto.length; j++){
//                 Lotto[j] = random.nextInt(45)+1;
//                 for (int k=0; k<j; k++){
//                     if(Lotto[j]==Lotto[k]){
//                         j--;
//                         break;
//                     }
//                 } 
//             }
//             Arrays.sort(Lotto);
//             for (int rd : Lotto) {
//                 System.out.print(rd + " ");
//         }
//         System.out.println(" ");
//         System.out.println("숫자 갯수 :" + Lotto.length);
//         }
//         sca.close();
//     }
// }
//2-2차
// import java.util.Random;
// import java.util.Scanner;
// import java.util.Arrays;

// public class Lotto {
//     public static void main(String[] args) {
//         int a;
//         Scanner sca = new Scanner(System.in);
//         System.out.print("게임 출력 갯수 입력: ");
//         a = sca.nextInt(); // n번 게임 입력
//         int b = 1; // 게임 번호 변수
//         int[] Lotto = new int[6];
//         Random random = new Random();
//         while (a > 0) {
//             for (int i = 0; i < Lotto.length; i++) {
//                 Lotto[i] = random.nextInt(45) + 1; //난수 생성 후 Lotto에 대입
//                 //밑에 방법 없이 하는 방법 생각해보기
//                 for (int j = 0; j < i; j++) {
//                     if (Lotto[i] == Lotto[j]) { //중복 제거
//                         i--;
//                         break;
//                     }
//                 }
//             }
//             Arrays.sort(Lotto); //오름차순 정렬
//             System.out.print(b + "번째: ");
//             for (int i = 0; i < Lotto.length; i++) {
//                 System.out.print(Lotto[i] + " ");
//             }
//             System.out.println(); 
//             b++;
//             a--; 
//         }
//         sca.close(); 
//     }
// }

//2-3차
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Random;
// import java.util.Scanner;

// public class Lotto {
//     public static void main(String[] args) {
//         int a, b;
//         int[] num = new int[45];
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();

//         System.out.print("게임 횟수 입력: ");
//         a = scanner.nextInt();

//         for (int i = 0; i < 45; i++) { //1~45까지 배열에 대입
//             num[i] = i + 1;
//         }
//         //remove를 쓰기 위해 integer를 list로 변환
//         List<Integer> numList = new ArrayList<>(Arrays.asList(Arrays.stream(num).boxed().toArray(Integer[]::new)));

//         while (a > 0) {
//             for (int i = 0; i < 6; i++) {
//                 b = random.nextInt(numList.size());
//                 System.out.print(numList.get(b) + " ");
//                 numList.remove(b); // 뽑은 숫자 제거
//             }
//             System.out.println();
//             a--;
//         }
//         scanner.close();
//     }//배열을 섞어서 앞에서 6개 뽑기
// }
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        int a, b, c;
        int[] num = new int[45];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("게임 횟수 입력: ");
        a = scanner.nextInt();

        for (int i = 0; i < 45; i++) { // 1~45까지 배열에 대입
            num[i] = i + 1;
        }
        while (a > 0) { // 게임 횟수만큼 실행
            c = 0; 
            while (c < 1000) { // 1000번 섞음 = 난수
                b = random.nextInt(num.length);
                if (b != 0) {
                    int tmp = num[0];
                    num[0] = num[b];
                    num[b] = tmp;
                }
                c++;
            }
            System.out.println(a+"번째 게임" );
            for (int i = 0; i < 6; i++) {
                System.out.print(+num[i] + " ");
            }
            System.out.println(" ");
            a--;
        } // 배열을 섞어서 앞에서 6개 뽑기
        scanner.close();
    }
}