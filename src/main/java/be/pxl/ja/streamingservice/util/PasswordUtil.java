package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";

	public static int calculateStrength(String password) {
		int strength;
		if (password.length() < 6){
			strength = 0;
		} else {
			if (password.length() > 10){
				strength = 2;
			}
			else {
				strength = 1;
			}
			if (stringChecker("0123456789", password)){
				strength += 2;
			}
			if (stringChecker("abcdefghijklmnopqrstuvwxyz", password)){
				strength += 2;
			}if (stringChecker("ABCDEFGHIJKLMNOPQRSTUVWXYZ", password)){
				strength += 2;
			}
			if (stringChecker(SPECIAL_CHARACTERS, password)){
				strength += 2;
			}
		}

		return strength;
	}

	public static boolean stringChecker(String sequenceOfChars, String password){
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (sequenceOfChars.contains(Character.toString(ch))){
				return true;
			}
		}
		return false;
	}
}
