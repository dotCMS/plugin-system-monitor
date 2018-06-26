package com.dotcms.plugin.rest.monitor;

import org.osgi.framework.BundleContext;

import com.dotcms.rest.config.RestServiceUtil;
import com.dotmarketing.osgi.GenericBundleActivator;
import com.dotmarketing.util.Logger;

public class Activator extends GenericBundleActivator {

	Class[] clazzes = { MonitorResource.class };

	public void start(BundleContext context) throws Exception {
		Logger.info(this.getClass(), "***jbg - Beginning of Activator.start()");
		RestServiceUtil.reloadRest();
		for (Class clazz : clazzes) {
			Logger.info(this.getClass(), "Adding new Restful Service:" + clazz.getSimpleName());
			RestServiceUtil.addResource(clazz);
		}
		Logger.info(this.getClass(), "***jbg - Ending of Activator.start()");
	}

	public void stop(BundleContext context) throws Exception {
		Logger.info(this.getClass(), "***jbg - Beginning of Activator.stop()");

		for (Class clazz : clazzes) {
			Logger.info(this.getClass(), "Removing new Restful Service:" + clazz.getSimpleName());
			RestServiceUtil.removeResource(clazz);

		}
		RestServiceUtil.reloadRest();

		Logger.info(this.getClass(), "***jbg - Ending of Activator.stop()");
	}

}
