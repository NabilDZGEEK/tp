public class Philosophe extends Thread{
    private JTupleSpace table;
    private String nom;
    private JTuple fg,fd;

    public Philosophe(String n,JTupleSpace t,JTuple g,JTuple d){
        nom=n;
        table=t;
        fg=g;
        fd=d;
    }
    public void run(){
        while(true){
            reflichir();
            table.EXT(fg);
            table.EXT(fd);
            manger();
            table.ECR(fg);
            table.ECR(fd);

        }
    }
    public void manger(){
        System.out.println(nom+" mange");
    }
    public void reflichir(){
        try {
            System.out.println(nom+" réflichi...");
            Thread.sleep((long) (Math.random()*5000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
