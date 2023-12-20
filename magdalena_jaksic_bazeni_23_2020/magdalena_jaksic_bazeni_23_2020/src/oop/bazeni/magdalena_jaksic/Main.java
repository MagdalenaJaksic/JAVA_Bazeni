package oop.bazeni.magdalena_jaksic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
    	//MAKING 3 OBJECTS OF INTERNAL TYPE
	Pool internalPool1=new Internal("AquaCave Swimming Pool",111.5,Shape.RECTANGLUAR,10);
	Pool internalPool2=new Internal("Blue Fish",400,Shape.CIRCULAR,12);
	Pool internalPool3=new Internal("Shellfish",110.3,Shape.CUSTOM,8);

       //MAKING 3 OBJECTS OF EXTERNAL TYPE
	Pool externalPool1=new External("Laguna",300.0,Shape.RECTANGLUAR,"Yes");
	Pool externalPool2=new External("Sunny",173.3,Shape.RECTANGLUAR,"No");
	Pool externalPool3=new External("Lux",200.9,Shape.CUSTOM,"No");

	    //MAKING,ADDING,SHOWING HASHSET OF POOLS
		Set<Pool> pools=new HashSet<>();
		pools.add(internalPool1);
		pools.add(internalPool2);
		pools.add(internalPool3);
		pools.add(externalPool1);
		pools.add(externalPool2);
		pools.add(externalPool3);
		System.out.println("------------------------------------SET OF POOLS-----------------------------------------");
        Helper.showSet(pools);
        System.out.println("-----------------------------------------------------------------------------------------");

        //SHOWING LIST OF POOLS SORTED BY BASE AREA
		System.out.println("----------------------------------POOLS BY BASE AREA-------------------------------------");
       List<Pool> sortedList = Helper.makeSortedList(pools);
       Helper.showList(sortedList);
		System.out.println("-----------------------------------------------------------------------------------------");

		//SHOWING LIST OF INTERNAL POOLS / ARRAY LIST
		System.out.println("----------------------------------INTERNAL POOLS-----------------------------------------");
        List<Pool> internalList=Helper.makeInternalList(pools);
        Helper.showList(internalList);
		System.out.println("-----------------------------------------------------------------------------------------");

		//SHOWING LIST OF EXTERNAL POOLS / LINKED LIST
		System.out.println("----------------------------------EXTERNAL POOLS-----------------------------------------");
		List<Pool> externalList=Helper.showExternalList(pools);
        Helper.showList(externalList);
		System.out.println("-----------------------------------------------------------------------------------------");

        //MAKING THREAD FOR WRITING INTERNAL AND EXTERNAL POOLS IN FILE/ READING
		Thread read=new Thread(new ReadFromFile());
		Thread writeInternal=new Thread(new WriteInFile(internalList));
		Thread writeExternal=new Thread(new WriteInFile(externalList));
		//STARTING THE THREADS
		writeInternal.start();
		writeExternal.start();
		//ACTIVE LOOP WHILE THREADS ARE ACTIVE
		while (writeExternal.isAlive() && writeInternal.isAlive()){
        System.out.print("");
		}
		//READING FROM FILE
		read.start();





	}
		}


