package com.example.dddpractices.order.v2.dao;

import com.example.dddpractices.product.domain.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MemberDataDao extends Repository<Product, String> {

    List<Product> findByIdLike(String name, Pageable pageable);
}
