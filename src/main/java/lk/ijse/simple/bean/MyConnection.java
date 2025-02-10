package lk.ijse.simple.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Author: vishmee
 * Date: 1/23/25
 * Time: 9:22 AM
 * Description:
 */
public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,DisposableBean {


    @Override
    public void setBeanName(String name) {
        System.out.println("MyConnection BeanNameAware SetName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection BeanNameAware SetBeanFactoryAware");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection destroyed");
    }

    public MyConnection() {
        System.out.println("MyConnection created...");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection BeanNameAware SetAfterProperty");
    }




    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection BeanNameAware SetApplicationContext");
    }


}
