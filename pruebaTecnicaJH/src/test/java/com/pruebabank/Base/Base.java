package com.pruebabank.Base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
 protected static WebDriver browser;

 //DECLARANDO LA CONFIGURACION PARA WEBDRIVER  
 //DECLARANDO LOS PRIMEROS PASOS A REALIZAR PARA INICIAR EL TEST
 @SuppressWarnings("deprecation")
@BeforeTest
 public void before() {
	 System.setProperty("webdriver.chrome.driver", ".//resource//chromedriver.exe");
	 browser = new ChromeDriver();
	 //MAXIMIZANDO LA VENTANA DEL NAVEGADOR
	 browser.manage().window().maximize();
	 //APLICANDO TIEMPO DE ESPERA DE 2 SEGUNDOS
	 browser.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 //DIRECCIONANDO PARA UTILIZAR GOOGLE
	 browser.get("https://www.google.com/"); 
 }
 //DECLARACION REALIZADA COMO PASO FINAL
 @AfterTest
	public void after() {
		browser.quit();
	}
	
}
