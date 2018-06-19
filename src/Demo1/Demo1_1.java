package Demo1;

public class Demo1_1 {

    int a = 10;
    int b = 40;
    int c = 30;

    void add()
    {
        int d=a+b+c;
        System.out.println("addition of a, b, c is "+d);

    }
    public static void main(String[] args) {
        Demo1_1 obj = new Demo1_1();
        obj.add();
    }
}
