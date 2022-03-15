package InheritancePractice;

 class Babydog1 {
	 void eat() {
		 System.out.println("eating");
 }
 }
 class Dog extends Babydog1{
	 void bark() {
		 System.out.println(" barking ");
 }
 }
 public class Babydog extends Dog {
	 void weep() {
		 System.out.println(" weeping ");
		 Babydog a=new Babydog();
	       a.weep();
	       a.bark();
	       a.eat();
 }
 }
 
 
 
