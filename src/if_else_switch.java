public class if_else_switch {
    public static void main(String[] args) {

        int age = 65;
        int charge;
        if (age < 8) {
            charge = 1000;
            System.out.println("미취학아동 입니다");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("중,고등학생입니다");
        } else if (age >= 60) {
            charge =0;
            System.out.println("경로우대 입니다");
        } else {
            charge = 3000;
            System.out.println("일반인 입니다");
        }
        System.out.println("입장료는" + charge + "입니다");
    }
}
