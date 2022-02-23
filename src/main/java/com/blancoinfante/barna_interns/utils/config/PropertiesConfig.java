package com.blancoinfante.barna_interns.utils.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;

import java.io.IOException;

@Configuration
public class PropertiesConfig {
    @Autowired
    private ResourceLoader resourceLoader;

    @Bean(name = "internshipQueries")
    public PropertiesFactoryBean internshipPropertyBean() throws IOException{
        PropertiesFactoryBean bean = new PropertiesFactoryBean();
        bean.setLocation(ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResource("classpath:/sql/internshipQueries.xml"));
        return bean;
    }
    @Bean(name = "studentQueries")
    public PropertiesFactoryBean studentPropertyBean() throws IOException{
        PropertiesFactoryBean bean = new PropertiesFactoryBean();
        bean.setLocation(ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResource("classpath:/sql/studentQueries.xml"));
        return bean;
    }
    @Bean(name = "companyQueries")
    public PropertiesFactoryBean companyPropertyBean() throws IOException{
        PropertiesFactoryBean bean = new PropertiesFactoryBean();
        bean.setLocation(ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResource("classpath:/sql/companyQueries.xml"));
        return bean;
    }
}
