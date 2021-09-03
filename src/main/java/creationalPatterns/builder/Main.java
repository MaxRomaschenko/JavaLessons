package creationalPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Profile profile = new Profile.ProfileBuilder(1L).build();
        System.out.println(profile);

        Profile profile1 = new Profile.ProfileBuilder(2L)
                .setName("Ivan")
                .setSurname("Petrov")
                .setPhone("123456765")
                .build();
        System.out.println(profile1);
    }
}
