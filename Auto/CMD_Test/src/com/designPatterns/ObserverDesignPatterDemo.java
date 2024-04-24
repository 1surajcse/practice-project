package com.designPatterns;

public class ObserverDesignPatterDemo {

	public static void main(String[] args) {
		

	}
	
	/**
	 * 1. interface subject{---------------------------
	 *  void regsiterObserver(Observer);
	 *  removeObserver();
	 *  notifyObservers();
	 *  
	 *  }
	 *  
	 *  
	 * 2. >Product Class extends Subjects{Implement all the method
	 *  private ArrayList<Observer> observers = new ArrayList<Observer>();
	 *  Productname;
	 *  String availiblity;
	 *  
	 *  constructor()
	 *  
	 *  }
	 *  
	 *  
	 *  
	 *  
	 *  3.interface Observer{
	 *  update(String avaiblity);
	 *  }
	 *  4.Person emplements observer
	 *  
	 *  name and update methon
	 *  
	 *  5.Main mathod{
	 *  
	 *  person objects 
	 *  product
	 *  when you opt for notify
	 *  you set the obersver
	 *  
	 *  when product is avainl
	 *  product.setavailbily
	 *  }
	 */

}
