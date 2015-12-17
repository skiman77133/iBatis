package com.alex.mybatis.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RolesPrivilegesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public RolesPrivilegesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected RolesPrivilegesExample(RolesPrivilegesExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table roles_privileges
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andRole_idIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRole_idEqualTo(Long value) {
            addCriterion("role_id =", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotEqualTo(Long value) {
            addCriterion("role_id <>", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThan(Long value) {
            addCriterion("role_id >", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThanOrEqualTo(Long value) {
            addCriterion("role_id >=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThan(Long value) {
            addCriterion("role_id <", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThanOrEqualTo(Long value) {
            addCriterion("role_id <=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idIn(List<Long> values) {
            addCriterion("role_id in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotIn(List<Long> values) {
            addCriterion("role_id not in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idBetween(Long value1, Long value2) {
            addCriterion("role_id between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotBetween(Long value1, Long value2) {
            addCriterion("role_id not between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idIsNull() {
            addCriterion("privilege_id is null");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idIsNotNull() {
            addCriterion("privilege_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idEqualTo(Long value) {
            addCriterion("privilege_id =", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idNotEqualTo(Long value) {
            addCriterion("privilege_id <>", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idGreaterThan(Long value) {
            addCriterion("privilege_id >", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idGreaterThanOrEqualTo(Long value) {
            addCriterion("privilege_id >=", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idLessThan(Long value) {
            addCriterion("privilege_id <", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idLessThanOrEqualTo(Long value) {
            addCriterion("privilege_id <=", value, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idIn(List<Long> values) {
            addCriterion("privilege_id in", values, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idNotIn(List<Long> values) {
            addCriterion("privilege_id not in", values, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idBetween(Long value1, Long value2) {
            addCriterion("privilege_id between", value1, value2, "privilege_id");
            return (Criteria) this;
        }

        public Criteria andPrivilege_idNotBetween(Long value1, Long value2) {
            addCriterion("privilege_id not between", value1, value2, "privilege_id");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table roles_privileges
     *
     * @mbggenerated do_not_delete_during_merge Wed Dec 16 13:41:24 GMT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}