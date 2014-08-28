package br.unioeste.sd.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.unioeste.sd.model.Notice;

public interface INews extends Remote{

	Notice addNotice(Notice notice) throws RemoteException;
	List<String> getAllSubjects() throws RemoteException;
	List<Notice> getAllNews() throws RemoteException;
	List<Notice> getNewsAboutSubject(String subject) throws RemoteException;
	Notice updateNotice(Notice notice) throws RemoteException;
	Notice removeNotice(Integer id) throws RemoteException;
}
