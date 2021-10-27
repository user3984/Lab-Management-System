package com.se.service;

import com.se.entity.Lab;
import com.se.entity.LabKey;
import com.se.mapper.LabMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabServiceImpl implements LabService{
    @Autowired
    private LabMapper labMapper;
    @Override
    public int deleteByPrimaryKey(LabKey key) {
        return labMapper.deleteByPrimaryKey(key);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public int insert(Lab record) {
        return labMapper.insert(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public int insertSelective(Lab record) {
        return labMapper.insertSelective(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public Lab selectByPrimaryKey(LabKey key) {
        return labMapper.selectByPrimaryKey(key);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public int updateByPrimaryKeySelective(Lab record) {
        return labMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public int updateByPrimaryKey(Lab record) {
        return labMapper.updateByPrimaryKey(record);
    }
}