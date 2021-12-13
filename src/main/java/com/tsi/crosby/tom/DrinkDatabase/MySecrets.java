package com.tsi.crosby.tom.DrinkDatabase;

import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.*;
import com.google.gson.Gson;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Base64;
public class MySecrets {

    private Gson gson = new Gson();

//    @Bean
//    public DataSource dataSource()
//    {
//        AWSsecrets dbCreds = getMySecret();
//        return DataSourceBuilder
//                .create()
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .url("jdbc:" + dbCreds.getEngine() + "://" + dbCreds.getHost() + ":" + dbCreds.getPort() + "/database-1")
//                .username(dbCreds.getUsername())
//                .password(dbCreds.getPassword())
//                .build();
//    }

//    @Bean
//    public JpaTransactionManager transactionManager(EntityManagerFactory emf)
//    {
//        return new JpaTransactionManager(emf);
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter()
//    {
//        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//        jpaVendorAdapter.setDatabase(org.springframework.orm.jpa.vendor.Database.MYSQL);
//        jpaVendorAdapter.setGenerateDdl(true);
//        return jpaVendorAdapter();
//    }
//
//    @Bean
//    LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()
//    {
//        LocalContainerEntityManagerFactoryBean lemfb = new LocalContainerEntityManagerFactoryBean();
//        lemfb.setDataSource(dataSource());
//        lemfb.setJpaVendorAdapter(jpaVendorAdapter());
//        lemfb.setPackagesToScan("com.spring.data.model");
//        return lemfb;
//    }

//    private AWSsecrets getMySecret() {
//
//        String secretName = "arn:aws:secretsmanager:eu-west-2:367340479782:secret:DB-TasN0i";
//        String region = "eu-west-2";
//
//        // Create a Secrets Manager client
//        AWSSecretsManager client  = AWSSecretsManagerClientBuilder.standard()
//                .withRegion(region)
//                .build();
//
//        String secret, decodedBinarySecret;
//        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest()
//                .withSecretId(secretName);
//        GetSecretValueResult getSecretValueResult = null;
//
//        try {
//            getSecretValueResult = client.getSecretValue(getSecretValueRequest);
//        } catch (Exception e) {
//            // Secrets Manager can't decrypt the protected secret text using the provided KMS key.
//            // Deal with the exception here, and/or rethrow at your discretion.
//            throw e;
//        }
//
//        if (getSecretValueResult.getSecretString() != null) {
//            secret = getSecretValueResult.getSecretString();
//            return gson.fromJson(secret, AWSsecrets.class);
//        }
//        return null;
//    }
}

