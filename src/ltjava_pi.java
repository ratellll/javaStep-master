public class ltjava_pi {
    public static void main(String[] args) {
        // 변수 생성
        double r = 10.0;
        double h = 8.0;

        // 부피 계산
        double v = volume(r, h);

        // 결과 출력
        System.out.printf("반지름이 %.3f, 높이가 %.1f인 원기둥의 부피: %.3f", r, h, v);
    }

    // 반지름과 높이를 입력받아 원기둥의 부피를 반환
    public static double volume(double r, double h) {
        return Math.PI*r*r*h; /* 2. _RETURN_VALUE_ */
    }



    }

