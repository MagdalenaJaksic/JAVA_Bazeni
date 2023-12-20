package oop.bazeni.magdalena_jaksic;

public class Internal extends Pool {
    //NUMBER OF PUMPS FOR INTERNAL POOL
    private int pumpNumber;

    Internal(String modelName, double baseArea, Shape shape, int pumpNumber) {
        super(modelName, baseArea, shape);
        this.pumpNumber = pumpNumber;
    }

    //GETTER FOR PUMP NUMBERS
    private int getPumpNumber() {
        return pumpNumber;
    }

    //SHOWING COMMON PROPERTIES FROM POOL, INCLUDING INTERNAL PUMP NUMBERS
    @Override
    public void showObjectData() {
        super.showObjectData();
        System.out.print(" -pump number: " + getPumpNumber());
        System.out.println();
    }
}
