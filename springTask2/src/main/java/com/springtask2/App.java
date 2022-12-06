package com.springtask2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springtask2.repo.CustomerRepo;
import com.springtassk2.entity.Customer;

@Configuration
@ComponentScan
@PropertySource("classpath:db.properties")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        
        
    	CustomerRepo bean = context.getBean(CustomerRepo.class);
      
        // for inserting the data
        Customer c1=new Customer();
          c1.setCid(90);
          c1.setCname("dnyaneshwar");
         c1.setOid(15);
       
         System.out.println(bean.insert(c1));
          System.out.println("done");
          
//          
//          // for update name by using id...
//      	c1.setCname("nimay");
//      	c1.setCid(8);
//      	int chn = bean.change(c1);
//      	System.out.println(chn);
//      	
//      	
//      	// for delete any customer by their id
//     	  c1.setCid(28);
//          int result1 =bean.delete(c1);
//          System.out.println("deleted..........") ;
//      	
//      	
       	
         
        
        
      
    }
    
    @Value("${ds.driver}")
   	private String driver;
   	@Value("${ds.url}")
   	private String url;
   	@Value("${ds.username}")
   	private String user;
   	@Value("${ds.password}")
   	private String password;

   	@Bean
   	public DataSource dataSource() {
   		System.out.println("data source creating....");

   		DriverManagerDataSource ds = new DriverManagerDataSource();

   		ds.setDriverClassName(driver);
   		ds.setUrl(url);
   		ds.setUsername(user);
   		ds.setPassword(password);
   		return ds;

   	}

   @Bean
   	public JdbcTemplate template(DataSource ds) {
   		System.out.println("template creating....");
   		return new JdbcTemplate(ds);
   	}
       
     
}
