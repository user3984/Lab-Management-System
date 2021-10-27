package com.se.service;

import com.se.mapper.AdministratorAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorAccountServiceImpl implements AdministratorAccountService{
    @Autowired
    private AdministratorAccountMapper administratorAccountMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return administratorAccountMapper.deleteByPrimaryKey(id);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public int insert(com.se.entity.AdministratorAccount record) {
        return administratorAccountMapper.insert(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public int insertSelective(com.se.entity.AdministratorAccount record) {
        return administratorAccountMapper.insertSelective(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public com.se.entity.AdministratorAccount selectByPrimaryKey(String id) {
        return administratorAccountMapper.selectByPrimaryKey(id);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public int updateByPrimaryKeySelective(com.se.entity.AdministratorAccount record) {
        return administratorAccountMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    @Override
    public int updateByPrimaryKey(com.se.entity.AdministratorAccount record) {
        return administratorAccountMapper.updateByPrimaryKey(record);
    }

}
