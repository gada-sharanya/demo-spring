package com.telusko.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

List<Product> products = new ArrayList<>();

@Autowired
ProductDB db;


//ProductDB db=new ProductDB();

//public void addProduct(Product p){
//
//    //products.add(p);
//    db.save(p);
//}

public List<Product> getAllProducts(){
    //return products;
    return db.findAll();
}

public Product getProduct(String name){

    for(Product p:products){
        if(p.getName().equals(name)){
            return p;
        }
    }
    return null;
}

}
