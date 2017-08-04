/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dodi.starterweb.web;

import com.dodi.starterweb.domain.Product;
import com.dodi.starterweb.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dodi
 */
@RestController
public class ProductController {
    
    @Autowired 
    private ProductRepository productRepository;
    
    @RequestMapping("/halo")
    public String halo() {
        return "Halo Dodi";
    }
    
    @RequestMapping("/product/list")
    public Iterable<Product> allProduct() {
        return productRepository.findAll();
    }
}
