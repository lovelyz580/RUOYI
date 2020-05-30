package com.ruoyi.project.lovelyz.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 test
 * 
 * @author ruoyi
 * @date 2020-05-30
 */
public class Test extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id  */
    private Long testId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String testName;

    /** 金额 */
    @Excel(name = "金额")
    private Long testMoney;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date testDate;

    public void setTestId(Long testId) 
    {
        this.testId = testId;
    }

    public Long getTestId() 
    {
        return testId;
    }
    public void setTestName(String testName) 
    {
        this.testName = testName;
    }

    public String getTestName() 
    {
        return testName;
    }
    public void setTestMoney(Long testMoney) 
    {
        this.testMoney = testMoney;
    }

    public Long getTestMoney() 
    {
        return testMoney;
    }
    public void setTestDate(Date testDate) 
    {
        this.testDate = testDate;
    }

    public Date getTestDate() 
    {
        return testDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("testId", getTestId())
            .append("testName", getTestName())
            .append("testMoney", getTestMoney())
            .append("testDate", getTestDate())
            .toString();
    }
}
