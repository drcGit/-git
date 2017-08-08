package com.stylefeng.guns.common.constant.dictmap;

import com.stylefeng.guns.common.constant.dictmap.base.AbstractDictMap;

public class OrdersDict extends AbstractDictMap {

    @Override
    public void init() {
        put("id", "主键");
        put("name", "名称");
    }

    @Override
    protected void initBeWrapped() {
       /* putFieldWrapperMethodName("id", "getId");
        putFieldWrapperMethodName("name", "getName");*/
    }
}