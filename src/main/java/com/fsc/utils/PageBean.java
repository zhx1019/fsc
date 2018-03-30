package com.fsc.utils;

import java.util.List;


/**
 * 封装分页属性
 * @author zhaoqx
 *
 */
public class PageBean {
	private int currentPage;//当前页码
	private int pageSize;//每页显示的记录数
//	private DetachedCriteria detachedCriteria;//查询条件
	private Long count;//总记录数
	private List data;//当前页需要展示的数据集合
	private int code;
	private  String msg;


	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
