package com.alex.mybatis.model;

public class RolesPrivileges {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles_privileges.role_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private Long role_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles_privileges.privilege_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private Long privilege_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles_privileges.role_id
     *
     * @return the value of roles_privileges.role_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long getRole_id() {
        return role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles_privileges.role_id
     *
     * @param role_id the value for roles_privileges.role_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles_privileges.privilege_id
     *
     * @return the value of roles_privileges.privilege_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long getPrivilege_id() {
        return privilege_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles_privileges.privilege_id
     *
     * @param privilege_id the value for roles_privileges.privilege_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setPrivilege_id(Long privilege_id) {
        this.privilege_id = privilege_id;
    }
}