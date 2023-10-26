package amphibian;

public class Frog extends Amphibian {

    @Override
    public void makeSound() {
        System.out.println("Frog sound");
    }

    public void jump() {
        System.out.println("Frog has jumped");
    }
}