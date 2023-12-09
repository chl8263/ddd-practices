package com.example.dddpractices.order.v2.service;


import com.example.dddpractices.order.v2.dao.MemberDataDao;
import com.example.dddpractices.order.v2.repository.MemberDataRepository;
import com.example.dddpractices.product.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    MemberDataDao memberDataDao;

    @Autowired
    MemberDataRepository memberDataRepository;

    PageRequest pageRequest = PageRequest.of(1, 10);
    List<Product> products = memberDataDao.findByIdLike("Ewan%", pageRequest);

    public MemberDataDao getMemberDataDao() {
        return memberDataDao;
    }
}
