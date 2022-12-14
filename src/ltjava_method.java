public class ltjava_method {
            public static void main(String[] args) {
            // 변수 생성
            int n = 5;

            // 메소드 호출을 통한 값 계산
            int x = cube(n);

            // 결과 출력
            System.out.printf("%d의 네제곱 => %d", n, x);
                System.out.println("====================================");
        }

        public static int cube(int n) {
            // 변수 생성
            int result;

            /* 2. 세제곱을 계산하시요 */
            result = n*n*n*n;

            // 값 반환
            return result;
        }







    }