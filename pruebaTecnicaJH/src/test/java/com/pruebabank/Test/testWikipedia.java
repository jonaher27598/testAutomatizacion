package com.pruebabank.Test;

import org.testng.annotations.Test;

import com.pruebabank.Base.Base;
import com.pruebabank.Page.pageGoogle;
import com.pruebabank.Page.pagetutorial;

public class testWikipedia extends Base{
	
	@Test
	public void pruebaWikipedia() throws InterruptedException {
		pageGoogle google = new pageGoogle(browser);
		pagetutorial tuto = new pagetutorial(browser);
		
		google.encontrarWikipedia();
		google.buscarSelenium();
		 Thread.sleep(2000);
		tuto.validarIntroduccion();
	}

}
