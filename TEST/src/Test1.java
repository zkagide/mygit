// class Data{ int x; }

// public class Test1 {
//     public static void main(String[] args) {
//         Data d= new Data(); // 객체 생성
//         d.x = 10; //x는 기본형이기 때문에 값인 10 저장
//         System.out.println("main(): x ="+d.x);

//         change(d.x); //함수 실행 했지만 기본형이기 때문에 주소가 변하지 않아 값의 변화 없이 10 출력
//         System.out.println("change");
//         System.out.println("main() : x =" + d.x);
//     }

//     static void change(int x){
//         x = 1000;
//         System.out.println("change x:"+x);
//     }
// }

// public class Test1 {
//     public static void main(String[] args) {
//         int[] x= {10}; //배열 x는 참조형이라 주소값 저장
//         System.out.println("main(): x ="+x[0]);

//         change(x); //함숫 실행시 x가 가지는 주소값이 10에서 1000으로 변하기 때문에 변화된 값 1000 출력
//         System.out.println("change");
//         System.out.println("main() : x =" + x[0]);
//     }

//     static void change(int[] x){
//         x[0] = 1000;
//         System.out.println("change x:"+x[0]);
//     }
// }

// class Data { int x , y; }

// class Test1 { 
//     public static void main(String[] args) {
//         Data d = new Data();
//         d.x = 10;
//         d.y =20;

//         Data d2 = copy(d);
//         System.out.println("d.x ="+d.x);
//         System.out.println("d2.x =" +d2.x);
//     }

//     static Data copy(Data d) {
//         Data tmp = new Data();
//         tmp.x = d.x;
//         System.out.println(tmp);
//         tmp.x =d.y;
//         System.out.println(tmp);
//         return tmp;
//     }
// }
// class Math2{
//     long a,b; //a,b는 인스턴스변수

//     long add() { return a+b; }
//     long subtract() { return a-b; }
//     long multiply() { return a*b; }
//     long divide() { return a/b; }
//     //클래스메서드 생성(클래스이름.메서드이름) -->인스턴스 변수를 사용할 수 없기 때문에 매개변수가 필요하다
//     static long add(long a, long b) { return a+b; }
//     static long subtract(long a, long b) { return a-b; }
//     static long multiply(long a, long b) { return a*b; } 
//     static long divide(long a, long b) { return a/b; }

// }

// public class Test1 {
//     public static void main(String[] args) {
//         System.out.println(Math2.add(200L, 100L));
//         System.out.println(Math2.subtract(200L, 100L));
//         System.out.println(Math2.multiply(200L, 100L));
//         System.out.println(Math2.divide(200L, 100L));

//         Math2 mm =new Math2();
//         mm.a = 200L;
//         mm.b = 100L;

//         System.out.println(mm.add());
//         System.out.println(mm.subtract());
//         System.out.println(mm.multiply());
//         System.out.println(mm.divide());
//     }
// }

// //클래스메서드에서는 인스턴스변수 사용 불가 but 인스턴스메서드에서는 클래스변수 사용가능 
// //왜? : 인스턴스멤버가 존재할 경우 클래스멤버는 항상 존재 하지만 클래스멤버가 존재할 경우 인스턴스멤버의 존재 여부 확인 불가능 ( 클래스멤버 > 인스턴스멤버) 필요충분조건 X
// class MemberCall {
//     int iv = 10; //인스턴스변수
//     static int cv = 20; //클래스변수

//     int iv2 = cv;
//     // static int cv2 = iv; //클래스변수는 인스턴스변수 사용 불가 -> new()를 통해 인스턴스를 하나 만든 후 사용가능
//     static int cv2 = new MemberCall().iv;

//     static void staticMethod1() { //클래스 메서드인 staticMethod 생성
//         System.out.println(cv);
//         // System.out.println(iv); //클래스메서드에 인스턴스변수 사용불가능
//         MemberCall c = new MemberCall();
//         System.out.println(c.iv);
//     }

//     void instanceMethod1() { //인스턴스메서드인 instanceMethod 생성
//         System.out.println(cv);
//         System.out.println(iv);
//     }

//     static void staticMethod2() {
//         staticMethod1();
//         // instanceMethod1();  //클래스메서드에서 인스턴스변수 호출 불가능
//         MemberCall c = new MemberCall();
//         c.instanceMethod1();
//     }

//     void instanceMethod2() {
//         staticMethod1();
//         instanceMethod1();
//     }
// }

// 아래 메서드들 모두 오버로딩 됨
// int add(int a, int b) { return a+b; }
// long add(long a, long b ) { return a+b; }
// int add(int[] a){
//     int result =0;
//     for (int i=0; i<a.length; i++) {
//         result +=a[i];
//     }
//     return result;
// }

// class Data1 {
//     int vaule;
// }

// class Data2 {
//     int vaule;
//     Data2(int x) {
//         value =  x;
//     }
// }
// class Test1 {
//     public static void main(String[] args) {
//         Data1 d1 = new Data1(); //Data1에는 생성자가 없기 때문에 자동으로 생성자가 만들어짐
//         // Data2 d2 = new Data2(); //Data2에는 Data2(int x)라는 매개변수가 있는 생성자가 있기 때문에 오류를 피하기 위해서는 new Data2()의 괄호 안에 x값을 넣어주거나 Data2에 생성자를 추가 정의한다.
//         Data2 d2 = new Data2(10);
//     }   
// } String[] : 특수한 클래스형태

// class Product {
//     static int count=0;
//     int serialNo;

//     {
//         ++count;
//         serialNo = count;
//     }
//     public Product() {}
// }

// class Test1 {
//     public static void main(String[] args) {
//         Product p1 =new Product();
//         Product p2 =new Product();
//         Product p3 =new Product();

//         System.out.println("p1의 제품번호(serial no)는"+p1.serialNo);
//         System.out.println("p2의 제품번호(serial no)는"+p2.serialNo);
//         System.out.println("p3의 제품번호(serial no)는"+p3.serialNo);
//         try {
//             throw new Exception("예외 발생");
//         // } catch (Exception e) {
//         //     System.out.println(e.getMessage());
//         //     e.printStackTrace();
//         // }
//         System.out.println("생산된 제품의 수"+Product.count); //예외 발생 이후의 코드이기 때문에 실행이 안되는 코드
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//             e.printStackTrace();
//     }
//     }
// }

// class Person { 
//     long id;
//     public boolean equals(Object obj) {
//         if (obj instanceof Person)
//             return id == ((Person)obj).id;
//         else
//             return false;
//     }
//     Person(long id){ this.id=id;}
// }
// class Test1{
//     public static void main(String[] args) {
//         Person p1 = new Person(8001L);
//         Person p2 = new Person(8002L);
//         System.out.println(p1);

//         if (p1==p2){
//             System.out.println("p1과 p2는 동일");
//         } else {
//             System.out.println("다르다");
//         }    
        
//         if(p1.equals(p2)) {
//             System.out.println("같음");
//         }else {
//             System.out.println("다다름");}
//     }
// }
class Point implements Cloneable{
    int x,y;

    Point( int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "x="+x+",y="+y;
    }
    public Point clone() {
        Object obj = null;
        try{
            obj = super.clone();
        } catch(CloneNotSupportedException e) {}
        return (Point)obj;
    }
}
class Test1 {
    public static void main(String[] args) {
        Point original = new Point(3,5);
        Point copy = (Point)original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}