public class ltjava_wrongpa {
    public static void main(String[] args) {
        int a = square((int) 3.0);
        int b =(int) cube(2);
        //(int)가 앞에붙는건 메소드가 호출된후값(dobule로 계산된값)을 받아오기때문에 출력직전 int로변환시켜주는것
        System.out.printf("a = %d, b = %d\n", a, b);
    }

    public static int square(int n) {
        return n * n;
    }

    public static double cube(double n) {
        return n * n * n;
    }
    /*
     int a = square((int) 3.0);
     int b = (int) cube(2);
    System.out.printf("a = %d, b = %d\n", a, b);
  }
  public static int square(int n) {
    return n * n;
  }
  public static double cube(double n) {
    return n * n * n;
  }
     */
}

