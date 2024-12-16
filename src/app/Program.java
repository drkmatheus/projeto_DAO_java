package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); //chamando o daofactory eu nao exponho o codigo fonte

        System.out.println("===== Teste #1: seller findById =====");
        Seller seller = sellerDao.findById(7);
        System.out.println(seller);

        System.out.println("\n===== Teste #2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n===== Teste #3: seller findAll =====");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n===== Teste #4: seller insert =====");
        Seller nSeller = new Seller(null, "Teste4", "teste4@mail.com.br", new Date(), 2100.0, department);
        sellerDao.insert(nSeller);
        System.out.println("Inserted. New ID: " + nSeller.getId());

        System.out.println("\n===== Teste #5: seller update =====");
        seller = sellerDao.findById(1);
        seller.setName("Mario");
        sellerDao.update(seller);
        System.out.println("Updated.");
    }
}
