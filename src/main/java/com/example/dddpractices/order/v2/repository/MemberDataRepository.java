package com.example.dddpractices.order.v2.repository;

import com.example.dddpractices.product.domain.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MemberDataRepository extends JpaRepository<Product, String> {

    List<Product> findByIdLike(String name, Pageable pageable);
}
