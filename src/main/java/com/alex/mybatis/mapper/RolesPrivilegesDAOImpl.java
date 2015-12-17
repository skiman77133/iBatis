package com.alex.mybatis.mapper;

import com.alex.mybatis.model.RolesPrivileges;
import com.alex.mybatis.model.RolesPrivilegesExample;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class RolesPrivilegesDAOImpl extends SqlMapClientDaoSupport implements RolesPrivilegesDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public RolesPrivilegesDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int countByExample(RolesPrivilegesExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("roles_privileges.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int deleteByExample(RolesPrivilegesExample example) {
        int rows = getSqlMapClientTemplate().delete("roles_privileges.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void insert(RolesPrivileges record) {
        getSqlMapClientTemplate().insert("roles_privileges.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void insertSelective(RolesPrivileges record) {
        getSqlMapClientTemplate().insert("roles_privileges.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    @SuppressWarnings("unchecked")
    public List<RolesPrivileges> selectByExample(RolesPrivilegesExample example) {
        List<RolesPrivileges> list = getSqlMapClientTemplate().queryForList("roles_privileges.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByExampleSelective(RolesPrivileges record, RolesPrivilegesExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("roles_privileges.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public int updateByExample(RolesPrivileges record, RolesPrivilegesExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("roles_privileges.updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected static class UpdateByExampleParms extends RolesPrivilegesExample {
        private Object record;

        public UpdateByExampleParms(Object record, RolesPrivilegesExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}