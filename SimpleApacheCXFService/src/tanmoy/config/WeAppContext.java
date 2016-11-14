/*package tanmoy.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import service.AdditionService;
import service.AdditionServiceInterface;

@Configuration
@ComponentScan(basePackages = { "tanmoy" })
public class WeAppContext {

	@Autowired
	AdditionServiceInterface addserv;

	@Bean
	public AdditionServiceInterface additionService() {
		return new AdditionService();
	}

	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(addserv);
		endpoint.publish("/reportService");
		return endpoint;
	}
	
	//Require Spring Boot : http://stackoverflow.com/a/29059681/2054147
	@Bean
    public ServletRegistrationBean cxfServlet() {
        ServletRegistrationBean servlet = new ServletRegistrationBean(new CXFServlet(), "/services/*");
        servlet.setLoadOnStartup(1);
        return servlet;
    }
	
	
}
*/