package dallhyun.sunmit08;

import java.util.Arrays;

public class DallHyun {

	public static void main(String[] args) {
				// 1번 
				// 로또 번호 생성기
				// Array에 랜덤 숫자(1~45)를 6개 넣어주는데
				// 중복을 허용하지 않아야 한다.
				
				int[] lottoArray = new int[6];						
				
				// 반복문이 돌면서 매번 randInt를 생성하고
				// 먼저 lottoArray에 해당 randInt가 존재하는지
				// 파악한 이후, 존재하지 않으면 추가, 존재하면 패스
				
//				int[] lottoArr = makeLotto();
//				Arraystudy.printArray(lottoArr);
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
				Arrays.sort(lottoArray);
				for(int i = 0; i < lottoArray.length; i++) { 
					
				}
				
				printArray(lottoArray);			// 순차적으로 적용후 프린트
				
				System.out.println("\n============================\n");
				
				// 2
				//선택 정렬 알고리즘
				/*
				1. 해당 배열에서 최댓값을 찾아 해당 위치의 값과 배열의 마지막 값을 swap 한다.
				2. 배열의 마지막을 제외한 나머지 값들 중 최댓값을 찾아 해당 위치의 값과 배열의 끝에서 두번째 값을 swap 한다.
				3. 위 과정을 반복하면 정렬이 잘 될겁니다.
				
				@. 최댓값을 이용해서 내림차순을 해보세요.
				매번 최댓값을 찾아서, 맨 앞에서부터 바꿔가면 됩니다.
				*/
				
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

	


