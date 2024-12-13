package app;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department dep = new Department(1, "Hardware");


        Seller seller = new Seller(006, "Foo", "teste@mail.com", new Date(), 2200.0, dep);

        System.out.println(seller);
    }
}
