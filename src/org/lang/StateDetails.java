package org.lang;

public class StateDetails {
	
	private void southIndia() {
		System.out.println("South India.");
	}
	
	private void northIndia() {
			System.out.println("North India.");
	}

	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		StateDetails s = new StateDetails();
		l.englishLanguage();
		l.tamilLanguage();
		l.hindiLanguage();
		s.southIndia();
		s.northIndia();
	}
}