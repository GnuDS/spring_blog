package com.gnus.web.board.dao;

import java.util.List;

import com.gnus.web.board.model.BoardVO;

public interface BoardDAO {
	
	/**
	 *	게시글 리스트, 게시글, 등록, 수정, 삭제, 조회수 증가
	 */
	public List<BoardVO> getBoardList() throws Exception;
//	public BoardVO getBoardContent(int bid) throws Exception;
//	public int insertBoard(BoardVO boardVO) throws Exception;
//	public int updateBoard(BoardVO boardVO) throws Exception;
//	public int deleteBoard(int bid) throws Exception;
//	public int updateViewCnt(int bid) throws Exception;

}