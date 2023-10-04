package com.spring.api.controller;
import com.spring.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/put-api")
public class PutController {
    @PutMapping("/member")
    public String putMember(@RequestBody Map<String,Object> putData){
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey()+" : "+ map.getValue()+"\n");
        });
        return sb.toString();
    }

    @PutMapping("/member1")
    public String putMemberDto1(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    @PutMapping("/member2")
    public MemberDto putMemberDto2(@RequestBody MemberDto memberDto){
        return memberDto;
    }
}
