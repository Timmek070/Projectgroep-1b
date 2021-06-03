package Receipt;

import Account.Account;
import Login.login;
import Webshop.Product;

import java.util.ArrayList;

public class Receipt {
    private Account buyer;
    private ArrayList<Product> products;
    private int code;

    public Receipt(){

    }
    public String getReceipt(){
        String bon=null;
        int totaalPrijsExclKorting=0;
        bon= bon+buyer.getName()+"\n";
        for(Product product :products){
//          totaalPrijs=totaalPrijs product.getPrice();
            bon+= product.getName()+ "de prijs"+"\n";
        }
//        int kortingPercentage= buyer.getBatch().getKorting();
//        int korting=kortingPercentage*totaalPrijs/100
//        int totaalPrijsInclKorting =totaalPrijs-korting;

//        bon+= buyer.getBatch().getKorting();
//        bon+= korting;
//        bon+= totaalPrijsInclKorting;
        return bon;
    }

}
