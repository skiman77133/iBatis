package com.alex.mybatis.mapper;

import com.alex.mybatis.model.Role;
import com.alex.mybatis.model.RoleExample;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class RoleDAOImpl extends SqlMapClientDaoSupport implements RoleDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public RoleDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int countByExample(RoleExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("Role.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int deleteByExample(RoleExample example) {
        int rows = getSqlMapClientTemplate().delete("Role.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int deleteByPrimaryKey(Long id) {
        Role _key = new Role();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("Role.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long insert(Role record) {
        Object newKey = getSqlMapClientTemplate().insert("Role.insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long insertSelective(Role record) {
        Object newKey = getSqlMapClientTemplate().insert("Role.insertSelective", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    @SuppressWarnings("unchecked")
    public List<Role> selectByExample(RoleExample example) {
        List<Role> list = getSqlMapClientTemplate().queryForList("Role.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Role selectByPrimaryKey(Long id) {
        Role _key = new Role();
        _key.setId(id);
        Role record = (Role) getSqlMapClientTemplate().queryForObject("Role.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByExampleSelective(Role record, RoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("Role.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByExample(Role record, RoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("Role.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByPrimaryKeySelective(Role record) {
        int rows = getSqlMapClientTemplate().update("Role.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByPrimaryKey(Role record) {
        int rows = getSqlMapClientTemplate().update("Role.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Role
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected static class UpdateByExampleParms extends RoleExample {
        private Object record;

        public UpdateByExampleParms(Object record, RoleExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}