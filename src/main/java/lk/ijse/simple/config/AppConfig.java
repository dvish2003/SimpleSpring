package lk.ijse.simple.config;

import lk.ijse.simple.bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Author: vishmee
 * Date: 1/23/25
 * Time: 9:15 AM
 * Description:
 */
@Configuration
@ComponentScan(basePackages = "lk.ijse.simple.bean")
public class AppConfig {
/*
    @Bean
*/
/*
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  // illalana illanal waraya gane object ekak create krl denw
*/
/*
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)  //mehidi destroy ,ethod ek call wei
*/
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MyConnection getConnection(){
        return new MyConnection();
    }
}
