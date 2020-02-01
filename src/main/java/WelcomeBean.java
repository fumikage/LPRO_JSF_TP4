
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "hello")
@RequestScoped
public class WelcomeBean {
	
	private String name;
	
	
	public WelcomeBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
