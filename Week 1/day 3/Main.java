class Ex {
    int a, b;

    public void accept(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void cal(Ex e1) {
        System.out.println(this.a + e1.a);
        System.out.println(this.b + e1.b);
    }
}

public class Main {
    public static void main(String[] args) {
        // Example ex1 = new Example();

        // Example.display();
        Ex e1 = new Ex();
        Ex e2 = new Ex();
        e1.accept(10, 20);
        e2.accept(5, 7);
        // System.out.println(e1.a + e2.a);
        // System.out.println(e1.b + e2.b);
        e2.cal(e1);

    }
}
