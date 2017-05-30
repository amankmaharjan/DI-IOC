package LooselyCoupled;

/**
 * Created by aman on 5/30/17.
 */
public class Main {
    public static void main(String[] args) {
        P p = new P();
        Q q = new Q();
        R r = new R();

        A a1 = new A(p);
        a1.display();

        A a2 = new A(q);
        a2.display();

        A a3 = new A(r);
        a3.display();

    }
}
