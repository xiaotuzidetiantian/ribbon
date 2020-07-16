package com.wxf.sc.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wxf.sc.entity.Brand;
import com.wxf.sc.mapper.BrandMapper;
import com.wxf.sc.service.IBrandService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhuzhiguang
 * @since 2020-07-16
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
