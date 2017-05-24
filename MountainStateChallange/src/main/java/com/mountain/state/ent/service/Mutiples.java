package com.mountain.state.ent.service;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

/*
 * @Param1 input1
 * @Param2 input2
 * @ResultSet: It gives sorted elements in the Treemap 
 * This class helps us to convert the multiples of 3 ,multiples of 7 and multiples of both 3 and 7 to "ME","MS3" 
 * and "MS3 and ME" respectively
 */
@Service
public class Mutiples {

	public Map<Integer, String> printMulples(int input1, int input2) {
		
		Map<Integer, String> resultMap = new TreeMap<>();

		for (int i = 1; i < 67; i++) {
			int multple3 = 3 * i;
			if (multple3 > input1 && multple3 < input2) {
				resultMap.put(multple3, "ME");
			}
		}
		for (int i = 1; i < 29; i++) {
			int multple7 = 7 * i;
			if (multple7 > input1 && multple7 < input2) {
				resultMap.put(multple7, "MS3");
			}
		}
		for (int i = 1; i < 10; i++) {
			int multple3and7 = 21 * i;
			if (multple3and7 > input1 && multple3and7 < input2) {
				resultMap.put(multple3and7, "MS3 and ME");
			}
		}
		/*for (Map.Entry<Integer, String> entry : resultMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			
		}*/
		return resultMap;
	}

}
