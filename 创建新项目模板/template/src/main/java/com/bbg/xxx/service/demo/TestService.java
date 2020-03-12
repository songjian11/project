package com.bbg.xxx.service.demo;

import com.bbg.xxx.bo.request.demo.TestPageRequest;
import com.bbg.xxx.bo.response.demo.TestResponse;
import com.bbg.xxx.common.PageLayuiInfo;

import java.util.List;

public interface TestService {
    String test();

    List<TestResponse> query() throws Exception;

    PageLayuiInfo page(TestPageRequest request) throws Exception;
}
