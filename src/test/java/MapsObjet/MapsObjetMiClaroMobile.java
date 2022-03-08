package MapsObjet;

import org.openqa.selenium.By;

import ProyectoMobile.ClasesBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetMiClaroMobile extends ClasesBase {

// CONSTRUCTOR DE LA CLASE
	public MapsObjetMiClaroMobile(AppiumDriver<MobileElement> driver)

	{
		super(driver); 
		this.driver = driver; 
	}
	
	protected By btnLoginEmail = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginEmail']");
	protected By lyEmail = By.xpath("//android.widget.LinearLayout[@resource-id='com.clarocolombia.miclaro.debug:id/lyEmail']");
	protected By edUsuario = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edUsuario']");
	protected By edPassword = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/edPassword']");
	protected By btnLoginUsPass = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnLoginUsPass']");
	//SELECCIONAR SALIDA DEL EQUIPO
	/*protected By btnCancel = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn31']");
	protected By btnSelecEquipo = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]");
	protected By btnAceptarSelEquip = By.xpath("//android.widget.Button[@text = 'Continuar']");
	protected By btnConfirmar = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btn41']");*/
}
