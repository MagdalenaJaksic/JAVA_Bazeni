package oop.bazeni.magdalena_jaksic;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteInFile implements Runnable {
    //FORWARDING THE LIST FOR WRITING IN FILE
    private List<Pool> poolsList;
    public WriteInFile(List<Pool> poolsList) {
        this.poolsList = poolsList;
    }
    public List<Pool> getPoolsList() {
        return poolsList;
    }

    //RUN THE THREAD
    @Override
    public  void  run() {
    try (FileWriter writer = new FileWriter("pool.txt", true)) {
        System.out.println("Writing in file is active: " + Thread.currentThread().isAlive());
        for (Pool pool : getPoolsList()) {
            //WRITING MODEL NAME AND TYPE IN POOL.TXT
                writer.write(pool.getModelName() + "[ " + pool.getObjectType() + " ]" + System.lineSeparator());
                //CURRENT THREAD PAUSES SO OTHERS CAN EXECUTE
            Thread.yield();
        }
    } catch (IOException e) {
        e.printStackTrace();
      }
    }
}
