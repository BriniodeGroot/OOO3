package Shoprefactored;


import javax.swing.*;
import java.io.FileNotFoundException;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        Shop shop = new Shop();
        shop.leesbestandin();
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n4. Set uitgeleend\n5. wordt uitgeleend\n6. Geef lijst van producten \n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            switch (choice) {
                case 1: shop.addproduct();
                break;
                case 2 : shop.showproduct();
                break;
                case 3 : shop.showrentalproduct();
                break;
                case 4 :shop.setuitgeleend();
                break;
                case 5 : shop.wordtuitgeleend();
                break;
                case 6 : shop.geeflijstvanproducten();
                break;
            }
        }
        shop.schrijfbestanduit();
    }
}
