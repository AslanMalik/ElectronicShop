package kz.index.main.bd;

import kz.index.main.model.PC;
import lombok.Getter;

import java.util.ArrayList;


public class DBManager {

    @Getter
    private static ArrayList<PC> pcs = new ArrayList<>();


    static {
        pcs.add(new PC(1, "Mac Book Pro", "8 GB RAM 256 GB SSD Intel core i7", 1199.99));
        pcs.add(new PC(2, "Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99));
        pcs.add(new PC(3, "Mac Book Pro", "16 GB RAM 1 TB SSD Apple M1", 1199.99));
        pcs.add(new PC(4, "ASUS Tuf Gaming", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        pcs.add(new PC(5, "HP ProBook", "8 GB RAM 500 GB SSD Intel Core i5", 999.99));
        pcs.add(new PC(6, "Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));
    }
}
