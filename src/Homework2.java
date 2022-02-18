public class Homework2 {
    public static void main(String[] args) {

            System.out.println("The Odd Numbers are:");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }

        System.out.println(" \nThe Even Numbers are:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        // Triangle1
        System.out.println("\nTriangle 1");
        for (int count =0; count < 10; count++)
        {
            for (int j=0; j < count+1; j++)
            System.out.print("*");
            System.out.println();
        }

        //Triangle2
        System.out.println("\nTriangle 2");
        for (int count =11; count >= 0; count--)
        {
            for (int j=0; j < count-1; j++)
            System.out.print("*");
            System.out.println();
        }

        //Triangle3
        System.out.println("\nTriangle 3");
        for(int count = 0; count < 10; count++)
        {
            for(int index=1; index < count+1; index++)
            System.out.print(" ");
            for(int star=10; star > count; star--)
            System.out.print("*");
            System.out.println();
        }

        //Triangle4
        System.out.println("\nTriangle 4");
        for(int count = 10; count > 0; count--)
        {
            for(int index=0; index < count-1; index++)
            System.out.print(" ");
            for(int star=10; star > count-1; star--)
            System.out.print("*");
            System.out.println();
        }


    }
}
