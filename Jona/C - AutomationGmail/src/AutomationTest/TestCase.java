package AutomationTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;
import Paginas.BandejaEntrada;
import Paginas.EnviarMail;
import Paginas.InsertMail;
import Paginas.InsertPass;
import Paginas.PaginaInicio;
import Paginas.Papelera;


public class TestCase {

	public static void main (String[] ar){
		
		String exePath = "C:\\Users\\jacita\\shoppertrak\\project\\Jona\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/intl/es/mail/help/about.html");
		
		
		String ele;
		WebElement element = null;
			
		sleep(500000000);
		
		//Clic Sobre El Boton De Iniciar Sesion
		
				PaginaInicio.Link_InicioSesion(driver).click();
				sleep(3000);
				
		//Ingreso El Mail
				
				InsertMail.Box_InsertMail(driver).sendKeys("jonathanacita88@gmail.com");
				sleep(1000);
				InsertMail.Boton_ContinueToPass(driver).click();
				sleep(3000);
				
		//Ingreso de Password
				
				InsertPass.Box_InsertPass(driver).sendKeys("lococo10");
				sleep(1000);			
				ele = InsertPass.Check_NoLogout(driver).getAttribute("checked");
					
					if ( "true".compareTo(ele) == 0){
						
						InsertPass.Check_NoLogout(driver).click();		
					}
				sleep(1000);		
				InsertPass.Boton_Login(driver).click();
				sleep(10000);
				
		//Clic sobre el boton redactar
				
				BandejaEntrada.Boton_RedactarMail(driver).click();
				sleep(4000);
		
		//Creacion y envio de Mail
							
				EnviarMail.Boton_AmpliarVentana(driver).click(); //pantalla completa
				sleep(3000);
				EnviarMail.Box_Destinatario(driver).sendKeys("jonathanacita88@gmail.com");
				sleep(1000);
				EnviarMail.Box_Asunto(driver).sendKeys("Test Automation Mail");
				sleep(1000);
				EnviarMail.Box_Mensaje(driver).sendKeys("Hello this is a Test of Automation e-Mail!!");
				sleep(1000);
				EnviarMail.Boton_EnviarMail(driver).click();
				sleep(15000);
		//Verificacion de la recepcion del email
				
				
				try {
		        	
		        	ele = (BandejaEntrada.Label_Email(driver)).getText();
		        	assertTrue(ele.contains("Test Automation Mail"));
		            System.out.println("Mail recibido");
		        } catch (Error e) {
		            driver.quit();
		            System.out.println("No se encontro el mail");
		        }
		        sleep(5000);
		//Eliminar mail con boton derecho
		        	        
		        Actions action = new Actions(driver);
		        element = BandejaEntrada.Eliminar(driver);
		        action.contextClick(element).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		        sleep(5000);
		        
		//Ir a papelera y mover con drag and drop el mail a bandeja de entrada
		        
		        
		        BandejaEntrada.Boton_Papelera(driver).click();
		        sleep(7000);
		        WebElement Mail = Papelera.Mail(driver);
		        WebElement Recib = Papelera.Recibidos(driver);
		        
		        action.dragAndDrop(Mail, Recib).perform();;
		        
		        sleep(7000);
		        
		        Papelera.Recibidos(driver).click();
		        
	}

	private static void sleep(int i) {
		
		try {
			Thread.sleep(i);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		
		
	}
	
}
