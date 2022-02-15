public class Lesson
{
    public static void main(String[] args) {
        int a = 1+1;
        int b = a*3;
        int c = b/4;

        a=c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double da = 1+1;
        double db = da*3;
        double dc = b/4d;

        System.out.println(da);
        System.out.println(db);
        System.out.println(dc);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        int aa = 1;
        int bb = 2;
        int cc;
        int dd;
        cc = ++bb;
        dd = aa++;
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("cc = " + cc);
        System.out.println("dd = " + dd);


    }
}
