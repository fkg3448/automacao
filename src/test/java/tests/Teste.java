package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Teste {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();	
		
	}
	

	@Test
	public void test() throws InterruptedException {
		
		//RASTREAR UM PEDIDO NOS CORREIOS
		
		//Abrir navegador
		driver.get("https://www2.correios.com.br/sistemas/rastreamento/default.cfm");		
		
		//Escrever o numero do rastreamento
		WebElement codigo = driver.findElement(By.id("objetos"));
		codigo.sendKeys("ON147336699BR");
		
		//Clicar em buscar
		driver.findElement(By.id("btnPesq")).click();
		

		
		
	}

} 
