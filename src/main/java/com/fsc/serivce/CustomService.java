package com.fsc.serivce;

import com.fsc.dao.mapper.CustomMapper;
import com.fsc.dao.mapper.UserMapper;
import com.fsc.domain.bo.Custom;
import com.fsc.domain.bo.CustomExample;
import com.fsc.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomService {
    @Autowired
    private CustomMapper customMapper;

    public  PageBean getCustomList() {

        PageBean pager=new PageBean();
        CustomExample example=new CustomExample();
        List<Custom> list = customMapper.selectByExample(example);

        pager.setData(list);
        Long count=customMapper.countByExample(example);
        pager.setCount(count);
        pager.setCode(0);
        pager.setMsg("");
        return pager;
    }


}
