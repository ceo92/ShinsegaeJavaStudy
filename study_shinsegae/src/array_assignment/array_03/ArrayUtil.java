package array_assignment.array_03;


public class ArrayUtil {
	public static void main(String[] args){
    char[] oldChar = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    char[] chars = reverseString(oldChar, 2, 5);
    for (char aChar : chars) {
      System.out.print(aChar+" ");
    }
  }
	public static char[] reverseString(char[] s, int start, int end) {

    char[] newChar = new char[s.length];
    for (int i = 0; i < newChar.length; i++) {
      newChar[i] = s[i];

    }

    for (int j = 0; j <= end-start ; j++) {
      newChar[start+j] = s[end-j];
    }

    return newChar;
		//reverseString 메소드 구현


		
	}
}
