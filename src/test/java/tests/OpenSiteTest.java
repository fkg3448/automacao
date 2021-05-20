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

public class OpenSiteTest {
	
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
		Thread.sleep(5000);
		driver.quit();	
		
	}
	

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.drogasil.com.br/customer/account/create");	
		Thread.sleep(3000);
		
		//Digitar login
		WebElement nome = driver.findElement(By.name("nomecompleto"));
		nome.sendKeys("Teste Teste de Teste");
		
		//Digitar email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("gabriel@hotmail.com");
		
		//Digitar cpf
		WebElement cpf = driver.findElement(By.name("cpf"));
		cpf.sendKeys("123.123.123-02");
		
		//Digitar telefone
		WebElement telefone = driver.findElement(By.id("telefone"));
		telefone.sendKeys("(11) 1111-1111");
		
		//Digitar senha
		WebElement senha = driver.findElement(By.id("senha"));
		senha.sendKeys("gabriel1234");

		//Digitar confirmação de senha
		WebElement confirmacao = driver.findElement(By.id("confirmarSenha"));
		confirmacao.sendKeys("gabriel1234");	
		
		//Digitar data de nascimento
		WebElement data = driver.findElement(By.id("dataDeNascimento"));
		data.sendKeys("10/12/1800");
		
		//Selecionar genero
	      WebElement selecgen = driver.findElement(By.className("acceptAll"));
	      selecgen.click();
	      
	  

		
				
				
				
		
		
		
		
		 
		
		
		
		
		
		
		
		

		
		
		
	
	}

} 
