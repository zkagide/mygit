// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.Random;
// import java.util.Scanner;
// import java.io.BufferedOutputStream;
// import java.io.OutputStreamWriter;
// import java.io.IOException;
// import java.io.FileOutputStream;

// public class Random_N {
//     public static void main(String[] args) {
//         String b;
//         int[] num = new int[10000] ;
//         Random rd = new Random(); 
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("오름차/내림차 입력 ");
//         b = scanner.nextLine(); //오름차/내림차 입력
    
//         for(int i=0; i<num.length; i++) {
//             num[i]=rd.nextInt(10000)+1;
//         }

//         if (b=="오름차") {
//             Arrays.sort(num);
//         } else {
//             Arrays.sort(num, Comparator.reverseOrder());
//         }
//         FileOutputStream ab = new FileOutputStream("C://Users//stone//Desktop//자바 파일 만들기/Random_N.txt");
//         ab.write(num[].getBytes());
        
//         catch (IOException e) {
// 			e.printStackTrace();
//             }

//         }
    
//     }
// }

// import java.util.Arrays;
// import java.util.Random;
// import java.util.Scanner;
// import java.io.FileOutputStream;
// import java.io.IOException;

// public class Random_N {
//     public static void main(String[] args) {
//         String b;
//         int[] num = new int[10000];
//         Random rd = new Random(); 
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("오름차/내림차 입력 ");
//         b = scanner.nextLine(); // 오름차/내림차 입력
    
//         for(int i = 0; i < num.length; i++) {
//             num[i] = rd.nextInt(10000) + 1; // 난수 생성
//         }

//         if (b.equals("오름차")) {
//             Arrays.sort(num); // 오름차 정렬
//         } else {
//             Arrays.sort(num);
//             reverseArray(num);
//         }
//         scanner.close();
// //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         try (FileOutputStream ab = new FileOutputStream("C://Users//stone//Desktop//자바 파일 만들기/Random_N.txt")) {
//             for (int i : num) {
//                 ab.write(String.valueOf(i).getBytes()); //valueOf : String으로 객체로 변환 
//                 ab.write("\n".getBytes());
//             }
// //----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         } catch (IOException e) {
//             e.printStackTrace();
//         }//try~catch : 예외처리 무조건 필요(catch 해당)
//     }

//     public static void reverseArray(int[] arr) { //내림차
//         int start = 0; //처음부분
//         int end = arr.length - 1;  //끝부분
//         while (start < end) { //처음부터 끝으로 가면서 하나씩 비교
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }//sort함수 안에 내림차, 오름차 옵션이 있는지 확인, .sort()-> 내림차순 시간복잡도

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

public class Random_N {
    public static void main(String[] args) {
        String b; // 오름차순 또는 내림차순을 저장할 변수
        int[] num = new int[10000]; // 난수를 저장할 배열
        Random rd = new Random(); // Random 클래스 인스턴스 생성
        Scanner scanner = new Scanner(System.in); // Scanner 인스턴스 생성
        Integer[] tmp =null;

        System.out.print("오름차/내림차 입력: ");
        b = scanner.nextLine(); // 사용자로부터 오름차순 또는 내림차순 입력 받음

        for(int i = 0; i < num.length; i++) {
            num[i] = rd.nextInt(10000) + 1; 
        }

        if (b.equals("오름차")) {
            Arrays.sort(num); 
        } else {
            tmp = Arrays.stream(num).boxed().toArray(Integer[]::new); 
            Arrays.sort(tmp, Collections.reverseOrder());
        }

        scanner.close(); // Scanner 닫기

        // 파일에 정렬된 숫자들을 쓰기
        try (FileOutputStream ab = new FileOutputStream("C://Users//stone//Desktop//자바 파일 만들기/Random_N.txt")) {
            if (b.equals("오름차")) {
                // 오름차순일 때
                for (int i : num) {
                    ab.write(String.valueOf(i).getBytes()); 
                    ab.write("\n".getBytes()); 
                }
            } else {
                // 내림차순일 때
                for (Integer a : tmp){
                    ab.write(String.valueOf(a).getBytes()); 
                    ab.write("\n".getBytes()); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 출력
        }
    }
} //int와 integer의 차이 확인하기
