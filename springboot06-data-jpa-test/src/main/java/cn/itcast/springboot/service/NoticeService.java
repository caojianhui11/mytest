package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.entity.Notice;

public interface NoticeService {
      //查询所有的公告
	
	public List<Notice>findAll();
	
}
