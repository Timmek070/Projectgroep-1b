package Receipt;

import Account.Account;
import Account.User;
import Login.login;
import Webshop.Product;

import java.lang.reflect.Array;
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

        double korting=getKortingsPercentage()*totaalPrijsExclKorting;
        double totaalPrijsInclKorting =totaalPrijsExclKorting-korting;

        bon+= getKortingsPercentage()+"% \n";
        bon+= korting+"\n";
        bon+= totaalPrijsInclKorting+"\n";
        return bon;
    }
    public double getKortingsPercentage(){

        String rank = buyer.getRank();
        double kortingPercentage= 0;
        if(rank.equals("Gold")){
            kortingPercentage = 0.15;
        }
        else if(rank.equals("Silver")){
            kortingPercentage = 0.10;
        }
        else if(rank.equals("Bronze")){
            kortingPercentage = 0.05;
        }
        return kortingPercentage;
    }
}
