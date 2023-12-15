package org.jsp.emp.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "org.jsp.emp")
public class MyConfig {

}

