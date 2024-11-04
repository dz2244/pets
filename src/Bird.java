public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound(){
        System.out.println("twit");
    }
    @Override
    public void eat(){
        System.out.println("food1");
    }
    @Override
    public void fly(){
        System.out.println("bird fly");
    }
}
