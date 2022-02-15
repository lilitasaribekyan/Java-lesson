public class Homework1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 6;

        if (a > 0 & b > 0 & c > 0) {
            if (a + b > c) {
                System.out.println("It's possible to create a triangle as a + b > c");
            } else if (a + c > b) {
                System.out.println("It's possible to create a triangle as a + c > b");
            } else if (b + c > a) {
                System.out.println("It's possible to create a triangle as b + c > a");
            }
            else
                System.out.println("It's Not possible to create a triangle");
        }
        else
            System.out.println("It's Not possible to create a triangle");
    }
}
