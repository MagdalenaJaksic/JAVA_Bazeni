package oop.bazeni.magdalena_jaksic.Comparator;
import oop.bazeni.magdalena_jaksic.Pool;
import java.util.Comparator;

//COMPARING BASE AREA OF POOLS
public class CompareBaseArea  implements Comparator<Pool> {
    @Override
    public int compare(Pool pool1, Pool pool2) {
        if(Double.compare(pool1.getBaseArea(),pool2.getBaseArea())==0){
            return 1;
        } else if(Double.compare(pool1.getBaseArea(),pool2.getBaseArea())<0){
            return -1;
        } else {return  0;}
    }
}
