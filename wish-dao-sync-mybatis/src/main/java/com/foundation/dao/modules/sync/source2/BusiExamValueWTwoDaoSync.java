package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiExamValueW;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiExamValueWTwoDaoSync extends MybatisBaseDaoSync<String, BusiExamValueW> {

    BusiExamValueW selectByPrimaryKey(Map<String, Object> params);
}