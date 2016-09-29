package com.demo;

public class TextEditor {

	public SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside textEditor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
	
	

}
