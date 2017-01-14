package ru.innopolis.lips.memvit;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.cdt.dsf.gdb.launching.GdbLaunchDelegate;
//import org.eclipse.cdt.launch.internal.LocalCDILaunchDelegate;

public class ConfigurationDelegate implements ILaunchConfigurationDelegate {

	
	// org.eclipse.cdt.launch
	// The class LocalCDILaunchDelegate has been removed as part of the CDI cleanup. 
	// For a Run launch, the class LocalRunLaunchDelegate should be used instead. 
	// For a Debug launch, the DSF-GDB launch delegate should be used.
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		//LocalCDILaunchDelegate localCDI = new LocalCDILaunchDelegate();
		//localCDI.launch(configuration, mode, launch, monitor);

		GdbLaunchDelegate launchDelegate = new GdbLaunchDelegate();
		launchDelegate.launch(configuration, mode, launch, monitor);
	}

}
