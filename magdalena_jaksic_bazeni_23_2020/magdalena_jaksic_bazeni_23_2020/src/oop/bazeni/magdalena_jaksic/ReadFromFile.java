package oop.bazeni.magdalena_jaksic;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile implements Runnable {
    @Override
    public void run() {

        try (FileReader reader = new FileReader("pool.txt")) {

            int i;
            try {
                //THREAD PAUSE THE EXECUTION FOR 1000ms
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Reading from file is active: "+Thread.currentThread().isAlive());
            //READING TILL END OF FILE(-1)
            while ((i = reader.read()) != -1) {
                //BYTE FORMAT TO CHAR
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}