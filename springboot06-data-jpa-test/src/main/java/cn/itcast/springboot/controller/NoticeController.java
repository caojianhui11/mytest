package cn.itcast.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

@RestController
public class NoticeController {
	@Autowired
     private NoticeService noticeService;
	
	//查询全部公告
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
		
	}
	
	
}
