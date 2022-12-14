public class do_while_test {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        do{
            sum += num;     //합계를 뜻하는 sum에 num을 더하고
            num++;

        } while (num <= 10);  //num값이 10보다 작거나 같을 동안


        System.out.println(sum);

    }
}
