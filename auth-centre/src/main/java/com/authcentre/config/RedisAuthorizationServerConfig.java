package com.authcentre.config;

import com.authcentre.service.securityService.ClientDetailService;
import com.authcentre.service.securityService.CustomerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.DefaultAuthenticationKeyGenerator;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.sql.DataSource;

@Order(Integer.MIN_VALUE)
//@Configuration
public class RedisAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//    @Autowired
//    private DataSource dataSource;
//    @Autowired
//    private RedisConnectionFactory redisConnectionFactory;
//    @Autowired
//    private CustomerDetailService customerDetailService;
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//        security
//                .allowFormAuthenticationForClients()
//                .passwordEncoder(new BCryptPasswordEncoder())
//                .tokenKeyAccess("permitAll()")
//                .checkTokenAccess("isAuthenticated()");
//    }
//
//    //客户端配置
//    @Bean
//    public ClientDetailsService clientDetails() {
//        return new JdbcClientDetailsService(dataSource);
//    }
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        ClientDetailService clientDetailService = new ClientDetailService(dataSource);
////        clientDetailService.setSelectClientDetailsSql(" where client_id = ?");
////        clientDetailService.setFindClientDetailsSql(" order by client_id");
//        clients.withClientDetails(clientDetailService);
////        clients.jdbc(dataSource).clients(clientDetails());
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints.allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST)
//                .tokenStore(tokenStore())
//                // 必须指定，否则refresh_token会报错
//                .userDetailsService(customerDetailService)
//                .authenticationManager(authenticationManager)
//                //该字段设置设置refresh token是否重复使用,true:reuse;false:no reuse.
//                .reuseRefreshTokens(false);
//
//    }
//
//    @Bean
//    public TokenStore tokenStore(){
//        RedisTokenStore redisTokenStore =  new RedisTokenStore(redisConnectionFactory);
//        redisTokenStore.setPrefix("ouathStore:");
//        redisTokenStore.setAuthenticationKeyGenerator(new DefaultAuthenticationKeyGenerator(){
//            @Override
//            public String extractKey(OAuth2Authentication authentication) {
//                return super.extractKey(authentication) + ":" + "123";
//            }
//        });
//        return redisTokenStore;
//    }
}
