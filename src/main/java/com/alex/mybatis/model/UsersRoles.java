package com.alex.mybatis.model;

public class UsersRoles {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_roles.user_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private Long user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_roles.role_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private Long role_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_roles.user_id
     *
     * @return the value of users_roles.user_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_roles.user_id
     *
     * @param user_id the value for users_roles.user_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_roles.role_id
     *
     * @return the value of users_roles.role_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long getRole_id() {
        return role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_roles.role_id
     *
     * @param role_id the value for users_roles.role_id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
}