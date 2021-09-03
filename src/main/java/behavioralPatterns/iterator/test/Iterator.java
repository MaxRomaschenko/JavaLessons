package behavioralPatterns.iterator.test;

public interface Iterator {
    public boolean hasNext(); //возвращает бул. значение есть ли след. объект в коллекции
    public Object next(); //возвращает след. объект
}
