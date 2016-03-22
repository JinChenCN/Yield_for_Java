package se701;

public class StudentSample {

    public static void cj() {
        System.out.println("Execution3 started");
        //yieldBlock is null!
        System.out.println("Execution3 ended");
    }

    public static void main(String[] args) {
        sampleMethod();
        sampleMethod2();
        cj();
    }

    public static void sampleMethod() {
        System.out.println("Execution started");
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }

        System.out.println("Execution ended");
    }

    public static void sampleMethod2() {
        System.out.println("Execution2 started");
            System.out.println("test cj");

        System.out.println("Execution2 ended");
    }
}
