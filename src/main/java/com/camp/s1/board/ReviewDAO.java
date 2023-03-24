package com.camp.s1.board;

import java.util.List;

import com.camp.s1.util.Pager;

public interface ReviewDAO {
	
	//totalCount
	public Long getTotalCount(Pager pager) throws Exception;
	
	//detail
	public ReviewDTO getReviewDetile(ReviewDTO reviewDTO) throws Exception;
	
	//list
	public List<ReviewDTO> getReviewList(Pager pager) throws Exception;
	
	//insert
	public int setReviewAdd(ReviewDTO reviewDTO) throws Exception;
	
	//update
	public int setReviewUpdate(ReviewDTO reviewDTO) throws Exception;
	
	//delete
	public int setReviewDelete(ReviewDTO reviewDTO) throws Exception;
	
	//fileAdd
	public int setReviewFileAdd(BoardFileDTO boardFileDTO) throws Exception;
	
	//BoardFileList
	public List<BoardFileDTO> getReviewFileList(ReviewDTO reviewDTO) throws Exception;
	
	//BoardFileDetail
	public BoardFileDTO getReviewFileDetail(BoardFileDTO boardFileDTO) throws Exception;
	
	public int setReviewFileDelete(Long fileNum) throws Exception;

}
