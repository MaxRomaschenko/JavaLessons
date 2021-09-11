package behavioralPatterns.mediator.main;

public class Main {
    public static void main(String[] args) {
        StockMediator stockMediator = new StockMediator();
        GormanSlacks gormanSlacks = new GormanSlacks(stockMediator);
        JtPoor jtPoor = new JtPoor(stockMediator);

        gormanSlacks.saleOffer("som",40);
        gormanSlacks.saleOffer("for",100);

        jtPoor.buyOffer("som",40);
        jtPoor.saleOffer("hehe",10);

        gormanSlacks.buyOffer("hehe",10);

        stockMediator.getStockOfferings();


    }
}
