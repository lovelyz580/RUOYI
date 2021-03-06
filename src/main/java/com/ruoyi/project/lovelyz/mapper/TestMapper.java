package com.ruoyi.project.lovelyz.mapper;

import com.ruoyi.project.lovelyz.domain.Test;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-05-30
 */
public interface TestMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param testId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Test selectTestById(Long testId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param test 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Test> selectTestList(Test test);

    /**
     * 新增【请填写功能名称】
     * 
     * @param test 【请填写功能名称】
     * @return 结果
     */
    public int insertTest(Test test);

    /**
     * 修改【请填写功能名称】
     * 
     * @param test 【请填写功能名称】
     * @return 结果
     */
    public int updateTest(Test test);

    /**
     * 删除【请填写功能名称】
     * 
     * @param testId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTestById(Long testId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param testIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestByIds(Long[] testIds);
}
