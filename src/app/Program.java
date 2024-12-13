package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); //chamando o daofactory eu nao exponho o codigo fonte

        System.out.println("===== Teste #1: seller findById =====");
        Seller seller = sellerDao.findById(7);

        System.out.println(seller);
    }
}
