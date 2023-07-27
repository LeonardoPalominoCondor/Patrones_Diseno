public class ShapeMaker {

    //Se tiene tres atributos para la clase ShapeMaker
    //A la vez de tener otros atributos publicos draw
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}