package com.shop.mapper;

import java.util.List;

import com.shop.model.BookVO;
import com.shop.model.CateVO;
import com.shop.model.Criteria;

//-------------------------------------------------------------------------------------------------------------------//
// public interface BookMapper
//-------------------------------------------------------------------------------------------------------------------//
public interface BookMapper {
	
	// 상품 검색
	public List<BookVO> getGoodsList(Criteria cri);
	
	// 상품 총 갯수
	public int goodsGetTotal(Criteria cri);

	// 작가 id 리스트 요청
	public String[] getAuthorIdList(String keyword);
	
	// 국내 카테고리 리스트
	public List<CateVO> getCateCode1();
	
	// 외국 카테고리 리스트
	public List<CateVO> getCateCode2();
	
	
	
	
	
	
	
} // End - public interface BookMapper
