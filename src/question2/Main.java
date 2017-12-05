package question2;

import java.io.File;

public class Main {

	public static void main(String[] args){
		File file = new File(System.getProperty("user.dir") + "/test.html");
		Application app = new Application("file:" + file.getAbsolutePath());
		System.out.println(app.getMainPage().getThirdAndFifthElements());
		System.out.println(app.getMainPage().getAllElementsAsString());
		app.closeApp();
	}

}
