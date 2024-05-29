// class Tv{ 
//     String color;
//     boolean power;
//     int channel;
    

//     void power() { power=!power;}
//     void channelup() {++channel;}
//     void channeldown() { --channel;}
// }

// class Test {
//     public static void main(String[] args) {
//         int b;
//         int c;
//         Tv t1=new Tv();
//         Tv t2=new Tv();
//         //Tv t3=new Tv();
//         System.out.println("t1의 channel값은"+t1.channel+"입니다");
//         System.out.println("t2의 channel값은"+t2.channel+"입니다");
        
//         b=System.identityHashCode(t1); //t1의 주소값 확인
//         c=b;
//         System.out.println(c);
//         t1.channel=3;
//         System.out.println(b);
//         b=System.identityHashCode(t2); //t2의 주소값 확인
//         System.out.println(b);
//         t1=t2;
//         b=System.identityHashCode(t1); //t1의 주소값 확인
//         System.out.println(b); 
//        // t1=c; //가비지 컬렉터 확인
//         System.out.println(t1.channel);
        
//         t1.channel=7;
//         System.out.println(t1.channel);
//         System.out.println("t1의 channel을 7로 변경");

//         System.out.println("t1의 channel값은"+t1.channel+"입니다");
//         System.out.println("t2의 channel값은"+t2.channel+"입니다");
//     }
// }

class Tv{
    boolean power;
    int channel;

    void power() { power =! power; }
    void channelup() { ++channel; }
    void channeldown() { --channel; }
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class Test {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelup();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true;
        ctv.displayCaption("Hello, world");
    }
}
