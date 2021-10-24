
public class xpaths {

	public static void main(String[] args) {
		
		//Different types of Xpaths : 
			1.	Contains text : 
			//span[contains(text(),'Username')]

			2.	Contains : 
			//div[contains(@id,'divUsername')]

			3.	@ : 
			//div[@id='divUsername']

			4.	Multiple attributes : 
			//a[@id=’id1’][@name=’namevalue1’]

			5.	Starts with :
			//a[starts-with(@id,'link-forgot')]

			6.	Following :
			//input[@name='txtUsername']/following::span[1]

			7.	Preceding : 
			//input[@name='txtUsername']/preceding::span[1]   

			8.	Preceding-sibling : 
			//input[@name='txtUsername']/preceding-sibling::span

			9.	Following-sibling : 
			//input[@name='txtUsername']/following-sibling::span

			10.	Parent : 
			//input[@name='txtUsername']/parent::div


	}

}
