

public class CalculateCharacters {

	public static void main(String[] args) {

		String s = "kGGGGGrrrrrrrrrrrrrrttttyhhhG";

		String finalString = "";

		String middleString = "";

		int k = 1;

		for (int i = 0; i < s.length(); i++) {

			String preSentCharacter = Character.toString(s.charAt(i));

			if (!middleString.isEmpty() && middleString.contains(preSentCharacter)) {
				++k;
				middleString = k + preSentCharacter;
			} else if (middleString.isEmpty()) {
				k = 1;
				middleString = k + preSentCharacter;
			} else {
				finalString = finalString + middleString;
				k = 1;
				middleString = k + preSentCharacter;
			}
		}
		System.out.println(finalString + middleString);
	}

}
