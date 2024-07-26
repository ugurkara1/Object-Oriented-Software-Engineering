package AbstractFactory;

public class AbstractFactoryPatternDemo {
	   public static void main(String[] args) {
	      //get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	      //get an object of Shape Rectangle
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape1.draw();
	      
	      //get shape factory
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	      //get an object of Shape Rectangle
	      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape3.draw();
	     
	      
	   }
	}
