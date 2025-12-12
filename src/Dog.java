public class Dog {
    private final String name;
    private final String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }

    public void bark(){
        System.out.println(this.name + "가 짖고있다.");
    }
}
