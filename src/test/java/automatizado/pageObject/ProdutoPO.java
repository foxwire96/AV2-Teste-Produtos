package automatizado.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automatizado.pageObject.BasePO;

public class ProdutoPO extends BasePO{
	
	@FindBy(id = "btn-adicionar")
	public WebElement btnCriar;
	
	@FindBy(id = "editar")
    public WebElement btnEditar;
	
	@FindBy(id = "btn-salvar")
	public WebElement btnSalvar;
	
	@FindBy(id = "codigo")
	public WebElement inputCodigo;
	
	@FindBy(id = "nome")
	public WebElement inputNome;
	
	@FindBy(id = "quantidade")
	public WebElement inputQuantidade;
	
	@FindBy(id = "valor")
	public WebElement inputValor;
	
	@FindBy(id = "data")
	public WebElement inputData;
	
	@FindBy(css = "div.alert>span") // Ajuste o seletor CSS para o elemento da mensagem de erro.
	public WebElement mensagemErro;
	
	public ProdutoPO(WebDriver driver) {
		super(driver);	
	}
	public String obterMensagem() {
		return this.mensagemErro.getText();
	}
	
	
	
}
