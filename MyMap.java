import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;




public class MyMap { // 클래스 이름 변경
    enum CoffeeType{ //열거형 변수
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public void set(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "E", "L", "L", "O"));
        System.out.println(set);
    }

    public static void main(String[] args) {
        MyMap myMapInstance = new MyMap(); // 클래스 인스턴스 생성
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people")); // "사람" 출력
        System.out.println(map.containsKey("people")); // true 출력

        myMapInstance.set(args); // 인스턴스를 통해 메서드 호출
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);

    }
}
