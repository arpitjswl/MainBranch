package com.synechron.insurance.Buy.Insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories(basePackages = "com.synechron.insurance.Buy.Insurance")
public class BuyInsuranceApplication {
	String basePackages = "com.synechron.insurance.Buy.Insurance";
	public static void main(String[] args) {
		SpringApplication.run(BuyInsuranceApplication.class, args);
		System.out.println("Application Starting point");
	}
	
	@Bean
	public Docket swaggerCustomization() {
		return new Docket(DocumentationType.SWAGGER_2).
				select().paths(PathSelectors.ant("/api/*")).apis(RequestHandlerSelectors.basePackage(basePackages)).
				build().apiInfo(getAppInfo());
						
	}
	
	private ApiInfo getAppInfo() {
		return new ApiInfo("Insurance Plan API", "Details of Insurance providers with available plans",
				"1.0.1", "Free to use", "Conatct", "API Licenec", "http://8090/");
	}
	
	
	/*
	 * @Bean public DataSource dataSource() { return new
	 * EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
	 * .addScript("data.sql").build(); }
	 */
	 
	/*
	 * @Bean public DataSource dataSource() { return new
	 * EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build(); }
	 * 
	 * @Bean public JpaVendorAdapter jpaVendorAdapter() { HibernateJpaVendorAdapter
	 * bean = new HibernateJpaVendorAdapter(); bean.setDatabase(Database.H2);
	 * bean.setGenerateDdl(true); bean.setShowSql(true); return bean; }
	 * 
	 * @Bean public LocalContainerEntityManagerFactoryBean
	 * entityManagerFactory(DataSource dataSource, JpaVendorAdapter
	 * jpaVendorAdapter) { LocalContainerEntityManagerFactoryBean bean = new
	 * LocalContainerEntityManagerFactoryBean(); bean.setDataSource(dataSource);
	 * bean.setJpaVendorAdapter(jpaVendorAdapter);
	 * bean.setPackagesToScan("com.synechron.insurance.Buy.Insurance"); return bean;
	 * }
	 * 
	 * @Bean public JpaTransactionManager transactionManager(EntityManagerFactory
	 * emf) { return new JpaTransactionManager(emf); }
	 */

}
