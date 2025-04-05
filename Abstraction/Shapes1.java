abstract class ShapeX {
public String base = "shape1";
public abstract void Draw();
}
abstract class ShapeY extends ShapeX {
public String base = "shape2";
public abstract void Draw2();
}
class ShapeG extends ShapeY {
public String base = "shape3";
@Override
public void Draw() {
System.out.println("Drawing Circle here: " + base);
}
@Override
public void Draw2() {
System.out.println("Drawing Circle here: " + base);
}
}
public class Shapes1 {
public static void main(String[] args) {
ShapeG circleshape = new ShapeG();
circleshape.Draw();
circleshape.Draw2();
}
}