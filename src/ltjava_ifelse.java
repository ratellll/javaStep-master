public class ltjava_ifelse {
    public static void main(String[] args) {
        buy(15); // 15세, 담배 구매 시도
        buy(19); // 19세..
        buy(22); // 22세..
    }

    public static void buy(int age) {
        // 변수 생성
        String result = "";

        // 조건에 따른 결과 생성
        if(age>= 19) {
            result = "O";
        } else {
            result = "X";
        }

        // 결과 출력
        System.out.printf("%d세 => 담배판매(%s)\n", age, result);
    }
}
