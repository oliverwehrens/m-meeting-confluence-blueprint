package net.wehrens.confluence.meeting;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;

public class NewAgendaProvider extends AbstractBlueprintContextProvider {

    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext blueprintContext) {
        final String title = (String)blueprintContext.get("vTitle");
        blueprintContext.setTitle(title);

        return blueprintContext;
    }
}
