package com.domain.example;

import pt.lsts.neptus.console.ConsoleLayer;
import pt.lsts.neptus.loader.NeptusMain;
import pt.lsts.neptus.plugins.PluginDescription;

@PluginDescription(name="Example Console Layer")
public class ConsoleLayerExample extends ConsoleLayer {

	@Override
	public void cleanLayer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initLayer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean userControlsOpacity() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		NeptusMain.main(args);
	}
}
