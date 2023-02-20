package quoters;

// Implementation for interface Quoter needs to be set explicitly, because method "getInterfaces()" returns only
// immediately implemented interfaces.
public class T1000 extends TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("*** I AM LIQUID! ***");
    }
}
