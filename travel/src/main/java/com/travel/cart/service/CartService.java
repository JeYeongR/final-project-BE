package com.travel.cart.service;

import com.travel.cart.dto.request.CartAddListDTO;
import com.travel.cart.dto.request.CartDeleteListDTO;
import com.travel.cart.dto.request.CartUpdateDTO;
import com.travel.global.response.PageResponseDTO;
import org.springframework.data.domain.Pageable;

public interface CartService {

    void addCart(CartAddListDTO cartAddListDTO, String userEmail);

    PageResponseDTO getCarts(Pageable pageable, String userEmail);

    void updateCart(Long cartId, CartUpdateDTO cartUpdateDTO, String userEmail);

    void deleteCarts(CartDeleteListDTO cartDeleteListDTO, String userEmail);
}
