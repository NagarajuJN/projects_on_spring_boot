package com.firstSpringApp;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

public class ClassPathXmlApplicationContext implements ApplicationContext {

	public Environment getEnvironment() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsBeanDefinition(String beanName) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getBeanDefinitionCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] getBeanDefinitionNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getBeanNamesForType(ResolvableType type) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getBeanNamesForType(ResolvableType type, boolean includeNonSingletons, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getBeanNamesForType(Class<?> type) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getBeanNamesForType(Class<?> type, boolean includeNonSingletons, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> Map<String, T> getBeansOfType(Class<T> type, boolean includeNonSingletons, boolean allowEagerInit)
			throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType)
			throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType)
			throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return null;
	}

	public <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType,
			boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return null;
	}

	public <A extends Annotation> Set<A> findAllAnnotationsOnBean(String beanName, Class<A> annotationType,
			boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBean(String name) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getBean(String name, Object... args) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getBean(Class<T> requiredType) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getBean(Class<T> requiredType, Object... args) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsBean(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return false;
	}

	public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<?> getType(String name, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getAliases(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public BeanFactory getParentBeanFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsLocalBean(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException {
		// TODO Auto-generated method stub
		return null;
	}

	public void publishEvent(Object event) {
		// TODO Auto-generated method stub

	}

	public Resource[] getResources(String locationPattern) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Resource getResource(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	public ClassLoader getClassLoader() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getApplicationName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getStartupDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ApplicationContext getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	public AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
