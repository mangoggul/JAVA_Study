import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class Sample2 {


    int[] odds = {1,3,5,7,9};
    String[] weeks = {"월", "화","수","목","금","토","일"};


    public void stringMethod(){
        String result = "";
        result += "hello";
        result += " ";
        result += "jump to java";
        System.out.println(result);
        Sample2 sample = new Sample2();
        System.out.println(Arrays.toString(odds));
    }


    public static void main(String[] args){
        ArrayList<String> pitches = new ArrayList<>();
        Sample2 sample = new Sample2();
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        pitches.add("123");
        pitches.add("456");
        String result = sb.toString();
        System.out.println(result);
        System.out.println(pitches.get(1));
        sample.stringMethod();
    }
}
