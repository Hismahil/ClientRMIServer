package br.unioeste.sd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class News implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Notice> news;

	public News(List<Notice> news) {
		super();
		this.news = news;
	}

	public News(){ news = new ArrayList<Notice>(); }
	
	public List<Notice> getNews() {
		return news;
	}

	public void setNews(List<Notice> news) {
		this.news = news;
	}
}
