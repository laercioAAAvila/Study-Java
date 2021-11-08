import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tarefa t1 = new Tarefa(0, 1000);
        t1.setName("Tarefa 1");
        Tarefa t2 = new Tarefa(1000, 2000);
        t2.setName("Tarefa 2");
        Tarefa t3 = new Tarefa(3050, 7088);
        t3.setName("Tarefa 3");


        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t1.getName()+" "+t1.getTotal());
        System.out.println(t2.getName()+" "+t2.getTotal());
        System.out.println(t3.getName()+" "+t3.getTotal());

        System.out.println("Somatorio: "+(t1.getTotal()+t2.getTotal()+t3.getTotal()));
    }
}
