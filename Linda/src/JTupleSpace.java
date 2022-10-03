import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JTupleSpace {
    private List<JTuple> multiensemble;

    public JTupleSpace(JTuple ... t){

        multiensemble=new ArrayList<>(Arrays.asList(t));
    }
    public synchronized  void ECR(JTuple t){
        multiensemble.add(t);
        notifyAll();
    }
    public synchronized  JTuple EXT(JTuple t){
        while(!multiensemble.contains(t)){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        multiensemble.remove(t);
        return t;

    }
    public synchronized JTuple Lec(JTuple t){
        while(!multiensemble.contains(t)){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return multiensemble.get(multiensemble.indexOf(t));
    }

    @Override
    public String toString() {
        return "JTupleSpace{" +
                 multiensemble +
                '}';
    }
}
