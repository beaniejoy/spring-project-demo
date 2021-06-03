# MyBatis (XML 매핑방식)

```properties
mybatis.type-aliases-package=io.beaniejoy.bootapiserver.mapper
mybatis.mapper-locations=/mappers/**/*.xml
```

````java
@Configuration
@MapperScan(basePackages = "io.beaniejoy.bootapiserver.mapper")
@PropertySource("classpath:/application.properties")
public class MyBatisConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/**/*.xml")
        );

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
````