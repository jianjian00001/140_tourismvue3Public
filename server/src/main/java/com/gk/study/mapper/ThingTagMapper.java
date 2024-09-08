package com.gk.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gk.study.entity.ThingTag;
import com.gk.study.entity.ThingTagVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ThingTagMapper extends BaseMapper<ThingTag> {
    public List<ThingTagVo> qryThingTagByThingId(Long id );
}
