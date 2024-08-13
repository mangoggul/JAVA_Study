public class Sample {
    
    int base = 100;
    int height = 185;

    boolean isTall = height > base;



    public void methodOne() {
        System.out.println("This is method One");
        String a = "hello";
        String b = new String("hello");
        System.out.println(a.equals(b));
        System.out.println(String.format("I eat %d apples", 3));
        System.out.println(String.format("I eat %s apples", "five"));

    }


    public static void main(String[] args){
        Sample sample = new Sample();
        System.out.println(7%2);
        if (sample.isTall) {
            System.out.println("키가커용");
        }
        sample.methodOne();
    }

}
