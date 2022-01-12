package booking.api;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class PersistenceJPAConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
//		dataSource.setUrl("jdbc:derby:memory:vac_booking;create=true");
		dataSource.setUrl("jdbc:derby://localhost/vac_booking;create=true");
		return dataSource;
	}

}
