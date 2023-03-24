package com.camp.s1.product.review;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.camp.s1.board.BbsDTO;
import com.camp.s1.board.BoardFileDTO;
import com.camp.s1.board.ReviewDTO;
import com.camp.s1.board.ReviewService;
import com.camp.s1.util.FileManager;
import com.camp.s1.util.Pager;

@Service
public class ProductReviewService implements ReviewService {
	
	@Autowired
	private ProductReviewDAO productReviewDAO;
	
	@Autowired
	private FileManager fileManager;

	
	@Override
	public List<ReviewDTO> getReviewList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.setPerPage(5L);
		pager.makeRow();
		pager.makeNum(productReviewDAO.getTotalCount(pager));
		List<ReviewDTO> ar = productReviewDAO.getReviewList(pager);
		ArrayList<ReviewDTO> result = new ArrayList<ReviewDTO>();
		for(ReviewDTO reviewDTO:ar) {
			reviewDTO=productReviewDAO.getReviewDetile(reviewDTO);
			result.add(reviewDTO);
		}
		
		return result;
	}


	@Override
	public int setReviewAdd(ReviewDTO reviewDTO, MultipartFile[] files, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		int result = productReviewDAO.setReviewAdd(reviewDTO);
		
		String realPath = session.getServletContext().getRealPath("resources/upload/product/review");
		
		System.out.println(realPath);
		
		for(MultipartFile multipartFile : files) {
			if(multipartFile.isEmpty()) {
				continue;
			}
			String fileName = fileManager.fileSave(multipartFile, realPath);
			
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setNum(reviewDTO.getNum());
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(multipartFile.getOriginalFilename());
			result = productReviewDAO.setReviewFileAdd(boardFileDTO);
		}
			
		return result;
	}


	@Override
	public ReviewDTO getReviewDetail(ReviewDTO reviewDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BoardFileDTO getReviewFileDetail(BoardFileDTO boardFileDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int setReviewUpdate(BbsDTO bbsDTO, MultipartFile[] multipartFiles, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int setReviewFileDelete(Long fileNum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
