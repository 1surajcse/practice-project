package com.multiThreading;


	public class SyncroniztionInThreading 
	{
		public static void main(String[] args) throws InterruptedException {

			Sender sender=new Sender();
			MyThread t1=new MyThread("Hi",sender);

			MyThread t2=new MyThread("Bye",sender);
			t1.start();
			t2.start();
			try{
				t1.join();
				t2.join();
			}
			catch (Exception e) {
				// TODO: handle exception
			}


		}
		static class MyThread extends Thread{
			private String msg;
			public MyThread(String msg, Sender sender) {

				this.msg = msg;
				this.sender = sender;
			}

			Sender sender;

			public void run()
			{
				//Only one thread can send a msg at a time
				synchronized (sender) {

					sender.sendMsg(msg);
				}
			}
		}

		public static class Sender{
			public void sendMsg(String msg)
			{
				System.out.println("Sending  "+msg);
				try{

					Thread.sleep(1000);
				}
				catch (Exception e) {

				}
				System.out.println("\n"+msg+" Sent");
			}
		}

	}
