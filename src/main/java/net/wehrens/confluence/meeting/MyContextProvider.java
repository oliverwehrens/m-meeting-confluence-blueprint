package net.wehrens.confluence.meeting;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;

public class MyContextProvider extends AbstractBlueprintContextProvider {

    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext blueprintContext) {
        final String title = (String)blueprintContext.get("vThema");
        blueprintContext.setTitle(title);


        String vVerantwortlich = (String) blueprintContext.get("vVerantwortlich");
        blueprintContext.put("vVerantwortlich", "<ac:link><ri:user ri:username=\"" + vVerantwortlich + "\"/></ac:link>");

        return blueprintContext;
    }
}
