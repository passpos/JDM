package jdm.mybatis.generator.entity;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles.id
     *
     * @mbg.generated Fri Sep 25 03:03:47 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roles.role_name
     *
     * @mbg.generated Fri Sep 25 03:03:47 CST 2020
     */
    private String roleName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles.id
     *
     * @return the value of roles.id
     *
     * @mbg.generated Fri Sep 25 03:03:47 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles.id
     *
     * @param id the value for roles.id
     *
     * @mbg.generated Fri Sep 25 03:03:47 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roles.role_name
     *
     * @return the value of roles.role_name
     *
     * @mbg.generated Fri Sep 25 03:03:47 CST 2020
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roles.role_name
     *
     * @param roleName the value for roles.role_name
     *
     * @mbg.generated Fri Sep 25 03:03:47 CST 2020
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}