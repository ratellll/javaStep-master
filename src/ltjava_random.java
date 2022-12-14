public class ltjava_random {
    public static void main(String[] args) {
        // 메소드로부터 값을 반환
        int x = rollDie();

        // 결과 출력
        System.out.printf("주사위의 눈: %d", x);
    }

    // 1~6 사이의 임의의 정수를 반환
    public static int rollDie() {
        double rd =Math.random();

        //math.random 메소드는 기본적으로 1.0으로 가져오기떄문에 double로 받고 int로 변환해준디 원하는숫자를 곱하거나 더한다
        //ex)double x = Math.random(); // 0.0 <= x < 1.0
        int rdc = (int) (rd*6);
        return rdc+1;
    }
    }

