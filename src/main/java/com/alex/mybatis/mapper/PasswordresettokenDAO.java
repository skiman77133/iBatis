package com.alex.mybatis.mapper;

import com.alex.mybatis.model.Passwordresettoken;
import com.alex.mybatis.model.PasswordresettokenExample;
import java.util.List;

public interface PasswordresettokenDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    int countByExample(PasswordresettokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    int deleteByExample(PasswordresettokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    Long insert(Passwordresettoken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    Long insertSelective(Passwordresettoken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    List<Passwordresettoken> selectByExample(PasswordresettokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    Passwordresettoken selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    int updateByExampleSelective(Passwordresettoken record, PasswordresettokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    int updateByExample(Passwordresettoken record, PasswordresettokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    int updateByPrimaryKeySelective(Passwordresettoken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    int updateByPrimaryKey(Passwordresettoken record);
}