package xyz.welab.iframe.pojo;

import java.util.Date;

public class StudentEvent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_event.student_id
     *
     * @mbg.generated
     */
    private Integer studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_event.student_event
     *
     * @mbg.generated
     */
    private String studentEvent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_event.student_date
     *
     * @mbg.generated
     */
    private Date studentDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_event.student_id
     *
     * @return the value of student_event.student_id
     *
     * @mbg.generated
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_event.student_id
     *
     * @param studentId the value for student_event.student_id
     *
     * @mbg.generated
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_event.student_event
     *
     * @return the value of student_event.student_event
     *
     * @mbg.generated
     */
    public String getStudentEvent() {
        return studentEvent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_event.student_event
     *
     * @param studentEvent the value for student_event.student_event
     *
     * @mbg.generated
     */
    public void setStudentEvent(String studentEvent) {
        this.studentEvent = studentEvent == null ? null : studentEvent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_event.student_date
     *
     * @return the value of student_event.student_date
     *
     * @mbg.generated
     */
    public Date getStudentDate() {
        return studentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_event.student_date
     *
     * @param studentDate the value for student_event.student_date
     *
     * @mbg.generated
     */
    public void setStudentDate(Date studentDate) {
        this.studentDate = studentDate;
    }
}