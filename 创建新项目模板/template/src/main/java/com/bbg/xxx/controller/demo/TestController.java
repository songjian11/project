package com.bbg.xxx.controller.demo;

import com.bbg.xxx.bo.request.demo.*;
import com.bbg.xxx.bo.response.demo.TestResponse;
import com.bbg.xxx.common.DataHandler;
import com.bbg.xxx.common.PageLayuiInfo;
import com.bbg.xxx.common.ResponseResult;
import com.bbg.xxx.service.demo.TestService;
import com.bbg.xxx.utils.StringUtils;
import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Api(value = "test", tags = { "demo用例" })
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;

    @ApiOperation(value = "測試1", notes = "測試1")
    @GetMapping("/isok")
    public String test(HttpServletRequest request){
        return testService.test();
    }

    @ApiOperation(value = "測試2", notes = "測試2")
    @GetMapping("/query")
    public ResponseResult<List<TestResponse>> query() throws Exception {
        List<TestResponse> list = testService.query();
        ResponseResult responseResult = DataHandler.jsonResult(list);
        return responseResult;
    }

    @ApiOperation(value = "測試3", notes = "測試3")
    @PostMapping("/print")
    public ResponseResult<TestResponse> print(@RequestBody @ApiParam(value = "測試3", required = true, name = "param")
                                              TestRequest param){
        TestResponse response = new TestResponse();
        BeanUtils.copyProperties(param, response);
        ResponseResult responseResult = DataHandler.jsonResult(response);
        return responseResult;
    }

    @ApiOperation(value = "測試4", notes = "測試4")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "name", value = "名稱", required = true, dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "age", value = "年齡", required = true, dataType = "int"),
            @ApiImplicitParam(paramType = "query", name = "sex", value = "性別(1-男，2-女)", required = true, dataType = "byte")})
    @GetMapping("/say")
    public ResponseResult<TestResponse> say(String name,int age,byte sex){
        TestResponse testResponse = new TestResponse();
        testResponse.setName(name);
        testResponse.setSex(sex);
        testResponse.setAge(age);
        ResponseResult responseResult = DataHandler.jsonResult(testResponse);
        return responseResult;
    }

    @ApiOperation(value = "測試5", notes = "測試5")
    @PostMapping("/page")
    public ResponseResult<List<TestPageRequest>> page(@RequestBody @ApiParam(value = "測試5", required = true, name = "param") TestPageRequest param) throws Exception {
        PageLayuiInfo pageLayuiInfo = testService.page(param);
        return DataHandler.jsonResult(pageLayuiInfo);
    }

    @ApiOperation(value = "測試6", notes = "測試6")
    @PostMapping("/list")
    public ResponseResult<List> list(@RequestBody @ApiParam(value = "測試6", required = true, name = "param") TestListRequest param){
        return DataHandler.jsonResult(param);
    }


//    @GetMapping("/hystrix")
//    public String hystrixTest(){
//        return testFeignService.test();
//    }

    public static void main(String[] args) {
        System.out.println(StringUtils.equals("null", "null"));
    }
}
