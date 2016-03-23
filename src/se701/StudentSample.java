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
        sampleMethod();
    }

    public static void sampleMethod() {
        System.out.println("Execution started");
            System.out.println("This is the second time of calling the method.");

        System.out.println("Execution ended");
    }

    public static void test() {
        System.out.println("Execution2 started");
            System.out.println("test cj");

        System.out.println("Execution2 ended");
    }
}
