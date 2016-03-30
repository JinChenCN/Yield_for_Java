package se701;

public class StudentSample {

    public static void cj() {
        System.out.println("Execution3 started");
        //yieldBlock is null!
        System.out.println("Execution3 ended");
    }

    public static void main(String[] args) {
        sampleMethod();
        test();
        cj();
        sampleMethodYield1();
        sampleMethodYield2(String a);
        sampleMethodYield3(String b);
    }

    public static void sampleMethod(String a) {
        System.out.println("Execution started");
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        System.out.println("Execution ended");
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

    }

    public static void test() {
        System.out.println("Execution2 started");
        System.out.println("test cj");

        System.out.println("Execution2 ended");
    }
}
