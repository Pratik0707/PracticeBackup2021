package DeserializePOJO;

import java.util.List;

public class Course {

	private List<WebAutomation> webAutomation;// list : since webautomation is- 
	//array and declared as [], so it contains list of sub elements, hence 
	//need to take as a list. check json preety UI > u can see []. implies 
	//it is array and hence used List
	private List<Api> api;		
	private List<Mobile> mobile;

	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	public List<Api> getApi() {
		return api;
	}
	public void setApi(List<Api> api) {
		this.api = api;
	}
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}



}
