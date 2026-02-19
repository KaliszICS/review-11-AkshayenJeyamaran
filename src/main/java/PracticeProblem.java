public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] numArray = new int[5];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = numArray[i] + i + 1;
			
		}
		return numArray;
	}
	
	public static String[] createArray(String word, String word1, String word2, String word3) {
		String[] arr = {word, word1, word2, word3};
		return arr;
		}
	public static int findValue(int int2, int[] numArray) {
		int index = -1;
		for (int i = 0; i < numArray.length; i++) { 
			if (numArray[i] == int2) {
				index = i;
				return index;
			}
		}
		return index;
	}

	public static int findThirdValue(String word1, String[] numArray) {
		int index = -1;
		int count = 0;
		for (int i = 0; i < numArray.length; i++) { 
			if (numArray[i] == word1) {
				count++;
				if (count == 3) {
					index = i;
					return index;
				}
			}
		}
		return index;
	}
		}
	
