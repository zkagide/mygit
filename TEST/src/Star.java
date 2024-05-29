import java.lang.Math;
public class Star {
 
    public static void main(String[] args) {
        //1번
        // for (int i=0;i<5;i++){
        //     for (int j=i+1;j>0;j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        //2번
        // for (int i=5;i>0;i--){
        //     for (int j=i;j>0;j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        //3번
        // for (int i=1;i<6;i++){
        //     for (int j=i+1;j<6;j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k=i;k>0;k--){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        //4번
        // for (int i=1;i<6;i++){
        //     for (int j=i-1;j>0;j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k=i;k<6;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        // }
        //5번
        for (int i = 1; i <= 5; i++) {
            for (int j = i-i; j < Math.abs(3 - i); j++) {
                System.out.print(" ");
            }
            for (int k = i-(i-1); k <= -2*Math.abs(3 - i)+5; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //6번
        // for (int i=1; i<=5; i++) {
        //     for(int j=i-i; j < -1*Math.abs(3-i)+2; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int k=i-(i-1); k <= 2*Math.abs(i-3)+1; k++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
    }
    
}
