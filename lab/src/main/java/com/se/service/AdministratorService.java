package com.se.service;

import com.se.entity.Administrator;

import java.util.List;

public interface AdministratorService {
    List<Administrator> selectAllAdministrator();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR
     *
     * @mbg.generated Tue Oct 26 20:37:26 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR
     *
     * @mbg.generated Tue Oct 26 20:37:26 CST 2021
     */
    int insert(com.se.entity.Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR
     *
     * @mbg.generated Tue Oct 26 20:37:26 CST 2021
     */
    int insertSelective(com.se.entity.Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR
     *
     * @mbg.generated Tue Oct 26 20:37:26 CST 2021
     */
    com.se.entity.Administrator selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR
     *
     * @mbg.generated Tue Oct 26 20:37:26 CST 2021
     */
    int updateByPrimaryKeySelective(com.se.entity.Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADMINISTRATOR
     *
     * @mbg.generated Tue Oct 26 20:37:26 CST 2021
     */
    int updateByPrimaryKey(com.se.entity.Administrator record);
}