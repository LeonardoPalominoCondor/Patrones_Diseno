
public class Main {
    public static void main(String[] args) {

        //El Main crea objetos Shapemaker para llamar a los otros metodos con formas, luego lo muestra
        ShapeMaker shapeMaker= new ShapeMaker();
         shapeMaker.drawCircle();
         shapeMaker.drawRectangle();
         shapeMaker.drawSquare();


        System.out.println(shapeMaker.getClass());
    }
    }
