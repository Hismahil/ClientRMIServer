package br.unioeste.sd.dao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import br.unioeste.sd.model.News;
import br.unioeste.sd.model.Notice;

public class NewsImpl extends UnicastRemoteObject implements INews{

	private static final long serialVersionUID = 1L;

	private News news;
	
	public NewsImpl() throws RemoteException {
		super();
		news = new News();
	}

	@Override
	public Notice addNotice(Notice notice) throws RemoteException {
		news.getNews().add(notice);
		return notice;
	}

	@Override
	public List<Notice> getAllNews() throws RemoteException {
		
		return news.getNews();
	}

	@Override
	public List<String> getAllSubjects() throws RemoteException {
		List<String> subjects = new ArrayList<String>();
		
		for(Notice notice : news.getNews())
			subjects.addAll(notice.getSubjects());
		
		return subjects;
	}

	@Override
	public List<Notice> getNewsAboutSubject(String subject) throws RemoteException {
		List<Notice> notices = new ArrayList<Notice>();
		
		for(Notice notice : news.getNews()){
			for(String subj : notice.getSubjects()){
				if(subj.equals(subject)) {
					notices.add(notice); 
					break;
				}
			}
		}
		
		return notices;
	}

	@Override
	public Notice removeNotice(Integer id) throws RemoteException {
		Notice removed = null;
		
		for(Notice notice : news.getNews()){
			if(notice.getId() == id){
				removed = notice;
				news.getNews().remove(notice);
				break;
			}
		}
		
		return removed;
	}

	@Override
	public Notice updateNotice(Notice notice) throws RemoteException {
		Notice updated = null;
		
		for(Notice info : news.getNews()){
			if(info.getId() == notice.getId()){
				updated = info;
				break;
			}
		}
		
		if(updated != null){
			updated.setSubjects(notice.getSubjects());
			updated.setText(notice.getText());
			updated.setTitle(notice.getTitle());
		}
		
		return updated;
	}

}
