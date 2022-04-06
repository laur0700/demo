package com.example.demo.service;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;

    public List<Cart> getCartAsc(){
        return cartRepository.findAllByOrderByNrProductsAsc();
    }

    public List<Cart> getCartDesc(){
        return cartRepository.findAllByOrderByNrProductsDesc();
    }

    public void add(Cart c){
        cartRepository.save(c);
    }
}
