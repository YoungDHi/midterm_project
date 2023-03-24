package com.camp.s1.product.review;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.camp.s1.board.BbsDTO;
import com.camp.s1.board.BoardFileDTO;
import com.camp.s1.board.ReviewDAO;
import com.camp.s1.board.ReviewDTO;
import com.camp.s1.util.Pager;

@Repository
public class ProductReviewDAO implements ReviewDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.camp.s1.product.review.ProductReviewDAO.";
	
	@Override
	public Long getTotalCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getTotalCount", pager);
	}
	
	@Override
	public ReviewDTO getReviewDetile(ReviewDTO reviewDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getReviewDetail", reviewDTO);
	}


	@Override
	public List<ReviewDTO> getReviewList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getReviewList", pager);
	}


	@Override
	public int setReviewAdd(ReviewDTO reviewDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setReviewAdd", reviewDTO);
	}


	@Override
	public int setReviewUpdate(ReviewDTO reviewDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int setReviewDelete(ReviewDTO reviewDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int setReviewFileAdd(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setReviewFileAdd", boardFileDTO);
	}


	@Override
	public List<BoardFileDTO> getReviewFileList(ReviewDTO reviewDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BoardFileDTO getReviewFileDetail(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int setReviewFileDelete(Long fileNum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
