public class if_else_Test {

    public static void main(String[] args) {

        int score = 85;
        char grade;

        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 60) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("점수는"+score+"점 이고 학점은"+ grade+"입니다.");

    }
}
