import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("app.properties")
//for autowiring
@ComponentScan({"com.pluralsight"})
public class AppConfig {
	
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}

	//@Bean(name="customerService")
	//public CustomerService getCustomerService(){
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		//CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		//return service;
	//}
	
	/*@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}*/
}
