// public class Test2 {
//     public static void main(String[] args) {
// int a=0,b=100,c,d,e,f=3;

// while(b<1000) {
// c=b/100;
// d=(b%100)/10;
// e=b%10;
// if(b==Math.pow(c,f)+Math.pow(d,f)+Math.pow(e,f)) {
// a++;
// System.out.println("["+a+"]"+" -> "+ b);
// }
// b++;

// }
// System.out.print("나르시스트수의 갯수 : " + a);

// 3n+1 콜라츠 추측
public class Test2 {
    public static void main(String[] args) {
        int b = 2;
        while (true) {
            int a = 0;
            int num = b;
            while (num != 1) {
                if (num % 2 == 1) {
                    num = num * 3 + 1;
                } else {
                    num = num / 2;
                }
                a++;
                System.out.println("b :"+b);
                System.out.println("a :"+a);
                System.out.println("num :" +num);
            }
            if (a == 100 && num==1) {
                System.out.println(b);
                break;
            }
            b++;
        }
    }
}