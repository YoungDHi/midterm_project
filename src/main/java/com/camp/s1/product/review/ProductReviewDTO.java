package com.camp.s1.product.review;

import java.util.List;

import com.camp.s1.board.BbsDTO;
import com.camp.s1.board.BoardFileDTO;
import com.camp.s1.board.ReviewDTO;

public class ProductReviewDTO extends ReviewDTO {
	
	private Long productNum;

	public Long getProductNum() {
		return productNum;
	}

	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	
}
