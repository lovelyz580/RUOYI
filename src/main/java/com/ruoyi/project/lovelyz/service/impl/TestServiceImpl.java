package com.ruoyi.project.lovelyz.service.impl;

import java.util.List;

import com.ruoyi.project.lovelyz.domain.Test;
import com.ruoyi.project.lovelyz.mapper.TestMapper;
import com.ruoyi.project.lovelyz.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-05-30
 */
@Service
public class TestServiceImpl implements ITestService
{
    @Autowired
    private TestMapper testMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param testId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Test selectTestById(Long testId)
    {
        return testMapper.selectTestById(testId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param test 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Test> selectTestList(Test test)
    {
        return testMapper.selectTestList(test);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param test 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTest(Test test)
    {
        return testMapper.insertTest(test);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param test 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTest(Test test)
    {
        return testMapper.updateTest(test);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param testIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTestByIds(Long[] testIds)
    {
        return testMapper.deleteTestByIds(testIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param testId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTestById(Long testId)
    {
        return testMapper.deleteTestById(testId);
    }

    @Override
    // 使用 @Transactional 注解的 rollbackFor 属性，指定特定异常时，触发回滚
    @Transactional(rollbackFor = Exception.class)
    public int test(Test test){
        System.out.println("测试事务");
        return 0;
    }
}
