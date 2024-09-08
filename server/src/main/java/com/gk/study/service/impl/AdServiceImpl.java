package com.gk.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.study.mapper.AdMapper;
import com.gk.study.service.AdService;
import com.gk.study.entity.Ad;
import com.gk.study.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements AdService {
    @Autowired
    AdMapper mapper;

    @Override
    public List<Ad> getAdList() {
        return mapper.selectList(new QueryWrapper<>());
    }

    @Override
    public void createAd(Ad ad) {
        System.out.println(ad);
        ad.setCreateTime(DateUtil.getCurrentDate());
        mapper.insert(ad);
    }

    @Override
    public void deleteAd(String id) {
        mapper.deleteById(id);
    }

    @Override
    public void updateAd(Ad ad) {
        mapper.updateById(ad);
    }
}
