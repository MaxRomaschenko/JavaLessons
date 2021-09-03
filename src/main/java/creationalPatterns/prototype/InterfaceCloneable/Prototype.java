package creationalPatterns.prototype.InterfaceCloneable;

public class Prototype implements Cloneable {

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
