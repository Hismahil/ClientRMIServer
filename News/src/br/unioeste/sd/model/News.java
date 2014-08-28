package br.unioeste.sd.model;

import java.util.List;

public class News {

	private List<Notice> news;

	public News(List<Notice> news) {
		super();
		this.news = news;
	}

	public News(){}
	
	public List<Notice> getNews() {
		return news;
	}

	public void setNews(List<Notice> news) {
		this.news = news;
	}
}
