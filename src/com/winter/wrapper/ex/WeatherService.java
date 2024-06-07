package com.winter.wrapper.ex;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	// Controller Layer
	// Business Layer
	// DAO Layer
	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80");
	}

	public WeatherDTO[] init() {
		// sb 에 있는것을 문자열 변수에 담아서 출력
		String info = sb.toString();

		System.out.println(info);
		info = info.replace(",", "-");
		// info= info.replace(" ", "");

		WeatherDTO[] dtos = this.useTokenizer(info); // getWeathers(info);

		return dtos;

	}

	private WeatherDTO[] useTokenizer(String info) {
		WeatherDTO[] ar = new WeatherDTO[4];
		StringTokenizer st = new StringTokenizer(info, "-");
		int idx = 0;
		while (st.hasMoreTokens()) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(st.nextToken().trim());
			weatherDTO.setGion(Double.parseDouble(st.nextToken().trim()));
			weatherDTO.setStatus(st.nextToken().trim());
			weatherDTO.setHumidity(Integer.parseInt(st.nextToken().trim()));
			ar[idx] = weatherDTO;
			idx++;
		}
		return ar;

	}

	private WeatherDTO[] getWeathers(String info) {
		String[] infos = info.split("-");// 20/4
		WeatherDTO[] dtos = new WeatherDTO[infos.length / 4];

		int idx = 0;

		for (int i = 0; i < infos.length; i = i + 4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(infos[i].trim());

			weatherDTO.setGion(Double.parseDouble(infos[i + 1].trim()));

			weatherDTO.setStatus(infos[i + 2].trim());

			weatherDTO.setHumidity(Integer.parseInt(infos[i + 3].trim()));

			dtos[idx] = weatherDTO;
			idx++;

		}

//		for(int i=0;i<dtos.length;i++) {
//			
//			WeatherDTO weatherDTO = new WeatherDTO();
//			weatherDTO.setCity(infos[idx].trim());
//			idx++;
//			weatherDTO.setGion(Double.parseDouble(infos[idx].trim()));
//			idx++;
//			weatherDTO.setStatus(infos[idx].trim());
//			idx++;
//			weatherDTO.setHumidity(Integer.parseInt(infos[idx].trim()));
//			idx++;
//			dtos[i]=weatherDTO;
//			
//		}

		return dtos;
	}

	// 날씨정보를 도시명으로 검색 해당 날씨정보를 리턴
	// findByCity
	public WeatherDTO findByCity(Scanner sc, WeatherDTO[] ar) {
		WeatherDTO weatherDTO = null;

		System.out.println("검색할 도시명을 입력");
		String cityName = sc.next();

		for (int i = 0; i < ar.length; i++) {
			if (cityName.equals(ar[i].getCity())) {
				weatherDTO = ar[i];
				break;
			}
		}

		return weatherDTO;
	}

	/**
	 * 날씨 정보 추가 addWeather 도시명, 기온, 습도, 상태를 입력받아서 기존의 날씨정보들에 추가
	 */

	public WeatherDTO[] addWeather(Scanner sc, WeatherDTO[] ar) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력");

		weatherDTO.setCity(sc.next());

		System.out.println("기온을 입력");
		weatherDTO.setGion(sc.nextDouble());

		System.out.println("현재 상태");
		weatherDTO.setStatus(sc.next());

		System.out.println("습도을 입력");
		weatherDTO.setHumidity(sc.nextInt());

		WeatherDTO[] newAr = new WeatherDTO[ar.length + 1];

		for (int i = 0; i < ar.length; i++) {
			newAr[i] = ar[i];
		}

		newAr[ar.length] = weatherDTO;
		return newAr;

	}

	// removeWeather메서드
	/*
	 * 기존 배열에서 하나를 삭제 삭제하고 새로운 배열을 만들어라! 삭제되니까 5 ->4칸 누구를 삭제하냐면 도시명을 입력받아서 일치하는
	 * 날씨정보를 삭제
	 *
	 */

	public void removeWeather(Scanner sc, WeatherDTO[] ar) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println();
	}

}
