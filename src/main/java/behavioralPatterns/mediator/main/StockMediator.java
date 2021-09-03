package behavioralPatterns.mediator.main;

import java.util.ArrayList;

public class StockMediator implements Mediator{

    private ArrayList<Colleague> colleagues;
    private ArrayList<Offer> stockBuyOffers;
    private ArrayList<Offer> stockSellOffers;

    private int colleaguesCodes = 0;

    public StockMediator() {
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSellOffers = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
        colleaguesCodes++;
        colleague.setColleagueCode(colleaguesCodes);
    }

    @Override
    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;
        for (Offer offer: stockBuyOffers){
            if(offer.getStockSymbol().equals(stock)
                    && offer.getStockShares() == shares ){
                System.out.println(shares + " shares of " + stock +
                        " sold to colleague code " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;

            }
            if (stockSold){
                break;
            }
        }
        if (!stockSold){
            System.out.println(shares + " share of " +
                    stock + " added to inventory");
            Offer newOffer = new Offer(shares,stock,collCode);
            stockSellOffers.add(newOffer);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;
        for (Offer offer: stockSellOffers){
            if(offer.getStockSymbol().equals(stock)
                    && offer.getStockShares() == shares ){
                System.out.println(shares + " shares of " + stock +
                        " bought by colleague code " + offer.getColleagueCode());
                stockSellOffers.remove(offer);
                stockBought = true;

            }
            if (stockBought){
                break;
            }
        }
        if (!stockBought){
            System.out.println(shares + " share of " +
                    stock + " added to inventory");
            Offer newOffer = new Offer(shares,stock,collCode);
            stockBuyOffers.add(newOffer);
        }
    }

    public void getStockOfferings(){
        System.out.println("\nStocks for Sale");
        for (Offer offer: stockSellOffers){
            System.out.println(offer.getStockShares() + " of " +
                    offer.getStockSymbol());
        }
        System.out.println("\nStocks Buy Offers");

        for (Offer offer: stockBuyOffers){
            System.out.println(offer.getStockShares() + " of " +
                    offer.getStockSymbol());
        }
    }


}
