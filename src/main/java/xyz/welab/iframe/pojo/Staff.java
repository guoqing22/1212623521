package xyz.welab.iframe.pojo;

public class Staff {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.staff_id
     *
     * @mbg.generated
     */
    private Integer staffId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff.staff_password
     *
     * @mbg.generated
     */
    private String staffPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.staff_id
     *
     * @return the value of staff.staff_id
     *
     * @mbg.generated
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.staff_id
     *
     * @param staffId the value for staff.staff_id
     *
     * @mbg.generated
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff.staff_password
     *
     * @return the value of staff.staff_password
     *
     * @mbg.generated
     */
    public String getStaffPassword() {
        return staffPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff.staff_password
     *
     * @param staffPassword the value for staff.staff_password
     *
     * @mbg.generated
     */
    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword == null ? null : staffPassword.trim();
    }
}