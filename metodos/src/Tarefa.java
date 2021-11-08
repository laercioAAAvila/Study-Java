public class Tarefa extends Thread{

    private final long valor_inicial;
    private final long valor_final;
    private long total = 0;

    public Tarefa (int valor_inicial, int valor_final){
        this.valor_inicial = valor_inicial;
        this.valor_final = valor_final;
    }
    public  long getTotal() {
        return total;
    }

    @Override
    public void run() {
        for (long i = 0; i <= valor_final ; i++) {
            total+=i;
        }
    }
}
