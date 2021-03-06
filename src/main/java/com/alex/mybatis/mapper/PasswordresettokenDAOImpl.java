package com.alex.mybatis.mapper;

import com.alex.mybatis.model.Passwordresettoken;
import com.alex.mybatis.model.PasswordresettokenExample;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class PasswordresettokenDAOImpl extends SqlMapClientDaoSupport implements PasswordresettokenDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public PasswordresettokenDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int countByExample(PasswordresettokenExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("PasswordResetToken.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int deleteByExample(PasswordresettokenExample example) {
        int rows = getSqlMapClientTemplate().delete("PasswordResetToken.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int deleteByPrimaryKey(Long id) {
        Passwordresettoken _key = new Passwordresettoken();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("PasswordResetToken.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long insert(Passwordresettoken record) {
        Object newKey = getSqlMapClientTemplate().insert("PasswordResetToken.insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long insertSelective(Passwordresettoken record) {
        Object newKey = getSqlMapClientTemplate().insert("PasswordResetToken.insertSelective", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    @SuppressWarnings("unchecked")
    public List<Passwordresettoken> selectByExample(PasswordresettokenExample example) {
        List<Passwordresettoken> list = getSqlMapClientTemplate().queryForList("PasswordResetToken.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Passwordresettoken selectByPrimaryKey(Long id) {
        Passwordresettoken _key = new Passwordresettoken();
        _key.setId(id);
        Passwordresettoken record = (Passwordresettoken) getSqlMapClientTemplate().queryForObject("PasswordResetToken.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByExampleSelective(Passwordresettoken record, PasswordresettokenExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("PasswordResetToken.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByExample(Passwordresettoken record, PasswordresettokenExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("PasswordResetToken.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByPrimaryKeySelective(Passwordresettoken record) {
        int rows = getSqlMapClientTemplate().update("PasswordResetToken.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByPrimaryKey(Passwordresettoken record) {
        int rows = getSqlMapClientTemplate().update("PasswordResetToken.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PasswordResetToken
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected static class UpdateByExampleParms extends PasswordresettokenExample {
        private Object record;

        public UpdateByExampleParms(Object record, PasswordresettokenExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}