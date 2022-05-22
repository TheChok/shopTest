package com.shop.mapper;

import java.util.List;

import com.shop.model.Criteria;
import com.shop.model.ReplyDTO;

//-------------------------------------------------------------------------------------------------------//
// public interface ReplyMapper
//-------------------------------------------------------------------------------------------------------//
public interface ReplyMapper {
	
	// 댓글 등록
	public int enrollReply(ReplyDTO dto);
	
	// 댓글 존재 체크
	public Integer checkReply(ReplyDTO dto);
	
	// 댓글 페이징
	public List<ReplyDTO> getReplyList(Criteria cri);
	
	// 댓글 총 갯수(페이징)
	public int getReplyTotal(int book_id);
	
	// 댓글 수정
	public int updateReply(ReplyDTO dto);
	
	// 댓글 한 개 정보(수정페이지)
	public ReplyDTO getUpdateReply(int reply_id);
	
	
	
	
	
	
	
} // End - public interface ReplyMapper
