public class ltjava_void {
    public static void main(String[] args) {
        buy();
        boil();
        put();
        eat();
    }

    //void 메소드
    //void 메소드는 자신이 일을 시작하고 마무리합니다.
    //
    //return 메소드
    //반면 리턴값이 있는 메소드는, 일의 중간 계산을 처리하고 이를 반환합니다.
    public static void boil() {
        System.out.println("물을 끓인다.");
    }

    public static void buy() {
        System.out.println("라면을 사온다.");
    }

    public static void eat() {
        System.out.println("맛있게 먹는다.");
    }

    public static void put() {
        System.out.println("라면을 넣는다.");
    }
}