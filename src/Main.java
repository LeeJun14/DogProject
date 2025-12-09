public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("바둑이", "시골잡종");
        Dog dog2 = new Dog("초코", "푸들");
        Dog dog3 = new Dog("엘리자베스","포메라니안");

        System.out.println(dog1.name + " " + dog1.breed);
        System.out.println(dog2.name + " " + dog2.breed);
        System.out.println(dog3.name + " " + dog3.breed);
    }
}
