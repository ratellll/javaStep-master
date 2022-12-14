import java.util.Scanner;

public class ltjava_printf {
    public static void main(String[] args) {

        String title = "로미오와 줄리엣";
        String author = "윌리엄 셰익스피어";
        double price = 5.94;

        System.out.printf("제목: %s\n", title);
        System.out.printf("저자: %s\n", author);
        System.out.printf("가격: $%.2f\n", price);



        System.out.println("====================");
        // 소수점 이하 2자리까지 출력 => 3.14
        double pi = 3.14159265;
        System.out.printf("%.2f\n", pi);
       // 소수점 이하 5자리까지 출력 => 3.14159
        double pi1 = 3.14159265;
        System.out.printf("%.5f\n", pi1);

        //---------------------캐스팅, 실수를 정수로
        System.out.println("====================");
        double tall = 176.4;
        double weight = 82.34;

        /* 1. 실수형 변수를 정수로 캐스팅하여 출력하시오. */
        System.out.printf("신장: %dcm\n", (int)tall);
        System.out.printf("체중: %dkg\n", (int)weight);

        System.out.println("====================");
        // 변수 생성
        String strSeven = "7";
        String strPi = "3.14";

        // 형변환: 문자열 => 숫자
        int a = Integer.parseInt(strSeven);
        double b = Double.parseDouble(strPi);

        // 숫자 계산
        double c = a + b;

        // 결과 출력
        System.out.printf("%d + %.2f = %.2f", a, b, c);

        System.out.println("====================");





    }
}
