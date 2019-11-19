package com.liferay.commerce.data.integration.demo.internal.data.integration.process.type;

import com.liferay.commerce.data.integration.process.type.ProcessType;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Riccardo Ferrari
 */
@Component(
	immediate = true,
	property = {
		"commerce.data.integration.process.type.key=" + CommerceDataIntegrationDemoProcessType.KEY,
		"commerce.data.integration.process.type.order=100"
	},
	service = ProcessType.class
)
public class CommerceDataIntegrationDemoProcessType implements ProcessType {

	public static final String KEY = "commerce-demo";

	@Override
	public String getKey() {
		return KEY;
	}

	@Override
	public String getLabel(Locale locale) {
		return LanguageUtil.get(getResourceBundle(locale), getKey());
	}

	protected ResourceBundle getResourceBundle(Locale locale) {
		return ResourceBundleUtil.getBundle(
			"content.Language", locale, getClass());
	}

}