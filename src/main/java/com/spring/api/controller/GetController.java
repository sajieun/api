package com.spring.api.controller;

import com.spring.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/get-api")
public class GetController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/name")
    public String getName(){
        return "Flature";
    }

//  PathVariable 방법 1
    @GetMapping("/variable/{variable}")
    public String getVariable(@PathVariable String variable){
        return variable;
    }

//    PathVariable 방법 2
//    {variable}이 이름을 정하면 무조건 맞춰줘야하는데 못 맞춰주는 경우 이렇게 하면 된다.
    @GetMapping("/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    @GetMapping("/request1")
    public String getRequestParam1(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String organization){
        return name + email + organization;
    }

    @GetMapping("/request2")
    public String getRequestParam2(@RequestParam Map<String,String> param){
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping("/request3")
    public String getRequestParam3(MemberDto memberDto){
        StringBuilder sb = new StringBuilder();
        return memberDto.toString();
    }
}
