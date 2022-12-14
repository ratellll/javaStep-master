import java.util.Scanner;

public class ltjava_meetquiz {
    public static void main(String[] args) {
        // 변수 생성

        Scanner sc = new Scanner(System.in);
        System.out.println("몇명?");
        int person = sc.nextInt();

        // 계산
        double kcal = beef_kcal(person);
        // 출력
        System.out.printf("삼겹살 %d인분: %.2f kcal", person, kcal);
    }
   public static double beef_kcal(int person){
        return 250*person/100.0*7.35;
   }
    }

