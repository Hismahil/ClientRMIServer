package br.unioeste.sd.model;

import java.util.List;

public class Notice {

	private Integer id;
	private String title;
	private String text;
	private List<String> subjects;
	
	public Notice(Integer id, String title, String text, List<String> subjects) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
		this.subjects = subjects;
	}

	public Notice(){}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public List<String> getSubjects() {
		return subjects;
	}
	
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
}
