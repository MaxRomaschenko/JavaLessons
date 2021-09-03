package behavioralPatterns.memento.main;

public class Save {
    private final Double level;
    private final Integer money;

    public Save(Double level, Integer money) {
        this.level = level;
        this.money = money;
    }

    public Double getLevel(){
        return level;
    }

    public Integer getMoney() {
        return money;
    }
}
