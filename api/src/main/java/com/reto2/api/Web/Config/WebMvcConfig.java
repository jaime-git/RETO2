package com.reto2.api.Web.Config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
@ComponentScan("com.reto2.orms.Web.API")
    public class WebMvcConfig implements WebMvcConfigurer{
        
        //GUARDAN EL ULTIMO IDIOMA ELEGIDO POR EL USUARIO
        @Bean
        public LocaleResolver localeResolver() {
            return new CookieLocaleResolver();
        }

        //GUARDAN EL ULTIMO IDIOMA ELEGIDO POR EL USUARIO
        @Bean
        public LocaleChangeInterceptor localeInterceptor(){
            LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
            localeInterceptor.setParamName("lang");
            return localeInterceptor;
        }

        @Bean(name = "messageSource")
        public MessageSource getMessageResource(){
            ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();

            messageResource.setBasename("classpath:i18n/messages");
            messageResource.setDefaultEncoding("UTF-8");
            return messageResource;
        }
        

        @Override
        public void addInterceptors(InterceptorRegistry registry){
            registry.addInterceptor(localeInterceptor());
        }

    }


