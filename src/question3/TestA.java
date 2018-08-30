/**
 * There are errors in both the files but you are not allowed to change TestA.java file.
 * In A.java file replace /*
 *
 * TODO: Write method declaration here.
        with method declaration such that
        *on executing TestA class,we get following output:
        *num1=5,num2=10
        *num1=100,num2=200
        *num1=1000,num2=2000
 */

package question3;

public class TestA {
    public static void main(String[] args) {
        A a = new A();
        byte b1 = 5;
        byte b2 = 10;
        a.method1(b1, b2);

        short s1 = 100;
        short s2 = 200;
        a.method1(s1, s2);

        int i1 = 1000;
        int i2 = 2000;
        a.method1(i1, i2);
    }
}
