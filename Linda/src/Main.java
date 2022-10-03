import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JTuple t1=new JTuple(5,4,5,3);
        JTuple t2=new JTuple(6,2,3);
        JTuple t3=new JTuple(7,8,2);
        JTupleSpace ts=new JTupleSpace(t1,t2,t3);

        Philosophe f1=new Philosophe("Philosophe 1",ts,t2,t1);
        Philosophe f2=new Philosophe("Philosophe 2",ts,t3,t2);
        Philosophe f3=new Philosophe("Philosophe 3",ts,t1,t3);

        f1.start();
        f2.start();
        f3.start();
        f1.join();
        f2.join();
        f3.join();
    }
}