package com.pruebabank.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pagetutorial extends page {

	protected WebDriver browser;

	public pagetutorial(WebDriver driver) {
		super(driver);
		this.browser = driver;
	}

	// DECLARANDO VARIABLES A UTILIZAR
	public WebElement texto;

	public void validarIntroduccion() {
		//DATOS PARA REALIZAR LA BUSQUEDA DE CAMPO
		texto = this.fiendElement(By.xpath("//*[@id=\"post-31\"]/div/div/p[2]"));
		//TEXTO A COMPARAR
		String textComparative = "Selenium es un set de herramienta desarrolladas en java para automatización de tareas en navegadores orientadas al testing de páginas web.";
		//REALIZANDO LA EXTRACCION DE VALORES DEL CAMPO
		String text = texto.getText();
		System.out.println("INICIA PROCESO DE VALIDACION DE TEXTO");
		//REALIZANDO COMPARACION EN CASO EXITOSO ENVIA MENSAJE DE EXITO A CONSOLA
		if (text.equals(textComparative)) {
			System.out.println("VALIDACION DE TEXTO EXITOSA");
			System.out.println("Texto encontrado es: " + textComparative);
		} else {
			System.out.println("ERROR VALIDACION DE TEXTO FALLIDA");
		}
	}

}
