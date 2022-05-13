package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CartMapper;
import com.shop.model.CartDTO;

//-------------------------------------------------------------------------------------------------------//
// public class CartServiceImpl implements CartService
//-------------------------------------------------------------------------------------------------------//
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartMapper cartMapper;
	
	//---------------------------------------------------------------------------------------------------//
	// 카트 추가
	//---------------------------------------------------------------------------------------------------//
	@Override
	public int addCart(CartDTO cart) {
		
		// 장바구니 데이터 체크
		CartDTO checkCart = cartMapper.checkCart(cart);
		
		if(checkCart != null) {
			return 2;
		}
		
		// 장바구니 등록 & 에러 시 0반환
		try {
			return cartMapper.addCart(cart);
		} catch (Exception e) {
			return 0;
		}		
		
	}

	//---------------------------------------------------------------------------------------------------//
	// 장바구니 정보 리스트
	//---------------------------------------------------------------------------------------------------//
	@Override
	public List<CartDTO> getCartList(String member_id) {
		
		List<CartDTO> cart = cartMapper.getCart(member_id);
		
		for(CartDTO dto : cart) {
			dto.initSaleTotal();
		}
		
		return cart;
	}
	
	
	
	
	
	
} // End - public class CartServiceImpl implements CartService











