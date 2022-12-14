import java.util.Scanner;

public class ltjava_ifquiz {
    public static void main(String[] ages) {
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 적어주세요");
        year = sc.nextInt();

        boolean isLeapYear = test(year);

        System.out.printf("%d년은 윤년입니까? %s\n", year, isLeapYear);
    }

    public static boolean test(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            result = true;
            if (year % 100 == 0) {
                result = false;
                if (year % 1000 == 0) {
                    result = true;
                }
            }
        }
        return result;
    }
}
