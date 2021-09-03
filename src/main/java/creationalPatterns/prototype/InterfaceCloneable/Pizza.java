package creationalPatterns.prototype.InterfaceCloneable;

public class Pizza implements Cloneable {
    private String name;
    private String sausages;
    private String cheese;
    private Boolean pineapple;

    public Pizza(){

    }

    public Pizza(String name, String sausages, String cheese, Boolean pineapple) {
        this.name = name;
        this.sausages = sausages;
        this.cheese = cheese;
        this.pineapple = pineapple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSausages() {
        return sausages;
    }

    public void setSausages(String sausages) {
        this.sausages = sausages;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public Boolean getPineapple() {
        return pineapple;
    }

    public void setPineapple(Boolean pineapple) {
        this.pineapple = pineapple;
    }

    @Override
    protected Pizza clone() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", sausages='" + sausages + '\'' +
                ", cheese='" + cheese + '\'' +
                ", pineapple=" + pineapple +
                '}';
    }
}
