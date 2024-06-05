package com.poscodx.mysite.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	public void addContents(BoardVo vo) {
	}
	
	public BoardVo getContents(Long no) {
	}

	public BoardVo getContents(Long boardNo, Long userNo) {
	}
	
	public void updateContents(BoardVo vo) {
		
	}
	
	public void deleteContents(Long boardNo, Long userNo) {
	}
	
	public Map<String, Object>getContentsList(int currentPage, String keyword) {
		List<BoardVo> list = null;
		Map<String, Object> map = null;
		
		map.put("list", list);
		map.put("kyword", "");

		map.put("totalCount", 0);
		map.put("listSize", 0);
		map.put("currentPage", 0);
		map.put("beginPage", 0);
		map.put("endPage", 0);
		map.put("prevPage", 0);
		map.put("nextPage", 0);
		
		
		return map;
	}
}
