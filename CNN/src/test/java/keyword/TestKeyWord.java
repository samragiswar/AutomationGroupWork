package keyword;

import Keyword.Features;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestKeyWord extends CommonAPI {
    Features FeaturesPage= PageFactory.initElements(driver,Features.class);
    @Test
    public void TestSelectFeatureBySwitchCase() throws InterruptedException, IOException {
        FeaturesPage.selectFeatures();
    }
}

