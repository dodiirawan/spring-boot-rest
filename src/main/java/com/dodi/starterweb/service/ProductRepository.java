/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dodi.starterweb.service;

import com.dodi.starterweb.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dodi
 */

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
