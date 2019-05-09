package net.wehrens.confluence.meeting;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;

import java.time.LocalDate;

public class MyContextProvider extends AbstractBlueprintContextProvider {

    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext blueprintContext) {
        final String title = (String) blueprintContext.get("vThema");
        blueprintContext.setTitle(title);

        String vVerantwortlich = (String) blueprintContext.get("vVerantwortlich");
        blueprintContext.put("vVerantwortlich", "<ri:user ri:username=\"" + vVerantwortlich + "\"/>");
        LocalDate localDate = LocalDate.now();
        String monthValue = getLeading0(localDate.getMonthValue());
        String dayOfMonth = getLeading0(localDate.getDayOfMonth());
        String d = localDate.getYear() + "-" + monthValue + "-" + dayOfMonth;
        blueprintContext.put("vDatum", "<time datetime=\"" + d + "\" />");

        return blueprintContext;
    }

    public String getLeading0(int value) {
        String result = "" + value;
        if (value < 10) {
            result = "0" + value;
        }
        return result;
    }
}
