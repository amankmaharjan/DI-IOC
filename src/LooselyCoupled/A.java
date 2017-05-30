package LooselyCoupled;

/**
 * Created by aman on 5/30/17.
 */
public class A {
    D d;

    A(D d) {
        this.d = d;
    }

    public void display() {
        d.display();
    }
}
