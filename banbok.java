public class banbok {

    public static void main(String[] args) {
        int treehit = 0;
        banbok bb = new banbok();
        while (treehit < 10) {
            treehit++;
            System.out.println("나무를 " + treehit + "번 찍었습니다");
            if (treehit == 10) {
                System.out.println("나무 넘어갑니다잉");
            }
        }
        bb.muhan();
        bb.foreach();
    }

    public void muhan() {
        int cnt = 0;
        while (true) {
            System.out.println("나는 나무다잉");
            cnt++;
            if (cnt == 3) {
                break;
            }
        }
    }

    public void foreach() {
        String[] numbers = {"one", "two", "three"};
        for (String number : numbers) {
            System.out.println(number + " 이건 forEach");
        }

        for(int i =0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
    //for (type 변수명 : iterate) {
    //  body-of-loop
    //}
}
