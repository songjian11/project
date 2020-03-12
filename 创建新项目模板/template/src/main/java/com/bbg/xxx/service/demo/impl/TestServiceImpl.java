package com.bbg.xxx.service.demo.impl;

import com.bbg.xxx.bo.request.demo.TestPageRequest;
import com.bbg.xxx.bo.response.demo.TestResponse;
import com.bbg.xxx.common.PageLayuiInfo;
import com.bbg.xxx.dao.demo.TestDao;
import com.bbg.xxx.po.demo.Test;
import com.bbg.xxx.service.demo.TestService;
import com.bbg.xxx.utils.Po2BoUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDao testDao;

    @Override
    public String test() {
        return "hello world!";
    }

    @Override
    public List<TestResponse> query() throws Exception {
        List<Test> list = testDao.query();
        return Po2BoUtil.listTransform(list, TestResponse.class);
    }

    @Override
    public PageLayuiInfo page(TestPageRequest request) throws Exception {
        Page page = PageHelper.startPage(request);
        List<Test> list = testDao.query();
        return PageLayuiInfo.setPage(Po2BoUtil.listTransform(list, TestResponse.class), page);
    }
}
