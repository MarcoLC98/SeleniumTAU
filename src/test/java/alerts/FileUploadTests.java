package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
	
	@Test
	public void testFileUpload() {
		var uploadPage = homePage.clickFileUpload();
		uploadPage.uploadFile("/Users/solvd/IdeaProjects 10.09.57/Solvd/SeleniumTAU/src/main/resources/geckodriver");
		assertEquals(uploadPage.uploadedFile(), "geckodriver", "Uploaded file incorrect");
	}
	
}
