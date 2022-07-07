package com.pruebabank.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page {
	protected WebDriver browser;

	public page(WebDriver driver) {
		this.browser = driver;
	}

	public WebElement fiendElement(By localizador) {
		return browser.findElement(localizador);
	}

//METODO PARA OBTENER TEXTO
	public String obtenerTexto(By elemento) {
		return browser.findElement(elemento).getText();
	}

	// METODO PARA HACER CLICK
	public void click(By elemento) {
		browser.findElement(elemento).click();
	}

	// METODO PARA INGRESAR TEXTO
	public void ingresarTexto(By elemento, String texto) {
		browser.findElement(elemento).sendKeys(texto);
	}
}
