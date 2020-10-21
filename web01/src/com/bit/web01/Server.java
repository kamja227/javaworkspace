package com.bit.web01;

import java.io.*;
import java.net.*;

public class Server extends Thread {
	Socket sock;
	
	public Server(Socket sock) {
		this.sock = sock;
	}
	
	public void run() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		FileInputStream fis = null;
		File file = null;
		
		try {
			SocketAddress addr = sock.getRemoteSocketAddress();
//			java.net.InetAddress iaddr = (IntAddress)addr;
			System.out.println(addr.toString());
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String request = br.readLine();
//			System.out.println(request);
			String[] arr = request.split(" ");
//			file = new File("www/hangle.txt");
			if(arr[1].equals("/")) {
				arr[1] = "/index.html";
			} // ��û�� ���� ��..?
				
			file = new File("www" + arr[1]);
			os = sock.getOutputStream();	
			
			///////////////////////////////////////////////////
			os.write("HTTP/1.1 200 OK\r\n".getBytes()); // http ��û ���� �ڵ� 200 OK
			os.write("Content-type: text/html; charset = utf-8 \r\n".getBytes()); // �ѱ� ���� utf-8 �� �ٲٱ�
			os.write("\r\n".getBytes()); // ������ �ش� ������ ����
//			os.write("<h1>Hello world ...</h1>".getBytes());
			
			fis = new FileInputStream(file);
			int su = -1;
			while((su=fis.read()) != -1) {
				os.write(su);
			}
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(os != null) os.close();
				if(br != null) br.close();
				if(isr != null) isr.close();
				if(is != null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // run end
	
	public static void main(String[] args) {
		int port = 8080;
		ServerSocket serv = null;
		
		try {
			System.out.println("���� ���� ��");
			serv = new ServerSocket(port);
			while(true) { // ������� �ʰ� ���
				Socket sock = serv.accept(); // ������ ������ ����� ������ �̿��ؼ� io�۾� �� �� �ְ�
				Server thr = new Server(sock);
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serv != null) serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	} // main end
} // class end