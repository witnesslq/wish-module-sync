package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiExamValueB;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiExamValueBTwoDaoSync extends MybatisBaseDaoSync<String, BusiExamValueB> {
    BusiExamValueB selectByPrimaryKey(Map<String, Object> params);
}