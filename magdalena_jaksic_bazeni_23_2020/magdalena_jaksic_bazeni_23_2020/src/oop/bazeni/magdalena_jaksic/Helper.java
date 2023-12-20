package oop.bazeni.magdalena_jaksic;
import oop.bazeni.magdalena_jaksic.Comparator.CompareBaseArea;
import java.util.*;

//HELPER CLASS
 abstract class Helper {

    //SHOWING SET OF POOLS
static void showSet(Set<Pool> pools){
    for(Pool pool :pools){
        pool.showObjectData();
    }
}

    //MAKING SORTED LIST OF POOLS FROM SET
static ArrayList<Pool> makeSortedList(Set<Pool> pools){
    ArrayList<Pool> poolsList=new ArrayList<>(pools);
    poolsList.sort(new CompareBaseArea());
    return poolsList;

}
     //MAKING LIST OF INTERNAL POOLS FROM SET
static ArrayList<Pool> makeInternalList(Set<Pool> pools){
    ArrayList<Pool> internalpoolsList=new ArrayList<>();
    for(Pool pool: pools ){
        if(pool.getClass()==Internal.class){
            internalpoolsList.add(pool);
        }
    }
    return internalpoolsList;
}

     //MAKING LIST OF EXTERNAL POOLS FROM SET
     static LinkedList<Pool> showExternalList(Set<Pool> pools){
         LinkedList<Pool> externalpoolsList=new LinkedList<>();
         for(Pool pool: pools ){
             if(pool.getClass()==External.class){
                 externalpoolsList.add(pool);
             }
         }
         return externalpoolsList;
     }

     //SHOWING LIST OF POOLS
    static void showList(List<Pool> poolsList){
        for(Pool pool:poolsList ){
            pool.showObjectData();
        }
    }


    }


