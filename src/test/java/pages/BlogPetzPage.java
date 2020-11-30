package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPetzPage {

	public WebDriver driver;
	public WebDriverWait wait;
	public int timeout = 60;

	public void acesso() {

		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, timeout);

		driver.get("https://www.petz.com.br/blog/");
		Assert.assertEquals("Blog Petz: Tudo o que você precisa saber sobre o seu bichinho", driver.getTitle());
	}
	
	public void finaliza() {

		driver.quit();

	}

	public void link(String link) {

		driver.findElement(By.xpath("//*[@id=\'main']//div/h2/a[text()[contains(., '" + link + "')]]")).click();

	}

	public void titulo(String titulo) {
		String texto = driver.findElement(By.xpath("//h1[text()[contains(., '')]]")).getText();
		Assert.assertEquals(texto,
				driver.findElement(By.xpath("//h1[text()[contains(., '" + titulo + "')]]")).getText());

	}

	public void buttonLupa() {
		driver.findElement(By.xpath("//*[@id=\"menu-categorias\"]/li[10]/button")).click();

	}

	public void inputPesquisa(String texto) {
		driver.findElement(By.name("s")).sendKeys(texto);

	}

	public void buttonBusca() {

		driver.findElement(By.cssSelector(
				"body > div.search-form-full > form > div > div.input-group > span.input-group-btn > button > span.btn-search-text"))
				.click();

	}

	public void navbar(String menucategoria) {

		driver.findElement(By.xpath("//li/a[text()[contains(., '" + menucategoria + "')]]")).click();

	}

}
