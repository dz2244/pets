public class Cat extends Animal implements Runnable{
    @Override
    public void makeSound(){
        System.out.println("meow");
    }
    @Override
    public void eat(){
        System.out.println("food2");
    }
    @Override
    public void run(){
        System.out.println("cat run");
    }
}
