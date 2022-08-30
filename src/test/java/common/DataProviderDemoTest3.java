package common;

import org.testng.annotations.DataProvider;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class DataProviderDemoTest3 {

	@DataProvider
	public Object[][] dataset1() {
		return new Object[][] { { "username", "password", "test" }, { "username1", "password1", "test1" },
				{ "username2", "password2", "test2" }, { "username3", "password3", "test3" } };
	}
	@DataProvider
	public Object[][] dataset2(){
		return new Object[][] {
			 {"monu"}, {"rahul"}, {"sonu"}, {"vikash"}
		};
	}
	

	@DataProvider
	public Object[][] dataset() {
		Object[][] dataset = new Object[4][2];

		// first row
		dataset[0][0] = "user1";
		dataset[0][1] = "user1";

		// second row
		dataset[1][0] = "user2";
		dataset[1][1] = "user2";

		// third row
		dataset[2][0] = "user3";
		dataset[2][1] = "user3";

		// forth row
		dataset[3][0] = "user4";
		dataset[3][1] = "user4";

		return dataset;

	}

}