
abstract class Animal { 
abstract void makeSound(); 
abstract void eat(); 
} 
class Dog extends Animal { 
@Override 
public void makeSound() { 
System.out.println("Woof! Woof!"); 
} 
@Override 
public void eat() { 
System.out.println("Dog is eating kibble"); 
} 
public void fetch() { 
System.out.println("Dog fetches the ball"); 
} 
} 
class Cat extends Animal { 
@Override 
public void makeSound() { 
System.out.println("Meow!"); 
} 
@Override 
public void eat() { 
System.out.println("Cat is eating fish"); 
} 
public void scratch() { 
System.out.println("Cat scratches the furniture"); 
} 
} 
public class Animals1 { 
public static void main(String[] args) { 
Animal dog = new Dog(); 
Animal cat = new Cat(); 
System.out.println("--- Dog Activities ---"); 
dog.makeSound(); 
dog.eat(); 
((Dog)dog).fetch(); 
System.out.println("\n--- Cat Activities ---"); 
cat.makeSound(); 
cat.eat(); 
((Cat)cat).scratch(); 
} 
} 