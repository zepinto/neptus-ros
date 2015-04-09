package com.domain.example;

import pt.lsts.neptus.console.ConsoleLayout;
import pt.lsts.neptus.console.ConsolePanel;
import pt.lsts.neptus.plugins.PluginDescription;

@PluginDescription(name="Example Console Panel")
public class ConsolePanelExample extends ConsolePanel {

	private static final long serialVersionUID = 1L;

	public ConsolePanelExample(ConsoleLayout console) {
		super(console);
	}

	@Override
	public void cleanSubPanel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSubPanel() {
		// TODO Auto-generated method stub
		
	}
}
