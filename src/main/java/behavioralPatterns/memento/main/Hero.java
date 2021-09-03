package behavioralPatterns.memento.main;

public class Hero {
    private Double level;
    private Integer money;

    public void setHero(Double level, Integer money){
        this.level = level;
        this.money = money;
    }


    public void load(Save save){
        level = save.getLevel();
        money = save.getMoney();
    }

    public Save save(){
        return new Save(level,money);
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Уровень: " + level + "\n" +
                "Золото: " + money;
    }
}
