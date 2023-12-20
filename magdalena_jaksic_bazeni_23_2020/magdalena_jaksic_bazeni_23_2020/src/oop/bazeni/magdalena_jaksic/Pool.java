package oop.bazeni.magdalena_jaksic;
import oop.bazeni.magdalena_jaksic.Exceptions.CharactersException;
import oop.bazeni.magdalena_jaksic.Exceptions.InitialsException;
import oop.bazeni.magdalena_jaksic.Interfaces.ObjectData;



public class Pool implements ObjectData  {
        //CONSTANT FOR OBJECT TYPE INTERNAL/EXTERNAL
        private final String objectType = getClass() == Internal.class ? "Internal" : "External";

        //CONSTRUCTOR FOR COMMON PROPERTIES FOR OBJECTS
        private String modelName;
        private double baseArea;
        private Shape shape;

         Pool(String modelName, double baseArea, Shape shape) {
            this.modelName = modelName;
            this.baseArea = baseArea;
            this.shape = shape;
        }

        //GETTING VALUES OF COMMON PROPERTIES
        String getObjectType() {
            return objectType;
        }

        String getModelName() {
            return modelName;
        }

        public double getBaseArea() {
            return baseArea;
        }

        private Shape getShape() {
            return shape;
        }


        //HANDLING INITIALS AND CHARACTER EXCEPTION AND SHOWING COMMON PROPERTIES FOR OBJECTS
        @Override
        public void showObjectData() {
            String initials = "[MJ]";
            String commonData = "- type: " + getObjectType() + " - name: " + getModelName() + " -base area: " + getBaseArea() + " -shape: " + getShape();
            //noinspection ConstantConditions
            if (initials.length() != 4 || initials.charAt(0) != '[' || initials.charAt(1) != 'M' || initials.charAt(2) != 'J' || initials.charAt(3) != ']') {
                throw new InitialsException("Initials are not in the right format![MJ]");
            } else if(commonData.contains("{") || commonData.contains("}")||  commonData.contains("=") ) {
                throw new CharactersException("\"You tried to use \\\"{\\\", \\\"}\\\" and/or \\\"=\\\" in presentation message!\"");
            } else {
                System.out.print(initials+commonData+" ");
            }
        }
    }
