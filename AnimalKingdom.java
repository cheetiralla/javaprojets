package heiio;
class Animalss{
String name;

void eat() {
   System.out.println(name + " is eating.");
}

void sleep() {
   System.out.println(name + " is sleeping.");
}
}

//Subclass Dog
class Dogs extends Animalss {
void bark() {
   System.out.println(name + " is barking.");
}

void fetch() {
   System.out.println(name + " is fetching the ball.");
}
}

//Subclass Cat
class Catss extends Animalss {
void meow() {
   System.out.println(name + " is meowing.");
}

void climb() {
   System.out.println(name + " is climbing a tree.");
}
}

public class AnimalKingdom {
public static void main(String[] args) {
   Dogs dog = new Dogs();
   dog.name = "Sony";
   dog.eat();
   dog.sleep();
   dog.bark();
   dog.fetch();

   System.out.println();

   Catss cat = new Catss();
   cat.name = "Tommie";
   cat.eat();
   cat.sleep();
   cat.meow();
   cat.climb();
}
}