package com.alex.mybatis.model;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Role.id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Role.name
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Role.id
     *
     * @return the value of Role.id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Role.id
     *
     * @param id the value for Role.id
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Role.name
     *
     * @return the value of Role.name
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Role.name
     *
     * @param name the value for Role.name
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setName(String name) {
        this.name = name;
    }
}