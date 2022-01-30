package com.edu.controller;


import com.edu.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "/default")
@DefaultProperties(defaultFallback = "fallback")
public class DefaultController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;


    public User fallback(){
        User user = new User();
        user.setName("宕机啦,不能提供服务");
        return user;
    }


    /****
     * 在 user-consumer 服务中通过 RestTemplate 调用 user-provider 服务
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    @HystrixCommand
    public User queryById(@PathVariable(value = "id")Integer id){
//        String url = "http://localhost:18081/user/find/"+id;
//        List<ServiceInstance> list = discoveryClient.getInstances("user-provider");
//        ServiceInstance serviceInstance = list.get(0);
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/find/" + id;
//        return restTemplate.getForObject(url,User.class);


        String url = "http://user-provider/user/find/"+id;
        return restTemplate.getForObject(url,User.class);

    }
}
