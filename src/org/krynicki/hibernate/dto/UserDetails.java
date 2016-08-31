package org.krynicki.hibernate.dto;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by K on 2016-08-28.
 */

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue
    private int userId;

    @Basic
    @Column(name = "USER_NAME")
    private String userName;

    @Temporal(TemporalType.DATE)
    private Date joiningDate;



    private Address address;

    @Lob
    private String description;

    @Transient
    private String notToBeSaved;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNotToBeSaved() {
        return notToBeSaved;
    }

}
