package Webshop;

import Account.User;
import Login.Login;

import java.util.ArrayList;

public class Receipt {
    private User buyer;
    private ArrayList<Product> products;

    public Receipt(ArrayList<Product> products){
        this.buyer= Login.getInstance().getIngelogdeUser();
        this.products=new ArrayList<>();
        this.products.addAll(products);
    }
    public String getReceipt(){
        String bon="";
        double totaalPrijsExclKorting=0.00;
        bon+= "Naam koper: \n"+bon+buyer.getName()+"\n\n";
        bon+= "Producten: \n\n";
        for(Product product :products){
            totaalPrijsExclKorting=Math.round((totaalPrijsExclKorting+ product.getPrice()) * 100.0) / 100.0;
            bon+= product.getName()+ " €"+Math.round(product.getPrice() * 100.0) / 100.0+"\n";
        }

        double korting=Math.round((buyer.getBadge().getDiscount()*totaalPrijsExclKorting) * 100.0) / 100.0;
        double totaalPrijsInclKorting =Math.round((totaalPrijsExclKorting-korting) * 100.0) / 100.0;


        bon+= "\n";
        bon+= "Korting percentage: "+buyer.getBadge().getDiscount()*100+"% \n";
        bon+= "Korting: €"+korting+"\n\n";
        bon+= "Prijs excl. korting: €"+totaalPrijsExclKorting+"\n";
        bon+= "Prijs incl. korting: €"+totaalPrijsInclKorting+"\n";
        return bon;
    }

    public double getTotaalKorting(){
        double totaalPrijsExclKorting=0.00;
        for(Product product :products){
            totaalPrijsExclKorting=Math.round((totaalPrijsExclKorting+ product.getPrice()) * 100.0) / 100.0;
        }
        double korting=Math.round((buyer.getBadge().getDiscount()*totaalPrijsExclKorting) * 100.0) / 100.0;
        double totaalPrijsInclKorting =Math.round((totaalPrijsExclKorting-korting) * 100.0) / 100.0;
        return totaalPrijsInclKorting;
    }

}