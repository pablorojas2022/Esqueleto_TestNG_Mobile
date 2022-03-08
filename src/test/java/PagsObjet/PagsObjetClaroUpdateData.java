package PagsObjet;

import java.io.File;
import org.openqa.selenium.By;
import MapsObjet.MapsObjetClaroUpdateData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetClaroUpdateData extends MapsObjetClaroUpdateData {
	// CREAR CONSTRUCTOR DE LA CLASE
	public PagsObjetClaroUpdateData(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}

	// METODO PRIMERA PRUEBA
	public void IngresoaUpdateData(String Departamento, String Ciudad, String Barrio, String Tipo, String NPrincipal,
			String Sufijo, String NSecundario, String Sufijo2, String NComp, String Complemento, String Numero,
			String Complemento2, String Numero2, File rutaCarpeta, String generarEvidencia) throws Exception {
		try {
			click(btnPerfil, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			click(btnConfiguration, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			click(btnUpdateData, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			click(btnUpdateData2, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			click(btnEditarDir, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			// SELECCIONAR DEPARTAMENTO
			click(spDepartamento, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			String TomarDepartamento = Departamento;
			String EsDepartamento = departamento + TomarDepartamento + "']";
			driver.findElement(By.xpath(EsDepartamento)).click();
			tiempoEspera(2000);
			// SELECCIONAR CIUDAD
			click(spCiudad, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			String TomarCiudad = Ciudad;
			String EsCiudad = ciudad + TomarCiudad + "']";
			driver.findElement(By.xpath(EsCiudad)).click();
			tiempoEspera(2000);
			// SELECCIONAR BARRIO
			sendKey(Barrio, edtBarrio, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			// SELECCIONAR TIPO
			click(spTipo, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			String TomarTipo = Tipo;
			String EsTipo = tipo + TomarTipo + "']";
			driver.findElement(By.xpath(EsTipo)).click();
			tiempoEspera(2000);
			// SELECCIONAR No. Principal
			sendKey(NPrincipal, textNPrincipal, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			// SELECCIONAR SUFIJO1
			click(spSufijo, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			String TomarSufijo1 = Sufijo;
			String EsSufijo1 = sufijo + TomarSufijo1 + "']";
			driver.findElement(By.xpath(EsSufijo1)).click();
			tiempoEspera(2000);
			// SELECCIONAR No. Secundario
			sendKey(NSecundario, txtNSecuendario, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			// SELECCIONAR SUFIJO2
			scrollVertical(rutaCarpeta, 504, 1192, 938, 3, txtNSecuendario, generarEvidencia);
			click(spSufijo3, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			String TomarSufijo2 = Sufijo2;
			String EsSufijo2 = sufijo2 + TomarSufijo2 + "']";
			driver.findElement(By.xpath(EsSufijo2)).click();
			tiempoEspera(2000);
			// SELECCIONAR No. Comp
			sendKey(NComp, txtNComponente, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			// SELECCIONAR Complemento
			click(spComplemento, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			String TomarComplemento = Complemento;
			String EsComplemento = complemento + TomarComplemento + "']";
			driver.findElement(By.xpath(EsComplemento)).click();
			tiempoEspera(2000);
			// SELECCIONAR Numero1
			sendKey(Numero, numero1, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			// SELECCIONAR Complemento2
			scrollVertical(rutaCarpeta, 504, 1192, 938, 1, numero1, generarEvidencia);
			click(spComplemento2, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			String TomarComplemento2 = Complemento2;
			String EsComplemento2 = complemento2 + TomarComplemento2 + "']";
			driver.findElement(By.xpath(EsComplemento2)).click();
			tiempoEspera(2000);
			// SELECCIONAR Numero2
			sendKey(Numero2, numero2, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			// VALIDAR
			click(btnValidar, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			// CANCELAR
			click(btnCancelar, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			// SALIR APP
			click(btnInicio, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			click(btnPerfil1, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			click(btnCloseSesion, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);
			click(btnCCloseSesion, rutaCarpeta, generarEvidencia);
			tiempoEspera(500);

		} catch (Exception e) {
			System.out.println(e);
	
		 //} catch (InterruptedException e){ 
		  //Thread.currentThread().interrupt(); // set interrupt flag 
		  //System.out.println("Failed to update data");
		 // throws new InterruptedException;
		}
	// String valor = capturarValorSelenium(resultado);
		// return valor;
	}
}
