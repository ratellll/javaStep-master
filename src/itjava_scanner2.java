import java.util.Scanner;

public class itjava_scanner2 {
    public static void main(String[] args) {


        String name1;
        String name2;



        Scanner sc = new Scanner(System.in);
        System.out.println("첫번재 주문");
        name1 = sc.next();
        System.out.println("두번재 주문");
        name2 = sc.next();



        System.out.println(name1 + "김밥~");
        System.out.println(name2 + "김밥~");
    }
}
