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
        bon+= "Naam koper: "+bon+buyer.getName()+"\n\n";
        bon+= "Producten: \n\n";
        for(Product product :products){
            totaalPrijsExclKorting=Math.round((totaalPrijsExclKorting+ product.getPrice()) * 100.0) / 100.0;
            bon+= product.getName()+ " €"+Math.round((product.getPrice()) * 100.0) / 100.0+"\n";
        }

        double korting=Math.round((getKortingsPercentage()*totaalPrijsExclKorting) * 100.0) / 100.0;
        double totaalPrijsInclKorting =Math.round((totaalPrijsExclKorting-korting) * 100.0) / 100.0;

        bon+= "\n\n\n";
        bon+= "Korting percentage: "+getKortingsPercentage()*100+"% \n";
        bon+= "Korting: €"+korting+"\n";
        bon+= "Prijs incl. korting: €"+totaalPrijsInclKorting+"\n";
        return bon;
    }
    public double getKortingsPercentage(){
        return buyer.getBadge().getDiscount();
    }
}
