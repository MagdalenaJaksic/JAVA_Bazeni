package oop.bazeni.magdalena_jaksic;
import oop.bazeni.magdalena_jaksic.Interfaces.Cover;

public class External extends Pool implements Cover {

    // INPUT AVAILABILITY OF COVERS FOR EXTERNAL POOL
    private String covers;

     External(String modelName, double baseArea, Shape shape, String covers) {
        super(modelName, baseArea, shape);
        this.covers = covers;
    }


    //MESSAGE ABOUT AVAILABILITY OF COVERS
    @Override
    public void cover() {
        if(covers.equals("Yes")){System.out.println("Pool cover is available");}
        else {System.out.println("Pool cover is not available");}
    }

    //SHOWING COMMON PROPERTIES FROM POOL, INCLUDING EXTERNAL POOL COVERS
    @Override
    public void showObjectData() {
        super.showObjectData();
        System.out.print(" -covers: ");
        cover();

    }
}
