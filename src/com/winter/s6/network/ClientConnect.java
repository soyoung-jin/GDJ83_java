package com.winter.s6.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientConnect {
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;

	public BufferedReader getBr() {
		return br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}

	// 1. 연결

	public Socket getConnection() throws Exception {
		// 네트워크 통신 전 상대방의 ip,port를 알아야 하고 자바에서는 이것을 통틀어 소켓이라고 한다.
		socket = new Socket("localhost", 8282);
		// 소켓으로 데이터를 보내고 소켓에서 데이터를 꺼낸다.

		// input
		is = socket.getInputStream();
		// 위 is를 읽을 reader가 필요
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);

		// output
		os = socket.getOutputStream();
		// 써야 함
		ow = new OutputStreamWriter(os);
		// 보내고 싶으면 ow 받고 싶으면 br필요(외부에서 이 둘을 필요로 함), 둘을 리턴해야 함. 하지만 두개 리턴은 불가하니까 하나로 만들어야
		// 함.
		// 두개를 멤버로 하면 클래스를 선언하거나 배열에 담거나 컬렉션을 사용하거나. 근데 클래스를 만들기엔 낭비가 심함
		// 배열도 같은 타입을 담아야하니까 활용도가 낮음

		return socket;
	}

	// 2. 해제
	public void disConnect() throws Exception {
		// 역순으로 닫는다.
		br.close();
		ir.close();
		is.close();
		ow.close();
		os.close();
		socket.close();

	}

}
