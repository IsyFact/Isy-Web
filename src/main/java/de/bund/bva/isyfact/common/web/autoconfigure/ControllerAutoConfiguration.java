package de.bund.bva.isyfact.common.web.autoconfigure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * ComponentScan für die Controller von Isy-Web.
 */
@Configuration
@ComponentScan(basePackages = "de.bund.bva.isyfact.common.web",
    excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
            pattern = "de\\.bund\\.bva\\.isyfact\\.common\\.web\\.autoconfigure\\..*"))
public class ControllerAutoConfiguration {

}
