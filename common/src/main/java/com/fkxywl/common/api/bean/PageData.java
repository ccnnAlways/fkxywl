package com.fkxywl.common.api.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class PageData<T> implements Serializable {
	private static final long serialVersionUID = -8689661131925501144L;
	
	private long total;			//总条数
	private List<T> rows;		//结果对象
	
	public PageData() {}

	public PageData(long total, List<T> rows) {
		this.total = total;
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageData [total=" + total + ", rows=" + rows + "]";
	}
}
