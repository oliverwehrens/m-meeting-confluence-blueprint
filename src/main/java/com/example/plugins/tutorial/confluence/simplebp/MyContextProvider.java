package com.example.plugins.tutorial.confluence.simplebp;

import java.util.Map;

import com.atlassian.plugin.PluginParseException;
import com.atlassian.plugin.web.ContextProvider;

public class MyContextProvider implements ContextProvider {

	@Override
	public void init(Map<String, String> params) throws PluginParseException {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> getContextMap(Map<String, Object> context) {
		context.put("vName", "Sherlock");
		return context;
	}

}
