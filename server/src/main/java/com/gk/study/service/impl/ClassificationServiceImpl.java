package com.gk.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.study.entity.Thing;
import com.gk.study.mapper.ClassificationMapper;
import com.gk.study.entity.Classification;
import com.gk.study.service.ClassificationService;
import com.gk.study.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationServiceImpl extends ServiceImpl<ClassificationMapper, Classification> implements ClassificationService {

    @Autowired
    ClassificationMapper mapper;

    @Override
    public List<Classification> getClassificationList() {
        return mapper.selectList(new QueryWrapper<>());
    }

    @Override
    public void createClassification(Classification classification) {
        System.out.println(classification);
        classification.setCreateTime(DateUtil.getCurrentDate());
        mapper.insert(classification);
    }

    @Override
    public void deleteClassification(String id) {
        mapper.deleteById(id);
    }

    @Override
    public void updateClassification(Classification classification) {
        mapper.updateById(classification);
    }

    @Override
    public Classification getClassificationById(String id) {
        return mapper.selectById(id);
    }
}
