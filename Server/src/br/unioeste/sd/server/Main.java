package br.unioeste.sd.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.unioeste.sd.dao.NewsImpl;

public class Main {

	public static void main(String[] args) {
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			NewsImpl news = new NewsImpl();
			reg.bind("news", news);
			
			System.out.println("Server listen");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}

	}

}
