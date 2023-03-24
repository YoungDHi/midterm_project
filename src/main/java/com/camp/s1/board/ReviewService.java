package com.camp.s1.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.camp.s1.util.Pager;

public interface ReviewService  {
	
	// list
	public List<ReviewDTO> getReviewList(Pager pager) throws Exception;
	
	//insert(add) board
	public int setReviewAdd(ReviewDTO reviewDTO, MultipartFile [] files, HttpSession session) throws Exception;
	
	public ReviewDTO getReviewDetail(ReviewDTO reviewDTO) throws Exception;
	
	public BoardFileDTO getReviewFileDetail(BoardFileDTO boardFileDTO) throws Exception;
	
	//update
	public int setReviewUpdate(BbsDTO bbsDTO, MultipartFile [] multipartFiles, HttpSession session) throws Exception;
	
	public int setReviewFileDelete(Long fileNum) throws Exception;
	
}
