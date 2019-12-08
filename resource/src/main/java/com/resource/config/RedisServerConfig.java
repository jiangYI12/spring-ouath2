package com.resource.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.web.client.RestTemplate;

//@Configuration
public class RedisServerConfig extends ResourceServerConfigurerAdapter {
//    /**    RemoteTokenServices是用于向远程认证服务器验证token，同时获取token对应的用户的信息
//     RemoteTokenServices会通过RestTemplate调用远程服务，我们在使用这个类时，要设置checkTokenEndpointUrl、clientId、clientSecret等。
//     **/
//    protected RemoteTokenServices remoteTokenServices;
//    @Autowired
//    private RestTemplate restTemplate;
//
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) {
//        remoteTokenServices = new RemoteTokenServices();
//        DefaultAccessTokenConverter accessTokenConverter = new DefaultAccessTokenConverter();
//        remoteTokenServices.setCheckTokenEndpointUrl("http://auth/oauth/check_token");
////        UserAuthenticationConverter userTokenConverter = new PigxUserAuthenticationConverter();
////        accessTokenConverter.setUserTokenConverter(userTokenConverter);
//        remoteTokenServices.setClientId("account");
//        remoteTokenServices.setClientSecret("sdad23307216");
//        remoteTokenServices.setRestTemplate(restTemplate);
//        remoteTokenServices.setAccessTokenConverter(accessTokenConverter);
//        resources.tokenServices(remoteTokenServices);
//    }
}
