package ch07_array;

import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Collections;

public class ArrayStudy {

	public static void main(String[] args) {
		// 배열 (Array)
		String samjang = "삼장";
		String woogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";
		
		// 문자(String) 배열
		// 배열의 선언 1
		// 숫자 4는 첨자를 의미하며,
		// 배열의 크기(4)를 의미한다.
		String[] seoyugi = new String[4];
		
		// .length 배열의 크기를 리턴
		System.out.println(seoyugi.length);
		
		// 배열 내 요소(element)의 값 확인
		// 인덱스 사용 (= 인덱싱)
		System.out.println(seoyugi[0]);
		
		// 크기만 선언된 배열 내에는 기본값이 들어있다.
		
		// 기본값 (default, 디폴트)
		// 참조타입: null
		// 기본타입(숫자형, boolean)
		// 숫자타입: 정수는 0, 실수는 0.0
		// boolean타입: false
		int[] numbers = new int[2];
		System.out.println(numbers[1]);
		
		// for문을 이용하여 0부터 array.length 미만까지
		// 순회하면 배열의 모든 요소에 접근이 가능하다
		for(int i = 0; i < seoyugi.length; i++) {
			System.out.println(seoyugi[i]);
		}
		
		System.out.println("\n======================\n");
		
		// 배열에 값 넣기
		
		seoyugi[0] = samjang;
		seoyugi[1] = "손오공";
		
		printArray(seoyugi);
		
		seoyugi[2] = "사오정";
		seoyugi[3] = "저팔계";
		
		printArray(seoyugi);
		
		// 배열의 단점
		// 크기가 고정됨!!!!!!!!!!!!!!!!!!!!!!
		// 늘어나지도, 줄어들지도 않는다.
		// = 값이 추가되지 않고, 값을 제거도 못한다.
		
		// 빨간줄 에러는 컴파일 에러로,
		// 실행을 안해봐도 이클립스가 캐치
		// 실행했을 경우 발생하는 에러는 런타임 에러
//		seoyugi[4] = "크리링";
		
		// 배열의 장점
		// 배열에 담긴 모든 요소들을 한번에 처리할 수 있다.
		for(int i = 0; i < seoyugi.length; i++) {
			seoyugi[i] = "서유기 " + seoyugi[i];
		}
		printArray(seoyugi);
		
		// 배열 내 특정 요소에 접근하여 처리할 수 있다.
		for(int i = 0; i < seoyugi.length; i++) {
			// 손오공임?
			// seoyugi[i].contains("손오공")
			if(seoyugi[i].indexOf("손오공") != -1) {
				// 그럼 서유기를 드래곤볼로 바꿔
				seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
			}
		}
		
		printArray(seoyugi);
		
		System.out.println("\n========================\n");
		
		int[] intArray = new int[6];
		
		printArray(intArray);
		
		// 배열 안에 랜덤 숫자 넣기
		// 로또 번호 넣어주기
		// 1~45 사이의 랜덤 정수
		for(int i = 0; i < intArray.length; i++) {
			int randInt = (int)(Math.random() * 45) + 1;
			intArray[i] = randInt;
		}
		
		printArray(intArray);
		
		System.out.println("\n========================\n");
		
		// 배열의 선언 2
		String[] students = {"송나겸", "남궁혜연", "김달현"};
		
		// 기존 방식
		String[] stu = new String[3];
		stu[0] = "송나겸";
		stu[1] = "남궁혜연";
		stu[2] = "김달현";
		
		printArray(students);
		
		System.out.println("\n=======================\n");
		
		// 문자열 나누기
		String myInfo = "정찬웅 , 010-7398-7332,akow283@gmail.com";
		
		// .split(문자열)
		// 괄호안 문자열을 기준으로 해당 문자열을
		// 나누어 문자열 배열로 리턴한다.
		String[] infoArray = myInfo.split(",");
		System.out.println(infoArray.length);
		System.out.println(infoArray[0]);
		System.out.println(infoArray[1]);
		System.out.println(infoArray[2]);
		
		// 데이터가 거지같다면 ,로 일단 나누고
		// 이후 양쪽 공백을 제거해주면 된다.
		for(int i = 0; i < infoArray.length; i++) {
			infoArray[i] = infoArray[i].trim();
		}
		printArray(infoArray);
		
		System.out.println("\n======================\n");
		
		String calStr = "1+4+2";
		String[] calArray = calStr.split("\\+");
		// regex란 정규표현식(Regular Expression)의 약자
		// *, ?, + 의 경우 정규표현식에서 특정 의미를
		// 가지는 특수문자이므로 일반 문자로 쓰려면
		// 앞에 \\를 붙인다.
		
		// 정규표현식 사용 예
		// 연락처를 숫자만 기입했는지 체크
		// 비밀번호에 알파벳 소문자, 대문자, 숫자, 
		// 특수기호 최소 1개 이상 넣었는지 체크
		printArray(calArray);
		
		System.out.println("\n=====================\n");
		
		// 배열의 복사
		String[] sinSeoyugi = seoyugi;
		printArray(seoyugi);
		printArray(sinSeoyugi);
		
		sinSeoyugi[0] = "이승기";
		sinSeoyugi[1] = "이수근";
		printArray(seoyugi);
		printArray(sinSeoyugi);
		
		// @ 뒤에 붙은건 hashCode를 16진수로 나타낸 것
		System.out.println(seoyugi);
		System.out.println(sinSeoyugi);
		System.out.println(seoyugi.hashCode());
		System.out.println(sinSeoyugi.hashCode());
		System.out.println(Integer.toHexString(seoyugi.hashCode()));
		
		// 해쉬코드(hashcode)
		// 객체의 메모리 주소값을 이용해서
		// 해쉬를 적용한 코드
		
		// 해쉬(hash)
		// 해쉬함수(암호화 알고리즘)를 이용해서
		// 데이터를 암호화하는 기법(RSA, SHA 등 ...)
		
		// 암호화, 복호화 정말 쉽다.
		// 암호화
		Encoder base64Encoder = Base64.getEncoder();
		String password = "1q2w3e4";
		// 문자열을 byte 배열로 변환
		byte[] passByte = password.getBytes();
		String encryption = new String(base64Encoder.encode(passByte));
		System.out.println(encryption);
		
		// 복호화
		Decoder base64Decoder = Base64.getDecoder();
		String decryption = new String(base64Decoder.decode(encryption));
		System.out.println(decryption);
		
		// 암호화시 사용된 알고리즘(여기선 base64)
		// 과 일치하는 알고리즘을 이용하여
		// 복호화해야한다는 것에만 주의
		
		System.out.println("\n======================\n");
		
		// 올바른 배열 복사
		String[] synSeoyugi2 = seoyugi.clone();
		synSeoyugi2[0] = "안재현";
		
		printArray(seoyugi);
		printArray(synSeoyugi2);
		
		// clone을 까먹었어요
		String[] synSeoyugi3 = new String[seoyugi.length];
		// synSeoyugi3의 각각의 요소에
		// seoyugi의 각각의 요소를 넣으면 됨
		for(int i = 0; i < synSeoyugi3.length; i++) {
			synSeoyugi3[i] = seoyugi[i];
		}
		printArray(synSeoyugi3);
		
		
System.out.println("\n=================================\n");
		
		// 숫자 배열
		int[] numArray = {23, 456, 213, 32, 464, 1, 2};
		
		System.out.println();
		
		// 인덱스 0번 값과 인덱스 1번 값의 위치를 바꾸기
		
		int temp = numArray[0];
		numArray[0] = numArray[1];
		numArray[1] = temp;
		
		printArray(numArray);
		
		// 인덱스 2번 값과 인덱스 3번 값의 위치를 바꾸는데,
		//추가적인 변수 선언 없이 바꿔보세요
		
		// Hint 이건 숫자형 배열에서만 가능한 방법
		
		// 213 + 32
		numArray[2] = numArray[2] + numArray[3];
		// 213 + 32 - 32
		numArray[3] = numArray[2] - numArray[3];
		// 213 + 32 - 213
		numArray[2] = numArray[2] - numArray[3];
		
		System.out.println("\n============================\n");
		
		// 정렬 
		// (알고리즘으로 정렬)
		// 버블 정렬
		for(int k = 0; k < numArray.length; k++) {
			for(int i = 0; i < numArray.length-1-k; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if(numArray[i] > numArray[i+1]) {
					int tmp = numArray[i];
					numArray[i] = numArray[i+1];
					numArray[i+1] = tmp;
				}
			}
			
		}
		printArray(numArray);
		
		System.out.println("\n==============================\n");
		
		// 오름차순 쉽게 하기
		Arrays.sort(numArray);
		printArray(numArray);
		
		// 내림차순 쉽게 하기
//		Arrays.sort(numArray,Collections.reverseOrder());
		
		// 위 방법은 객체를 담은 배열일 경우에만
		// 가능한 방법(기본형인 int 배열이 아닌
		// 참조타입인 Integer 배열은 가능)
		Integer[] integerArr = {23, 354, 34, 1, 3, 22};
		Arrays.sort(integerArr, Collections.reverseOrder());
		
		// 오름차순을 이용한 내림차순
		// 1. numArray의 모든 요소에 -1을 곱함
		// 2. Arrays.sort(numArray)로 오름차순 정렬
		// 3. numArray의 모든 요소에 -1을 곱함
		
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] *= -1;
		}
		printArray(numArray);
		
		Arrays.sort(numArray);
		printArray(numArray);
		
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] *= -1;
		}
		printArray(numArray);
		
		System.out.println("\n============================\n");
		
		// 다차원 배열
		int[][] doubleArr = {{123},{456},{789}};
		
		int[] tampArr = doubleArr[0];
		printArray(tampArr);
		
//		System.out.println(doubleArr[2][1]);
		
		int[][][] tripleArr = {{{1,2,3},{4,5,6},{7,8,9}}, 
				{{10,11,12},{13,14,15},{16,17,18}}, 
				{{19,20,21},{22,23,24},{25,26,27}}};
		
		// 17을 꺼내려면?
		System.out.println(tripleArr[1][2][1]);
		
		System.out.println("\n============================\n");
		
		String[] nameArray = {"한예성","김달현","송나겸","김성윤",
				"남궁혜연","오혁진","최윤정","박승주",
				"석승원","김성빈","신윤빈","염현섭"
				,"박기현","유동준","이한정","임동성",
				"임성헌","정기준","박설리","가나혜","황의창"};
		// for 문을 이용해서 "박"씨 성을 가진
		// 동기가 몇 명인지 출력해주세요.
		
		// Hint
		// 각각의 요소에 접근해서
		// 앞글자가 "박"인지 확인
		// "박"이면 카운팅해서 for문 종료 후 출력
		
		int count = 0;
		for(int i = 0; i < nameArray.length; i++) {
			if(nameArray[i].substring(0,1).equals("박")) {
				count ++;
			}
		}
		System.out.println(count);
		
		System.out.println("\n=============================\n");
		
		int[] numArr = {2, 324, 22, 123, 54, 8, 87};
		
		// numArr 의 최댓값, 최솟값을 출력해주세요.
		int minVal = numArr[0];
		int maxVal = numArr[0];
		// for문을 돌며, 각각의 요소가
		
		// 현재의 minVal 보다 작다면 minVal에
		// 해당 요소를 담음
		
		// 현재의 masxVal 보다 크다면 maxVal에
		// 해당 요소를 담음
		
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] < minVal) {
			minVal = numArr[i];
			}
			
			if(numArr[i] > maxVal) {
			maxVal = numArr[i];
			}
		}
		System.out.println(minVal);
		System.out.println(maxVal);
		
		System.out.println("\n=====================\n");
		
		// TMI
		
		// 숫자형 배열의 최대값을 구하는 로직을
		// 함수로 만든다.
		int [] temprray = {132, 45, 214, 46, 754, 6};
		// 동적 매개변수 (파라미터) 받는 메소드
		maxVal = maxValue(33, 45, 12, 11, 4, 86, 1);
		System.out.println(maxVal);
		
		// 로또 번호 생성기
		// Array에 랜덤 숫자(1~45)를 6개 넣어주는데
		// 중복을 허용하지 않아야 한다.
		
		int[] lottoArray = new int[6];						
		
		// 반복문이 돌면서 매번 randInt를 생성하고
		// 먼저 lottoArray에 해당 randInt가 존재하는지
		// 파악한 이후, 존재하지 않으면 추가, 존재하면 패스
		
//		int[] lottoArr = makeLotto();
//		Arraystudy.printArray(lottoArr);
		
		
		int idx = 0;
		while (idx < 6) {
			int randInt = (int)(Math.random()*45) +1;
			boolean isDuple = false;
			
			// 중복체크 (중복되면 isDuple은 true)
			for(int i = 0; i < lottoArray.length; i++) {
				if(lottoArray[i] == randInt) {
					isDuple = true;
				}
			}
			if(isDuple == false) {
				lottoArray[idx] = randInt;
				idx++;
			}
			
			
		}
			
		printArray(lottoArray); 		// 순차적 하기전 프린
		
		
		Arrays.sort(lottoArray);
		for(int i = 0; i < lottoArray.length; i++) { 
			
		}
		
		printArray(lottoArray);			// 순차적으로 적용후 프린트
		
		System.out.println("\n============================\n");
		
		int[] intArray1 = {23, 456, 213, 32, 464, 1, 2, 4};

		
		Arrays.sort(intArray1);
		for(int i = 0; i < intArray1.length; i++) { 
			
		}
		printArray(intArray1);
		
		
		
		
	} // main 끝
	
	

	
	
	
	
	static int maxValue(int... anyArray) {
		int result = anyArray[0];
		for(int i = 1; i < anyArray.length; i++) {
			if(anyArray[i] < result) {
				result = anyArray[i];
			}
	
		}
		return result;
		
	}
	
	static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			if(i == intArray.length -1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");
			}
		}
	}
	
	static void printArray(String[] strArray) {
		for(int i = 0; i < strArray.length; i++) {
			if(i == strArray.length -1) {
				System.out.println(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");
			}
		}
	}

}