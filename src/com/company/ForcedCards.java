package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ForcedCards {

	private static int[] bestPlay(int[] deck) {
		int[] answer = new int[3];
		int newTest[] = new int[deck.length-1];
        int sortedArray[] = new int[deck.length-1];
        for (int x = 0; x < deck.length-1; x++){
            for (int j = 0; j < x; j++){
                if (x == 0 && j ==0 ) {
                    newTest[x] += deck[x];
                }
                else {
                    newTest[x] += deck[x-j];
                }
                System.out.println(newTest[x]);

            }
        }
        sortedArray = newTest;
        Arrays.sort(sortedArray);
        //System.out.println(sortedArray[]);
        for (int y = 0; y < newTest.length-1; y++){
            if (sortedArray[0] == newTest[y]) {
                answer[2] = sortedArray[0];
                answer[1] = y;
            }
        }


		return answer;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();

		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
			int numOfCards = sc.nextInt();
			int[] cards = new int[numOfCards];
			for (int i=0; i<numOfCards; i++) {
				cards[i] = sc.nextInt();
			}

			int[] results = bestPlay(cards);        
			System.out.println(
					"Start/Stop/Value: " + 
					results[0]+"/"+results[1]+"/"+results[2]
					);
		}

		sc.close();
	}
}

