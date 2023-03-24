package com.camp.s1.board;

import java.util.List;

public class ReviewDTO extends BbsDTO{
	
	private Long mark;
	
	private List<BoardFileDTO> boardFileDTOs;

	public Long getMark() {
		return mark;
	}

	public void setMark(Long mark) {
		this.mark = mark;
	}

	public List<BoardFileDTO> getBoardFileDTOs() {
		return boardFileDTOs;
	}

	public void setBoardFileDTOs(List<BoardFileDTO> boardFileDTOs) {
		this.boardFileDTOs = boardFileDTOs;
	}
	
	
}
