package PagsObjet;

import java.io.File;

import MapsObjet.MapsObjetMiClaroMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetMiClaroMobile extends MapsObjetMiClaroMobile

{
// CREAR CONSTRUCTOR DE LA CLASE
	public PagsObjetMiClaroMobile(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}

// METODO PRIMERA PRUEBA - INGRESAR A LA PAG WEB DE PRUEBA
	public void ingresoaClaroMobile(String Email, String Password, File rutaCarpeta, String generarEvidencia)
			throws Exception {
		try {
			tiempoEspera(7000);
			click(btnLoginEmail, rutaCarpeta, generarEvidencia);
			tiempoEspera(1000);
			click(lyEmail, rutaCarpeta, generarEvidencia);
			tiempoEspera(1000);
			sendKey(Email, edUsuario, rutaCarpeta, generarEvidencia);
			tiempoEspera(1000);
			sendKey(Password, edPassword, rutaCarpeta, generarEvidencia);
			tiempoEspera(1000);
			click(btnLoginUsPass, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			//SELECCIONAR SALIDA DE EQUIPO
			/*click(btnCancel, rutaCarpeta, generarEvidencia); 
			tiempoEspera(1000);
			click(btnSelecEquipo, rutaCarpeta, generarEvidencia);
			tiempoEspera(50);
			click(btnAceptarSelEquip, rutaCarpeta, generarEvidencia);
			tiempoEspera(50);
			click(btnConfirmar, rutaCarpeta, generarEvidencia);
			tiempoEspera(50);*/
			 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
