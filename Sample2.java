public class Sample2 {

    public void stringMethod(){
        String result = "";
        result += "hello";
        result += " ";
        result += "jump to java";
        System.out.println(result);
    }


    public static void main(String[] args){

        Sample2 sample = new Sample2();
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");

        String result = sb.toString();
        System.out.println(result);

        sample.stringMethod();
    }
}
