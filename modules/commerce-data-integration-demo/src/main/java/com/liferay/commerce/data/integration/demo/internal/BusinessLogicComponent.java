package com.liferay.commerce.data.integration.demo.internal;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.osgi.service.component.annotations.Component;

/**
 * @author Riccardo Ferrari
 */
@Component(immediate = true, service = BusinessLogicComponent.class)
public class BusinessLogicComponent {

	public void execute() {
		_log.info("RUNNING BUSINESS LOGIC");
	}

	private static Log _log = LogFactoryUtil.getLog(
		BusinessLogicComponent.class);

}