package com.example.testresultdata.controller;

import com.example.testresultdata.code.BaseResponseCode;
import com.example.testresultdata.code.ResponseCodeInterface;
import com.example.testresultdata.entity.User;
import com.example.testresultdata.utils.DataResult;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestDataController {

    @PutMapping("/hello")
    public DataResult<String> test(HttpServletRequest request){
        //User user=new User();
        //DataResult result = DataResult.success();
        DataResult result= new DataResult(BaseResponseCode.DATA_ERROR);

        return result;
    }
    @GetMapping("/hellouser")
    public DataResult<String> hellouser(HttpServletRequest request){
        User user=new User();
        user.setId(1);
        user.setName("lizhonghua");
        user.setPassword("123");
        DataResult result= new DataResult(BaseResponseCode.SUCCESS,user);
        return result;
    }
    @PostMapping("/hellouser2")
    public DataResult<String> hellouser2(HttpServletRequest request){
        User user=new User();
        user.setId(2);
        user.setName("lizhonghua2");
        user.setPassword("123");
        DataResult result = DataResult.success();
        result.setData(user);
       // System.out.println(result.getData()+result.getMsg());
        //DataResult result= new DataResult(BaseResponseCode.SUCCESS,user);
        return result;
    }
}
