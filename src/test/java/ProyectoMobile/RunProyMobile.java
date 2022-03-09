//PABLO ROJAS
package ProyectoMobile;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PagsObjet.PagsObjetClaroPayBill;
import PagsObjet.PagsObjetClaroUpdateData;
import PagsObjet.PagsObjetMiClaroMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import utilidadesExcel.ExcelUtilidades;
import utilidadesExcel.GenerarReportePdf;
//import utilidadesExcel.MyScreenRecorder;

public class RunProyMobile {

	PagsObjetMiClaroMobile pagHome;
	PagsObjetClaroUpdateData pagFlujos;
	PagsObjetClaroPayBill pagFlujosDos;
	ClasesBase claseBase;
	File rutaCarpeta = null;
	GenerarReportePdf generarReportePdf;
	String valor;
	private AppiumDriver<MobileElement> driver;

	@SuppressWarnings("unchecked")
	@BeforeClass
	@Parameters({ "rutaOutut", "rutaImagenReporte", "platformName", "deviceName", "platformVersion", "appPackage",
			"appActivity", "noReset", "autoGrantPermissior" })
	public void setUp(@Optional("default") String rutaOutut, @Optional("default") String rutaImagenReporte,
			@Optional("default") String platformName, @Optional("default") String deviceName,
			@Optional("default") String platformVersion, @Optional("default") String appPackage,
			@Optional("default") String appActivity, @Optional("default") String noReset,
			@Optional("default") String autoGrantPermissior) throws Exception {

		// ASIGNAR PROPIEDADES A DRIVER
		driver = ClasesBase.appiumDriverConection(platformName, deviceName, platformVersion, appPackage, appActivity,
				noReset, autoGrantPermissior);
		// INSTANCIAR LA CLASE
		claseBase = new ClasesBase(driver);
		pagHome = new PagsObjetMiClaroMobile(driver);
		pagFlujos = new PagsObjetClaroUpdateData(driver);
		pagFlujosDos = new PagsObjetClaroPayBill(driver);
		generarReportePdf = new GenerarReportePdf();
		// SETTIAR LAS CLASES
		generarReportePdf.setRutaImagen(rutaImagenReporte);
		claseBase.setRutaOutut(rutaOutut, driver);

	}

	// INGRESAR A LA PAGINA A CAMBIAR LA DIRECCION
	@Test(dataProvider = "busqueda", description = "Cambio de Direccion")
	public void CambioDireccionTest(String CambioDireccion_Test, String generarEvidencia, String Email, String Password,
			String Departamento, String Ciudad, String Barrio, String Tipo, String NPrincipal, String Sufijo,
			String NSecundario, String Sufijo2, String NComp, String Complemento, String Numero, String Complemento2,
			String Numero2) throws Exception {
		if (CambioDireccion_Test.equals("SI")) {

			// OBTENER EL NOMBRE DEL METODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			// VALIDAR SI SE GENERA EVIDENCIA
			if (generarEvidencia.contains("SI")) {
				// CREAR CARPETA PARA EL ALMACENAMIENTO DE EVIDENCIA
				rutaCarpeta = claseBase.crearCarpeta(nomTest);

				// INICIA GRABACION DE VIDEO
				//MyScreenRecorder.startRecording(nomTest,rutaCarpeta);
				claseBase.iniVideo();
				
				// INICIA CREACION DE REPORTE PDF
				generarReportePdf.crearPlantilla(nomTest, rutaCarpeta);

				// ALMACENO EN LA VARIABLE EL VALOR DE URL DEL EXCEL
				pagHome.ingresoaClaroMobile(Email, Password, rutaCarpeta, generarEvidencia);
				pagFlujos.IngresoaUpdateData(Departamento, Ciudad, Barrio, Tipo, NPrincipal, Sufijo, NSecundario,
						Sufijo2, NComp, Complemento, Numero, Complemento2, Numero2, rutaCarpeta, generarEvidencia);

				// FINALIZA CREACION DE REPORTE PDF
				generarReportePdf.cerrarPlantilla();
				
				// FINALIZA GRABACION DE VIDEO
				//MyScreenRecorder.stopRecording();
				claseBase.finvideo(rutaCarpeta);
				
			} else {
				pagHome.ingresoaClaroMobile(Email, Password, rutaCarpeta, generarEvidencia);
				pagFlujos.IngresoaUpdateData(Departamento, Ciudad, Barrio, Tipo, NPrincipal, Sufijo, NSecundario,
						Sufijo2, NComp, Complemento, Numero, Complemento2, Numero2, rutaCarpeta, generarEvidencia);
			}
			// assert valor.contains(firstName);
		}
	}

	@DataProvider(name = "busqueda")
	public Object[][] datos() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./data/dataClaroNew.xlsx", "ClaroMobile");
		return arreglo;
	}

	// INGRESAR A LA PAGINA A PAGAR UNA FACTURA
	@Test(dataProvider = "busqueda1", description = "Pagar una Factura")
	public void PagarFacturaTest(String PagarFactura_Test, String generarEvidencia, String Email, String Password,
			String NumeroTarjeta, String FVMM, String FVAAAA, String CVV, String Ncuotas, String NombreCompleto,
			String TipoDoc, String Numdoc, String Telefono, String correo) throws Exception {
		if (PagarFactura_Test.equals("SI")) {

			// OBTENER EL NOMBRE DEL METODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			// VALIDAR SI SE GENERA EVIDENCIA
			if (generarEvidencia.contains("SI")) {
				// CREAR CARPETA PARA EL ALMACENAMIENTO DE EVIDENCIA
				rutaCarpeta = claseBase.crearCarpeta(nomTest);

				// INICIA GRABACION DE VIDEO
				//MyScreenRecorder.startRecording(nomTest,rutaCarpeta);
				claseBase.iniVideo();
				
				// INICIA CREACION DE REPORTE PDF
				generarReportePdf.crearPlantilla(nomTest, rutaCarpeta);

				// ALMACENO EN LA VARIABLE EL VALOR DE URL DEL EXCEL
				pagHome.ingresoaClaroMobile(Email, Password, rutaCarpeta, generarEvidencia);
				pagFlujosDos.IngresoaPayBill(NumeroTarjeta, FVMM, FVAAAA, CVV, Ncuotas, NombreCompleto, TipoDoc, Numdoc,
						Telefono, correo, rutaCarpeta, generarEvidencia);

				// FINALIZA CREACION DE REPORTE PDF
				generarReportePdf.cerrarPlantilla();
				
				// FINALIZA GRABACION DE VIDEO
				//MyScreenRecorder.stopRecording();
				claseBase.finvideo(rutaCarpeta);
				
			} else {
				pagHome.ingresoaClaroMobile(Email, Password, rutaCarpeta, generarEvidencia);
				pagFlujosDos.IngresoaPayBill(NumeroTarjeta, FVMM, FVAAAA, CVV, Ncuotas, NombreCompleto, TipoDoc, Numdoc,
						Telefono, correo, rutaCarpeta, generarEvidencia);

			}
			// assert valor.contains(firstName);
		}
	}

	@DataProvider(name = "busqueda1")
	public Object[][] datos1() throws Exception {
		Object[][] arreglo1 = ExcelUtilidades.getTableArray("./data/dataClaroNew.xlsx", "ClaroMobile1");
		return arreglo1;
	}

	@AfterClass
	public void cerrar() {
		// CERRAR PROCESO
		driver.quit();
	}
}