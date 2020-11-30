package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.BlogPetzPage;

public class BlogPetzStep extends BlogPetzPage {

	@Dado("^acesso o menu Adocao$")
	public void acessoOMenuAdocao() {

		acesso();
		navbar("Adoção");

	}

	@Quando("^clico no item Adocao de caes$")
	public void clicoNoItemAdocaoDeCaes() {

		link("Adoção de cães: como e onde adotar");
	}

	@Entao("^visualizo a page do artigo$")
	public void visualizoAPageDoArtigo() throws Throwable {

		titulo("Adoção de cães: como e onde adotar");
		finaliza();

	}

	@Dado("^acesso o menu Aquario$")
	public void acessoOMenuAquario() throws Throwable {

		acesso();
		navbar("Aquário");
	}

	@Entao("^visualizo a page aquario$")
	public void visualizoAPageAquario() throws Throwable {

		titulo("Aquário");
		finaliza();
	}

	@Dado("^realizo uma consulta$")
	public void realizoUmaConsulta() throws Throwable {

		acesso();
		buttonLupa();
		inputPesquisa("Confira mais de 200 nomes fofos para cachorro");
		buttonBusca();
	}

	@Entao("^visualizo o resultado da pesquisa$")
	public void visualizoOResultadoDaPesquisa() throws Throwable {

		titulo(" Exibindo resultados para: Confira mais de 200 nomes fofos para cachorro");
		finaliza();
	}

	

}
