package PagsObjet;

import java.io.File;
import org.openqa.selenium.By;
import MapsObjet.MapsObjetClaroPayBill;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetClaroPayBill extends MapsObjetClaroPayBill {
// CREAR CONSTRUCTOR DE LA CLASE
	public PagsObjetClaroPayBill(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}

	// METODO PRIMERA PRUEBA
	public void IngresoaPayBill(String NumeroTarjeta, String FVMM, String FVAAAA, String CVV, String Ncuotas,
			String NombreCompleto, String TipoDoc, String Numdoc, String Telefono, String correo, File rutaCarpeta,
			String generarEvidencia) throws Exception 
	{
		try {
		click(btnPagos, rutaCarpeta, generarEvidencia);
		tiempoEspera(5000);
		click(btnPagaFactura, rutaCarpeta, generarEvidencia);
		tiempoEspera(5000);
		click(selTipoPago, rutaCarpeta, generarEvidencia);
		tiempoEspera(1000);
		click(btnPagar, rutaCarpeta, generarEvidencia);
		tiempoEspera(8000);

		// SELECCIONAR MEDIO DE PAGO
		click(btnMPago, rutaCarpeta, generarEvidencia);
		scrollVertical(rutaCarpeta, 504, 1192, 438, 1, btnMPago, generarEvidencia);
		tiempoEspera(1000);
		tocarPantalla(494, 1547);
		tiempoEspera(1000);
		click(btnContinuar, rutaCarpeta, generarEvidencia);
		tiempoEspera(7000);
		// INSERTA EL NUMERO DE TARJETA
		scrollVertical(rutaCarpeta, 504, 1192, 438, 3, btnContinuar, generarEvidencia);
		sendKey(NumeroTarjeta, intNumTC, rutaCarpeta, generarEvidencia);
		tiempoEspera(1000);
		// DA CLICK Y ESCOJE EN MM
		click(selMonth, rutaCarpeta, generarEvidencia);
		tiempoEspera(2000);
		String TomarMes = FVMM;
		String EsMes = mes + TomarMes + "']";
		driver.findElement(By.xpath(EsMes)).click();
		tiempoEspera(5000);
		// DA CLICK Y ESCOJE EN AAAA
		click(selYear, rutaCarpeta, generarEvidencia);
		tiempoEspera(2000);
		String TomarYear = FVAAAA;
		String Esyear = year + TomarYear + "']";
		driver.findElement(By.xpath(Esyear)).click();
		tiempoEspera(2000);
		// COLOCA EL CVV
		sendKey(CVV, intCVV, rutaCarpeta, generarEvidencia);
		tiempoEspera(1000);
		// DA CLICK Y ESCOJE EL NUMCUOTAS
		click(selCuotas, rutaCarpeta, generarEvidencia);
		tiempoEspera(2000);
		String Tomarcuotas = Ncuotas;
		String Escuotas = cuotas + Tomarcuotas + "']";
		driver.findElement(By.xpath(Escuotas)).click();
		tiempoEspera(2000);
		// COLOCA EL NOMBRE COMPLETO
		sendKey(NombreCompleto, txtNombreTC, rutaCarpeta, generarEvidencia);
		tiempoEspera(1000);
		// DA CLICK Y ESCOJE EL TIPODOC
		click(selTipoID, rutaCarpeta, generarEvidencia);
		tiempoEspera(2000);
		String TomartipoId = TipoDoc;
		String EstipoId = tipoId + TomartipoId + "']";
		driver.findElement(By.xpath(EstipoId)).click();
		tiempoEspera(2000);
		// COLOCA NUMDOC, NUMTEL, EMAIL
		sendKey(Numdoc, intNumID, rutaCarpeta, generarEvidencia);
		tiempoEspera(1000);
		sendKey(Telefono, intNumTel, rutaCarpeta, generarEvidencia);
		tiempoEspera(1000);
		scrollVertical(rutaCarpeta, 504, 1192, 438, 1, intNumTel, generarEvidencia);

		sendKey(correo, txtEmail, rutaCarpeta, generarEvidencia);
		tiempoEspera(1000);
		scrollVertical(rutaCarpeta, 504, 1192, 438, 1, txtEmail, generarEvidencia);
		tocarPantalla(544, 1919);
		tiempoEspera(1000);
		click(btnAtrás, rutaCarpeta, generarEvidencia);
		tiempoEspera(1000);
		click(btnPerfil, rutaCarpeta, generarEvidencia);
		tiempoEspera(500);
		click(btnCloseSesion, rutaCarpeta, generarEvidencia);
		tiempoEspera(500);
		click(btnCCloseSesion, rutaCarpeta, generarEvidencia);
		tiempoEspera(500);
	
		} catch (Exception e) {
		System.out.println(e);
		} 
		//catch (InterruptedException e){ 
		//  Thread.currentThread().interrupt(); // set interrupt flag 
		//  System.out.println("Failed to Pay Bill");
		//}
		// String valor = capturarValorSelenium(resultado);
		// return valor;
	}
}