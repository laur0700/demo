package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @GetMapping("asc")
    public List<Cart> getCartAsc(){
        return cartService.getCartAsc();
    }

    @GetMapping("desc")
    public List<Cart> getCartDesc(){
        return cartService.getCartDesc();
    }

    @PostMapping("add")
    public void addCart(@RequestBody Cart c){
        cartService.add(c);
    }
}
