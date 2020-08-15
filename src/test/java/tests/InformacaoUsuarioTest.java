package tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacaoUsuarioTest {
	@Test
	public void testAdicionarUmaInformacao() {

		// Abrindo o navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isaque\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Navegando para página do taskid!

		navegador.get("http://www.juliodelima.com.br/taskit");

		// clicar no link que posssui o texto "Sign in"

		navegador.findElement(By.linkText("Sign in")).click();

		// Identificando o formualario de login

		WebElement formularioSigninbox = navegador.findElement(By.id("signinbox"));

		// clicar no campo com name "login" que está dentro do formulario de id
		// "signinbox"

		formularioSigninbox.findElement(By.name("login")).sendKeys("julio0001");

		// clicar no campo com name "passoword" que está dentro do formulari o de id
		// "signinbox"

		formularioSigninbox.findElement(By.name("password")).sendKeys("123456");

		// clica no link com o texto "SIGN IN"

		navegador.findElement(By.linkText("SIGN IN")).click();

		// validar que dentro do elementyeo com class "me" está o texto "Hi, Julio"

		WebElement me = navegador.findElement(By.className("me"));
		String textoNoElemtnoMe = me.getText();
		assertEquals("Hi, Julio", textoNoElemtnoMe);

		// Fechar teste
		navegador.close();

	}

}
