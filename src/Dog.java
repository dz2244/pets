public class Dog extends Animal implements Runnable{
    @Override
    public void makeSound(){
        System.out.println("whoof");
    }
    @Override
    public void eat(){
        System.out.println("food3");
    }
    @Override
    public void run(){
        System.out.println("dog run");
    }
}
