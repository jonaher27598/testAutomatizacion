package com.pruebabank.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageGoogle extends page {

	protected WebDriver browser;

	public pageGoogle(WebDriver driver) {
		super(driver);
		this.browser = driver;
	}

	// DECLARANDO VARIABLES A UTILIZAR
	By varEscribir = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
	// By BtnBuscarG = By.xpath("");
	By varEnlaceWiki = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a");
	By varBuscadorWiki = By.id("searchInput");
	By BtnBuscarWiki = By.id("searchButton");
	By varEnlaceExterno = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/ul[4]/li[2]/a");
	public WebElement BtnBuscarG, BtnBuscarG2, varValidateWiki;

	public void encontrarWikipedia() throws InterruptedException {
		// LLAMANDO A METODO DE ESCRITURA
		ingresarTexto(varEscribir, "Wikipedia");
		// INGRESANDO EL LLAMADO A LOS BOTONES DE BUSQUEDA
		BtnBuscarG = this.fiendElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		BtnBuscarG2 = this.fiendElement(
				By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"));
		// REALIZANDO CONDICION DE LLAMADO
		if (BtnBuscarG2.isDisplayed()) {
			// REALIZANDO CLICK PARA LA BUSQUEDA
			BtnBuscarG2.click();
		} else {
			// REALIZANDO CLICK PARA LA BUSQUEDA
			BtnBuscarG.click();
		}
		// PONIENDO TIEMPO DE ESPERA PARA QUE REALICE BIEN LA CARGA
		Thread.sleep(1000);
		// LLAMANDO A METODO CLICK LUEGO DE ENCONTRAR WIKIPEDIA
		click(varEnlaceWiki);
		// ENVIANDO A CONSOLA MENSAJE DE FINALIZACION
		System.out.println("Se finalizo la primer fase de busqueda de Wikipedia");
		// FIN DE METODO DE BUSQUEDA DE WIKIPEDIA
	}

	public void buscarSelenium() throws InterruptedException {
		// ENVIANDO MENSAJE A CONSOLA DE INICIO DE FASE II
		System.out.println("Se inicia segunda fase...");
		// REALIZANDO LA DECLARACION DE ELEMENTO PARA REALIZAR VALIDACION
		varValidateWiki = this.fiendElement(By.id("Bienvenidos_a_Wikipedia,"));
		// REALIZANDO LA VALIDACION DE EXISTENCIA DE ELEMENTO DENTRO DE LA PAGINA
		if (varValidateWiki.isDisplayed()) {
			// ENVIANDO A CONSOLA CONFIRMACION DE EXITO AL REALIZAR BUSQUEDA DE ELEMENTO
			System.out.println("Se realizo la verificacion de navegacion dentro de Wikipedia");
			System.out.println("Se procede a realizar busqueda de Selenium dentro de Wikipedia");
			// INGRESANDO TEXTO A CAMPO
			ingresarTexto(varBuscadorWiki, "Selenium");
			// APLICANDO TIEMPO DE ESPERA
			Thread.sleep(1000);
			// REALIZANDO LA BUSQUEDA HACIENDO CLICK EN BOTON
			click(BtnBuscarWiki);
			// TIEMPO DE ESPERA
			Thread.sleep(2000);
			// REALIZANDO CLICK EN EL ULTIMO ENLACE
			click(varEnlaceExterno);
			System.out.println("Se ingreso correctamente a enlace Externo");

		} else {
			System.out.println("No se logro validar la navegacion dentro de Wikipedia se cierra el caso");
		}

	}

}
