package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department dep = new Department(1, "Hardware");


        Seller seller = new Seller(006, "Foo", "teste@mail.com", new Date(), 2200.0, dep);

        SellerDao sellerDao = DaoFactory.createSellerDao(); //chamando o daofactory eu nao exponho o codigo fonte

        System.out.println(seller);
    }
}
