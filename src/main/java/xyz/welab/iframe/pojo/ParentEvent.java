package xyz.welab.iframe.pojo;

import java.util.Date;

public class ParentEvent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column parent_event.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column parent_event.parent_event
     *
     * @mbg.generated
     */
    private String parentEvent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column parent_event.parent_date
     *
     * @mbg.generated
     */
    private Date parentDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column parent_event.parent_id
     *
     * @return the value of parent_event.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column parent_event.parent_id
     *
     * @param parentId the value for parent_event.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column parent_event.parent_event
     *
     * @return the value of parent_event.parent_event
     *
     * @mbg.generated
     */
    public String getParentEvent() {
        return parentEvent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column parent_event.parent_event
     *
     * @param parentEvent the value for parent_event.parent_event
     *
     * @mbg.generated
     */
    public void setParentEvent(String parentEvent) {
        this.parentEvent = parentEvent == null ? null : parentEvent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column parent_event.parent_date
     *
     * @return the value of parent_event.parent_date
     *
     * @mbg.generated
     */
    public Date getParentDate() {
        return parentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column parent_event.parent_date
     *
     * @param parentDate the value for parent_event.parent_date
     *
     * @mbg.generated
     */
    public void setParentDate(Date parentDate) {
        this.parentDate = parentDate;
    }
}