package automatizado.testes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.pageObject.LoginPO;

public class LoginTest extends BaseTest{
	private static LoginPO LoginPage;
	
	@BeforeClass
	public static void prepararTestes() {
		LoginPage = new LoginPO(driver);
		driver.get("file:///C:/Users/36129382023.2n/Documents/Clayton%20aulas/sistema/sistema/login.html");
	}
	
	@Test
	public void TC001_naoDevelogarnoSistemaComEmailESenhaVazio() {
		LoginPage.inputEmail.sendKeys(" ");
		LoginPage.inputSenha.sendKeys(" ");
		
		LoginPage.buttonEntrar.click();
		
		String mensagem = LoginPage.spanMensagem.getText();
		
		
		assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
	}
	
	 
}
