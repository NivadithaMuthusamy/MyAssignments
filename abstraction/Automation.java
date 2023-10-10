package org.abstraction;

public class Automation extends MultipleLanguage{

	public static void main(String[] args) {
		Automation abs=new Automation();
		abs.java();
		abs.selenium();
		abs.python();
		abs.ruby();
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby is a programming language");
		
	}

}
