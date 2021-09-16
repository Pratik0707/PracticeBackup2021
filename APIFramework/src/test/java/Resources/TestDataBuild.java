package Resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {

	public AddPlace addPlacePayLoad(String name, String language, String address)
	{
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);// we are taking these values from feature file > Examples tag. i.e. parameterization of json / payload
		p.setLanguage(language);
		p.setName(name);
		p.setPhone_number("1321564456");
		p.setWebsite("www.abc.com");
		List<String> mylist = new ArrayList<>();
		mylist.add("first");
		mylist.add("Second");
		p.setTypes(mylist);
		Location lc = new Location();
		lc.setLat(89.35);
		lc.setLng(9.55);
		p.setLocation(lc);

		return p;

	}
}