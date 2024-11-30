package automatizado.testes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.pageObject.ProdutoPO;
import automatizado.testes.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ProdutoTest extends BaseTest{
private static ProdutoPO ProdutoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		ProdutoPage = new ProdutoPO(driver);
		ProdutoPage.btnCriar.click();
		ProdutoPage.btnCriar.click();
	}
	
	@Test
	public void TC006_SalvarIncompletoComMensagemDeErro() {
		
		 ProdutoPage.inputCodigo.sendKeys("12345");
	     ProdutoPage.inputNome.sendKeys("");
	     ProdutoPage.inputQuantidade.sendKeys("");
	     ProdutoPage.inputValor.sendKeys("");
	     ProdutoPage.inputData.sendKeys("");
		
		ProdutoPage.btnSalvar.click();
		
		String mensagem = ProdutoPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC007_SalvarVazioComMensagemDeErro() {
		
		ProdutoPage.inputCodigo.sendKeys("");
		ProdutoPage.inputData.sendKeys("");
		ProdutoPage.inputNome.sendKeys("");
		ProdutoPage.inputQuantidade.sendKeys("");
		ProdutoPage.inputValor.sendKeys("");
		
		ProdutoPage.btnSalvar.click();
		
		String mensagem = ProdutoPage.obterMensagem();
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC008_SalvarPreenchimentoCompleto() {
		
		ProdutoPage.inputCodigo.sendKeys("001");
		ProdutoPage.inputData.sendKeys("25/06/2004");
		ProdutoPage.inputNome.sendKeys("Cadeira");
		ProdutoPage.inputQuantidade.sendKeys("01");
		ProdutoPage.inputValor.sendKeys("R$100,00");
		
		ProdutoPage.btnSalvar.click();
	}
	
}

	
	
