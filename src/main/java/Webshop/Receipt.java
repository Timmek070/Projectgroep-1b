package Webshop;

import Account.User;

import java.util.ArrayList;

public class Receipt {
    private User buyer;
    private ArrayList<Product> products;
    private int code;

    public Receipt(User buyer, ArrayList<Product> products){
        this.buyer=buyer;
        this.products=new ArrayList<>();
        this.products.addAll(products);

    }
    public String getReceipt(){
        String bon="";
        double totaalPrijsExclKorting=0;
        bon= bon+buyer.getName()+"\n";
        for(Product product :products){
            totaalPrijsExclKorting=totaalPrijsExclKorting+ product.getPrice();
            bon+= product.getName()+ " "+product.getPrice()+"\n";
        }
        buyer.updateBadge();
        System.out.println(buyer.getBadge().getDiscount());
        double korting=getKortingsPercentage()*totaalPrijsExclKorting;
        double totaalPrijsInclKorting =totaalPrijsExclKorting-korting;

        bon+= getKortingsPercentage()*100+"% \n";
        bon+= korting+"\n";
        bon+= totaalPrijsInclKorting+"\n";
        return bon;
    }
    public double getKortingsPercentage(){
        System.out.println(buyer.getBadge().getDiscount());
        return buyer.getBadge().getDiscount();
    }
}
