package pt.lsts.neptus.ros;

import org.ros.namespace.GraphName;
import org.ros.node.ConnectedNode;
import org.ros.node.Node;
import org.ros.node.NodeMain;

import pt.lsts.neptus.console.ConsoleLayout;
import pt.lsts.neptus.console.ConsolePanel;

public class RosBridge extends ConsolePanel implements NodeMain {

	private static final long serialVersionUID = -7313376603901499787L;
	std_msgs.String s;
	
	public RosBridge(ConsoleLayout console) {
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

	@Override
	public void onError(Node arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onShutdown(Node arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onShutdownComplete(Node arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ConnectedNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GraphName getDefaultNodeName() {
		// TODO Auto-generated method stub
		return null;
	}

}
