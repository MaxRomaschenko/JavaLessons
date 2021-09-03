package behavioralPatterns.memento.main;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        File file = new File();

        hero.setLevel(10.4);
        hero.setMoney(100);

        hero.setHero(hero.getLevel(), hero.getMoney());
        System.out.println("Автосохранение...");
        file.setSave(hero.save());
        System.out.println(hero.toString());
        System.out.println("\nБосс повержен. Полученно 1600 опыта и 10 золота ");

        hero.setLevel(hero.getLevel() + 1.6);
        hero.setMoney(hero.getMoney() + 10);

        System.out.println(hero.toString());

        System.out.println("\nYOU DIED\n");
        System.out.println("Загрузка последнего сохранения...");
        hero.load(file.getSave());
        System.out.println(hero.toString());
    }

}
