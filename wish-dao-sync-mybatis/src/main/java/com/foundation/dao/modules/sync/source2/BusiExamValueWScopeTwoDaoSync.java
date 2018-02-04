package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiExamValueWScope;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiExamValueWScopeTwoDaoSync extends MybatisBaseDaoSync<String, BusiExamValueWScope> {
    BusiExamValueWScope selectByPrimaryKey(Map<String,Object> params);
    BusiExamValueWScope selectByPregnancyArchiveIdKey(Map<String,Object> params);

}