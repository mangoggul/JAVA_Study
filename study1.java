public class study1 { //클래스 명은 파일이랑 이름 같아야


    int a;
    String b = "Hello World";
    //변수 이름은 3가지 규칙 : 변수명은 숫자로 시작 x , _와 $외의 특수문자 x , 자바 키워드는 변수명
    //클래스 멤버 변수는 클래스의 메서드 내에서 초기화 or 변수선언시 초기화

    public study1() { //이거를 메서드라고 함
        a = 1;
        b = "Hello Java";
    }
    public static void main(String[] args){
        study1 instance = new study1(); //메서드 안을 명령문이라고 함
        System.out.println(instance.b);
        System.out.println("hello world");
    }

    public static void main2(String[] args) {
        System.out.println(7%2);
    }
}


//클라스 명은 대문자로 시작하고 명사이다. PascalCase로 짓는다. 암묵적인 룰
class ChocoCookie{}
//메서드 명은 동사이고 소문자로 시작한다. 이 역시 pascalCase를 이용.

