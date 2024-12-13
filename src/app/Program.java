package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); //chamando o daofactory eu nao exponho o codigo fonte

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
