package br.unioeste.sd.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

import br.unioeste.sd.dao.INews;
import br.unioeste.sd.model.Notice;

public class Main {

	public static void main(String[] args) {
		try {
			Registry reg = LocateRegistry.getRegistry(1099);
			INews news = (INews) reg.lookup("news");
			
			List<String> subjects = new ArrayList<String>();
			subjects.add("Computação");
			subjects.add("Engenharia");
			
			news.addNotice(new Notice(1, "Curso", "Ciência da Computação", subjects));
			news.addNotice(new Notice(2, "Curso", "Sistema de Informação", subjects));
			news.addNotice(new Notice(3, "Curso", "Engenharia da Computação", subjects));
			
			List<Notice> n = (List<Notice>) news.getNewsAboutSubject("Computação");
			
			for(Notice notice : n){
				System.out.println(notice.getId());
				System.out.println(notice.getTitle());
				System.out.println(notice.getText());
			}
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
