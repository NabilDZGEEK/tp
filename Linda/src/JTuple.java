import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JTuple {
    private List<Object> contenu;

    public JTuple(Object ... o){
        contenu=new ArrayList<>(Arrays.asList(o));
    }
    public boolean match(JTuple t){
        return equals(t);
    }
    public boolean equals(Object o){
        return ((JTuple )o).contenu.equals(this.contenu);
    }

    @Override
    public String toString() {
        return contenu.toString();
    }
}
