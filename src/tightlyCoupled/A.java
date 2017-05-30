package tightlyCoupled;

/**
 * Created by aman on 5/30/17.
 */
public class A {
    D d;

    A() {
        this.d = new P();
    }

    public void display() {
        d.display();
    }
}
