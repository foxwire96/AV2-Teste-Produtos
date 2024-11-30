package automatizado.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{
	
	@FindBy(id = "email")
	public WebElement inputEmail;
	
	@FindBy(id = "senha")
	public WebElement inputSenha;
	//padrão do nome da variavel: nome do elemento html + o q ele representa
	
	@FindBy(id = "btn-entrar")
	public WebElement buttonEntrar;
	
	@FindBy (id = "mensagem")
	public WebElement spanMensagem;
	//OBS.: Capturar a mensagem funciona por id tambem
	
	/**
	 * Construtor padrão para criação de uma nova instancia da pagina de login
	 * @param driver Driver da pagina de login
	 */
	
	public LoginPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String obterMensagem() {
		return 	this.spanMensagem.getText();
		// TODO Auto-generated method stub
		
	}
	
}
