package com.alex.mybatis.model;

import java.util.Date;

public class PersistentLogins {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column persistent_logins.series
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private String series;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column persistent_logins.username
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column persistent_logins.token
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column persistent_logins.last_used
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    private Date last_used;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column persistent_logins.series
     *
     * @return the value of persistent_logins.series
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public String getSeries() {
        return series;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column persistent_logins.series
     *
     * @param series the value for persistent_logins.series
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column persistent_logins.username
     *
     * @return the value of persistent_logins.username
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column persistent_logins.username
     *
     * @param username the value for persistent_logins.username
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column persistent_logins.token
     *
     * @return the value of persistent_logins.token
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column persistent_logins.token
     *
     * @param token the value for persistent_logins.token
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column persistent_logins.last_used
     *
     * @return the value of persistent_logins.last_used
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public Date getLast_used() {
        return last_used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column persistent_logins.last_used
     *
     * @param last_used the value for persistent_logins.last_used
     *
     * @mbggenerated Wed Dec 16 13:41:24 GMT 2015
     */
    public void setLast_used(Date last_used) {
        this.last_used = last_used;
    }
}