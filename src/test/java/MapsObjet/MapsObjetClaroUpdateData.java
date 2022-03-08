package MapsObjet;

import org.openqa.selenium.By;
import ProyectoMobile.ClasesBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetClaroUpdateData extends ClasesBase {

	// CONSTRUCTOR DE LA CLASE
	public MapsObjetClaroUpdateData(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}

	// ELEMENTOS PAGINA INICIAL
	protected By btnPerfil = By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[3]");
	protected By btnConfiguration = By.xpath("//android.view.View[@resource-id='com.clarocolombia.miclaro.debug:id/btnConfiguracion']");
	protected By btnUpdateData = By
			.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']"); 
	protected By btnUpdateData2 = By
			.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']");
	protected By btnEditarDir = By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.ImageView");
	protected By spDepartamento = By.xpath("//android.widget.LinearLayout/android.widget.Spinner[1]/android.widget.CheckedTextView");
	protected String departamento = ("//android.widget.CheckedTextView[@text='");
	protected By spCiudad = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spCiudad']");
	protected String ciudad = ("//android.widget.CheckedTextView[@text='");
	protected By edtBarrio = By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/edtBarrio']");
	protected By spTipo = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spTipo']");
	protected String tipo = ("//android.widget.CheckedTextView[@text='");
	protected By textNPrincipal = By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNPricipal']");
	protected By spSufijo = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spSufijo1']");
	protected String sufijo = ("//android.widget.CheckedTextView[@text='");
	protected By txtNSecuendario = By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNSecuendario']");
	protected By spSufijo3 = By.xpath("//android.widget.LinearLayout[1]/android.view.ViewGroup[2]/android.widget.Spinner/android.widget.CheckedTextView");
	protected String sufijo2 = ("//android.widget.CheckedTextView[@text='");
	protected By txtNComponente = By.xpath("//android.widget.LinearLayout[1]/android.view.ViewGroup[2]/android.widget.EditText[2]");
	protected By spComplemento = By.xpath("//android.view.ViewGroup[3]/android.widget.Spinner/android.widget.CheckedTextView");
	protected String complemento = ("//android.widget.CheckedTextView[@text='");
	protected By numero1= By.xpath("//android.widget.LinearLayout[1]/android.view.ViewGroup[3]/android.widget.EditText");
	protected By spComplemento2 = By.xpath("//android.view.ViewGroup[4]/android.widget.Spinner/android.widget.CheckedTextView");
	protected String complemento2 = ("//android.widget.CheckedTextView[@text='");
	protected By numero2= By.xpath("//android.widget.LinearLayout[1]/android.view.ViewGroup[4]/android.widget.EditText");
	
	protected By btnValidar= By.xpath("//android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button[2]");
	
	protected By btnCancelar= By.xpath("//android.widget.LinearLayout/android.widget.Button[1]");
	// BOTON SALIR
	protected By btnInicio= By.xpath("//android.view.ViewGroup/android.widget.Button[1]");
	protected By btnPerfil1 = By.xpath("//android.widget.ImageView[@resource-id = 'com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btnCloseSesion = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[12]");
	protected By btnCCloseSesion = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
}
