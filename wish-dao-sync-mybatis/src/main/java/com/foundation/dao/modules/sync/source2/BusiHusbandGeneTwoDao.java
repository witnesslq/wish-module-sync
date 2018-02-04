package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiHusbandGene;
import com.foundation.dao.modules.MybatisBaseDaoSync;

@MyBatisRepository
public interface BusiHusbandGeneTwoDao extends MybatisBaseDaoSync<String, BusiHusbandGene> {
}