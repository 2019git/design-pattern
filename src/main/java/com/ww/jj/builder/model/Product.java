package com.ww.jj.builder.model;

import lombok.Builder;
import lombok.Data;

/**
 * 产品类
 * @author wangzhijun
 * @date 2021/5/8 13:57
 */
@Data
@Builder
public class Product {

    private String partA;

    private String partB;

    private String partC;
}
